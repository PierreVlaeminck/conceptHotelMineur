package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.repository.RoomRepository;
import com.simplon.concepthotelmineur.entity.Room;
import com.simplon.concepthotelmineur.entity.Type;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    public List<Room> findRoomByType(Type type) {
        return roomRepository.findRoomByType(type);
    }

    public List<Room> findRoomByHostel(Hostel hostel) {
        return roomRepository.findRoomByHostel(hostel);
    }
}
