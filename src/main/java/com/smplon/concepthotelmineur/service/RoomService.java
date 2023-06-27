package com.smplon.concepthotelmineur.service;

import com.smplon.concepthotelmineur.entity.Room;
import com.smplon.concepthotelmineur.entity.Type;
import com.smplon.concepthotelmineur.repository.RoomRepository;
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
