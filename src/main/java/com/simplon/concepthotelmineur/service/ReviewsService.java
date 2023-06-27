package com.simplon.concepthotelmineur.service;

import com.simplon.concepthotelmineur.entity.Booking;
import com.simplon.concepthotelmineur.repository.ReviewsRepository;
import com.simplon.concepthotelmineur.entity.Hostel;
import com.simplon.concepthotelmineur.entity.Reviews;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewsService {

    private final ReviewsRepository reviewsRepository;

    public Reviews addReviews(Reviews reviews) {
        return reviewsRepository.save(reviews);
    }

    public void deleteReviews(Long id) {
        reviewsRepository.deleteById(id);
    }

    public List<Reviews> getReviewsByBooking(Booking booking) {
        return reviewsRepository.findReviewsByBooking(booking);
    }
}
