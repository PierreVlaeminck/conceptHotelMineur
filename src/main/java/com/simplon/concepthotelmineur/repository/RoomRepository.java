package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.entity.Room;
import com.simplon.concepthotelmineur.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for managing Room entities.
 */
@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    /**
     * Retrieves a list of rooms of the specified type.
     *
     * @param type the type of room
     * @return a list of rooms of the specified type
     */
    List<Room> findRoomByType(Type type);

    /**
     * Retrieves a list of rooms associated with the specified hostel.
     *
     * @param hostel the hostel object
     * @return a list of rooms associated with the specified hostel
     */
    List<Room> findRoomByHostel(Hostel hostel);
}