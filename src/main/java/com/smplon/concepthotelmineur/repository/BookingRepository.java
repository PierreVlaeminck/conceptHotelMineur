package com.smplon.concepthotelmineur.repository;

import com.smplon.concepthotelmineur.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
