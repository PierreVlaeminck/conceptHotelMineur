package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Booking;
import com.simplon.concepthotelmineur.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for managing Booking entities.
 */
@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    /**
     * Retrieves a list of bookings associated with a specific user profile.
     *
     * @param userProfile the user profile
     * @return a list of bookings associated with the user profile
     */
    List<Booking> getBookingByUserProfile(UserProfile userProfile);
}