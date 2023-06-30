package com.simplon.concepthotelmineur.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateReviews {


    private String commentary;

    private Double scores;

    @Column(name = "booking_id")
    private Long bookingId;
}
