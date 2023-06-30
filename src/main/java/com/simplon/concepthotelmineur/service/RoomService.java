package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.entity.Type;
import com.simplon.concepthotelmineur.repository.RoomRepository;
import com.simplon.concepthotelmineur.entity.Room;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing Room entities.
 */
@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    /**
     * Finds a room by its ID.
     *
     * @param room the room object
     * @return the found room
     */
    public Room findRoomById(Room room){
        return roomRepository.save(room);
    }

    /**
     * Retrieves a list of rooms based on the specified type.
     *
     * @param type the type of the room
     * @return a list of rooms of the specified type
     */
    public List<Room> findRoomByType(Type type) {
        return roomRepository.findRoomByType(type);
    }

    /**
     * Retrieves a list of rooms associated with the specified hostel.
     *
     * @param hostel the hostel object
     * @return a list of rooms associated with the specified hostel
     */
    public List<Room> findRoomByHostel(Hostel hostel) {
        return roomRepository.findRoomByHostel(hostel);
    }
}
