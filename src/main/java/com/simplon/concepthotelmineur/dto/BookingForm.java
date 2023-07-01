package com.simplon.concepthotelmineur.dto;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class BookingForm {

    private String bookingCode;

    private LocalDateTime dateArrived;

    private LocalDateTime departureDate;

    private Double totalPrice;

    private Boolean pending;

    private String roomNumber;

    private String typeRoom;

    @Size(min = 1, max = 255)
    private String lastName;

    @Size(min = 1, max = 255)
    private String firstName;

    private LocalDate dateOfBirthM;

    @Size(min = 1, max = 255)
    private String cellphone;

    private String familyRelationship;

    @Size(max = 1500)
    private String additionalInformation;

}