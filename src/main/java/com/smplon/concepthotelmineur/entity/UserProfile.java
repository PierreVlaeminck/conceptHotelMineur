package com.smplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.time.LocalDate;

@Entity
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUp;

    private String lastName;

    private String firstName;

    private LocalDate dateOfBirthU;

    @Email
    private String mailU;

    private Integer phone;

    private Integer cellPhone;

    @ManyToOne
    @JoinColumn(name = "id_user_profile") // Nom de la colonne faisant référence à la clé primaire de la table "users"
    private UserProfile userProfileId;

    public UserProfile(Long idUp, String lastName, String firstName, LocalDate dateOfBirthU, String mailU, Integer phone, Integer cellPhone) {
        this.idUp = idUp;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirthU = dateOfBirthU;
        this.mailU = mailU;
        this.phone = phone;
        this.cellPhone = cellPhone;
    }

    public UserProfile() {
    }

    public void setIdUp(Long idUp) {
        this.idUp = idUp;
    }

    public Long getIdUp() {
        return idUp;
    }

    public void setIdUP(Long idUp) {
        this.idUp = idUp;
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

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(Integer cellPhone) {
        this.cellPhone = cellPhone;
    }

    public UserProfile getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(UserProfile userProfileId) {
        this.userProfileId = userProfileId;
    }
}