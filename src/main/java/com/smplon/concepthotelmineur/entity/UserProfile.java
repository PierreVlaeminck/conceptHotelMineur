package com.smplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.time.LocalDate;

@Entity
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUp;

    private String username;

    private String lastName;

    private String firstName;

    private LocalDate dateOfBirthU;

    @Email
    private String mailU;

    private String phone;

    private String cellPhoneU;

    public UserProfile(Long idUp, String username, String lastName, String firstName, LocalDate dateOfBirthU, String mailU, String phone, String cellPhoneU) {
        this.idUp = idUp;
        this.username = username;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirthU = dateOfBirthU;
        this.mailU = mailU;
        this.phone = phone;
        this.cellPhoneU = cellPhoneU;
    }

    public UserProfile() {
    }

    public Long getIdUp() {
        return idUp;
    }

    public void setIdUp(Long idUp) {
        this.idUp = idUp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDateOfBirthU() {
        return dateOfBirthU;
    }

    public void setDateOfBirthU(LocalDate dateOfBirthU) {
        this.dateOfBirthU = dateOfBirthU;
    }

    public String getMailU() {
        return mailU;
    }

    public void setMailU(String mailU) {
        this.mailU = mailU;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCellPhoneU() {
        return cellPhoneU;
    }

    public void setCellPhoneU(String cellPhoneU) {
        this.cellPhoneU = cellPhoneU;
    }
}