package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Booking;
import com.simplon.concepthotelmineur.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    void deleteByIdB(Long idB);

    List<Booking> getBookingByUserProfile(UserProfile userProfile);
}
