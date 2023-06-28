package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
public class UserProfile {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUp;

    @Getter
    @Setter
    private String usernameP;

    @Getter
    @Setter
    private String lastName;

    @Getter
    @Setter
    private String firstName;

    @Getter
    @Setter
    private LocalDate dateOfBirthU;

    @Getter
    @Setter
    @Email
    private String mailU;

    @Getter
    @Setter
    private String phone;

    @Getter
    @Setter
    private String cellPhoneU;

    public UserProfile(Long idUp, String usernameP, String lastName, String firstName, LocalDate dateOfBirthU, String mailU, String phone, String cellPhoneU) {
        this.idUp = idUp;
        this.usernameP = usernameP;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirthU = dateOfBirthU;
        this.mailU = mailU;
        this.phone = phone;
        this.cellPhoneU = cellPhoneU;
    }

    public UserProfile() {
    }
}