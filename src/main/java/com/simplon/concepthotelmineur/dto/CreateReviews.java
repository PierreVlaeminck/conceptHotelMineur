package com.simplon.concepthotelmineur.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

public class CreateReviews {

    @Getter
    @Setter
    @NotBlank
    @NotNull
    private String commentary;

    @Getter
    @Setter
    @NotBlank
    @NotNull
    private Double scores;

    @Getter
    @Setter
    @NotBlank
    @NotNull
    @Column(name = "booking_id")
    private Long bookingId;
}
