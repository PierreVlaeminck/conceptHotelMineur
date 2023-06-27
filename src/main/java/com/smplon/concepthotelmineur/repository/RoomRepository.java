package com.smplon.concepthotelmineur.repository;

import com.smplon.concepthotelmineur.entity.Room;
import com.smplon.concepthotelmineur.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    Room findRoomByType(Type type);
}
