package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Booking;
import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.repository.ReviewsRepository;
import com.simplon.concepthotelmineur.entity.Reviews;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing Reviews entities.
 */
@Service
@RequiredArgsConstructor
public class ReviewsService {

    private final ReviewsRepository reviewsRepository;

    /**
     * Adds a new review.
     *
     * @param reviews the review object to be added
     * @return the added review
     */
    public Reviews addReviews(Reviews reviews) {
        return reviewsRepository.save(reviews);
    }

    /**
     * Retrieves a list of reviews associated with the specified hostel.
     *
     * @param hostel the hostel object
     * @return a list of reviews associated with the specified hostel
     */
    public List<Reviews> findReviewsByHostel(Hostel hostel) {
        return reviewsRepository.findByBooking_Room_Hostel(hostel);
    }

    /**
     * Retrieves a limited list of reviews associated with the specified hostel.
     *
     * @param hostel the hostel object
     * @param limit  the maximum number of reviews to retrieve
     * @return a limited list of reviews associated with the specified hostel
     */
    public List<Reviews> findReviewsByHostelLimited(Hostel hostel, int limit) {
        List<Reviews> allReviews = reviewsRepository.findByBooking_Room_Hostel(hostel);
        int endIndex = Math.min(limit, allReviews.size());
        return allReviews.subList(0, endIndex);
    }

    /**
     * Retrieves a list of reviews associated with the specified booking.
     *
     * @param booking the booking object
     * @return a list of reviews associated with the specified booking
     */
    public List<Reviews> findReviewsByBooking(Booking booking) {
        return reviewsRepository.findReviewsByBooking(booking);
    }

    /**
     * Deletes a review by its ID.
     *
     * @param id the ID of the review to be deleted
     */
    public void deleteReviews(Long id) {
        reviewsRepository.deleteById(id);
    }
}