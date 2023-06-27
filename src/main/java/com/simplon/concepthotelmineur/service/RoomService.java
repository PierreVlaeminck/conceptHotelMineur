package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.repository.RoomRepository;
import com.simplon.concepthotelmineur.entity.Room;
import com.simplon.concepthotelmineur.entity.Type;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    public Room getRoomByType(Type type){
        return roomRepository.findRoomByType(type);
    }
}
