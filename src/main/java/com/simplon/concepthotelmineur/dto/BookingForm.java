package com.simplon.concepthotelmineur.dto;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BookingForm {

    @Getter
    @Setter
    private String bookingCode;

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
    private String typeRoom;

    @Getter
    @Setter
    @Size(min = 1, max = 255)
    private String lastName;

    @Getter
    @Setter
    @Size(min = 1, max = 255)
    private String firstName;

    @Getter
    @Setter
    private LocalDate dateOfBirthM;

    @Getter
    @Setter
    @Size(min = 1, max = 255)
    private String cellphone;

    @Getter
    @Setter
    @Size(min = 1, max = 255)
    private String familyRelationship;

    @Getter
    @Setter
    @Size(min = 1, max = 1500)
    private String additionalInformation;
}