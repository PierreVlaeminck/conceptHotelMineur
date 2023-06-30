package com.simplon.concepthotelmineur.repository;

import com.simplon.concepthotelmineur.entity.Booking;
import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.entity.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for managing Reviews entities.
 */
@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Long> {

    /**
     * Retrieves a list of reviews associated with the specified booking.
     *
     * @param booking the booking object
     * @return a list of reviews associated with the specified booking
     */
    List<Reviews> findReviewsByBooking(Booking booking);

    /**
     * Retrieves a list of reviews associated with the rooms of the specified hostel.
     *
     * @param hostel the hostel object
     * @return a list of reviews associated with the rooms of the specified hostel
     */
    List<Reviews> findByBooking_Room_Hostel(Hostel hostel);
}