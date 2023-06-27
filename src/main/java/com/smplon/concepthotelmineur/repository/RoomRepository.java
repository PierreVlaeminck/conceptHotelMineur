package com.smplon.concepthotelmineur.repository;

import com.smplon.concepthotelmineur.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
