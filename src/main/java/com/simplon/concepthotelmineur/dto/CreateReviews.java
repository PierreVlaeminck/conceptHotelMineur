package com.simplon.concepthotelmineur.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateReviews {

    @NotBlank
    @NotNull
    private String commentary;

    @NotBlank
    @NotNull
    private Double scores;

    @NotBlank
    @NotNull
    @Column(name = "booking_id")
    private Long bookingId;
}
