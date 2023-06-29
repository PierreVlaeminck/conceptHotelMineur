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

@Controller
public class ReviewsController {

    private final ReviewsService reviewsService;
    private final BookingService bookingService;

    public ReviewsController(ReviewsService reviewsService,
                             BookingService bookingService) {
        this.reviewsService = reviewsService;
        this.bookingService = bookingService;
    }

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