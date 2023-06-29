package com.simplon.concepthotelmineur.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BookingForm {

    @Getter
    @Setter
    private LocalDateTime dateArrived;

    @Getter
    @Setter
    private LocalDateTime departureDate;

    @Getter
    @Setter
    private Double totalPrice;

    @Getter
    @Setter
    private Boolean pending;

    @Getter
    @Setter
    private String roomNumber;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private LocalDate dateOfBirthM;

    @Getter
    @Setter
    private String cellphone;

    @Getter
    @Setter
    private String familyRelationship;

    @Getter
    @Setter
    private String additionalInformation;
}
