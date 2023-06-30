package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.entity.Type;
import com.simplon.concepthotelmineur.repository.RoomRepository;
import com.simplon.concepthotelmineur.entity.Room;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    public Room findRoomById(Room room){
        return roomRepository.save(room);
    }

    public List<Room> findRoomByType(Type type) {
        return roomRepository.findRoomByType(type);
    }

    public List<Room> findRoomByHostel(Hostel hostel) {
        return roomRepository.findRoomByHostel(hostel);
    }
}
