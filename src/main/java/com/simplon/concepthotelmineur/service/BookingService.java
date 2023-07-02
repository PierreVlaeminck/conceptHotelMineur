package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Booking;
import com.simplon.concepthotelmineur.entity.UserProfile;
import com.simplon.concepthotelmineur.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing Booking entities.
 */
@Service
@RequiredArgsConstructor
public class BookingService {

    private final BookingRepository bookingRepository;

    /**
     * Retrieves a booking by its ID.
     *
     * @param id the ID of the booking
     * @return the booking with the specified ID
     * @throws RuntimeException if no booking is found with the given ID
     */
    public Booking findBookingById(Long id) {
        return bookingRepository.findById(id).orElseThrow(
                () -> new RuntimeException("No booking found with ID: " + id));
    }

    /**
     * Creates a new booking.
     *
     * @param booking the booking to create
     * @return the created booking
     */
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    /**
     * Retrieves all bookings associated with a user profile.
     *
     * @param userProfile the user profile associated with the bookings
     * @return a list of bookings associated with the user profile
     */
    public List<Booking> findAllBookingByUserProfil(UserProfile userProfile) {
        return bookingRepository.getBookingByUserProfile(userProfile);
    }

    /**
     * Deletes a booking by its ID.
     *
     * @param id the ID of the booking to delete
     */
    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}