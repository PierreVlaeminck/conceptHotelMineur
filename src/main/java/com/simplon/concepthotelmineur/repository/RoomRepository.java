package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Room;
import com.simplon.concepthotelmineur.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    Room findRoomByType(Type type);
}
