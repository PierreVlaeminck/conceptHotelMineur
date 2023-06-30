package com.simplon.concepthotelmineur.controller;

import com.simplon.concepthotelmineur.dto.CreateReviews;
import com.simplon.concepthotelmineur.entity.Booking;
import com.simplon.concepthotelmineur.entity.Reviews;
import com.simplon.concepthotelmineur.service.BookingService;
import com.simplon.concepthotelmineur.service.ReviewsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Controller class for managing reviews.
 */
@Controller
public class ReviewsController {

    private final ReviewsService reviewsService;
    private final BookingService bookingService;

    /**
     * Constructs a new ReviewsController with the given ReviewsService and BookingService.
     *
     * @param reviewsService the ReviewsService to be used
     * @param bookingService the BookingService to be used
     */
    public ReviewsController(ReviewsService reviewsService, BookingService bookingService) {
        this.reviewsService = reviewsService;
        this.bookingService = bookingService;
    }

    /**
     * Creates a new review for a booking.
     *
     * @param bookingId     the ID of the booking for which the review is created
     * @param createReviews the CreateReviews object containing the review details
     * @return a redirect to the hotel page
     */
    @PostMapping("avis_clients/{bookingId}/ajouter_un_avis")
    public String createReviews(@PathVariable("bookingId") Long bookingId,
                                @ModelAttribute("CreateReviews") CreateReviews createReviews) {
        Booking booking = bookingService.findBookingById(bookingId);

        if (booking == null) {
            return "redirect:/index";
        }

        Reviews reviews = new Reviews();
        reviews.setCommentary(createReviews.getCommentary());
        reviews.setScores(createReviews.getScores());
        reviews.setBooking(booking);

        reviewsService.addReviews(reviews);

        return "redirect:/hotels/" + booking.getRoom().getHostel().getIdH();
    }
}