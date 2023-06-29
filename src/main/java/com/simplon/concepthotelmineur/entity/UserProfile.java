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
    private String username;

    @Getter
    @Setter
    private String lastNameU;

    @Getter
    @Setter
    private String firstNameU;

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

    public UserProfile(Long idUp, String username, String lastNameU, String firstNameU, LocalDate dateOfBirthU, String mailU, String phone, String cellPhoneU) {
        this.idUp = idUp;
        this.username = username;
        this.lastNameU = lastNameU;
        this.firstNameU = firstNameU;
        this.dateOfBirthU = dateOfBirthU;
        this.mailU = mailU;
        this.phone = phone;
        this.cellPhoneU = cellPhoneU;
    }

    public UserProfile() {
    }
}