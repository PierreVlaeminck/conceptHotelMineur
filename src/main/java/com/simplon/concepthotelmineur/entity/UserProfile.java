package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUp;

    private String username;

    private String lastNameU;

    private String firstNameU;

    private LocalDate dateOfBirthU;

    @Email
    private String mailU;

    private String phone;

    private String cellPhoneU;

    public UserProfile(String username, String lastNameU, String firstNameU, LocalDate dateOfBirthU, String mailU, String phone, String cellPhoneU) {
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