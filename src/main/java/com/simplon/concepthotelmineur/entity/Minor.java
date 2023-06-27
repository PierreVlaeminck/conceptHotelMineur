package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Minor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idM;

    private String lastName;

    private String firstName;

    private LocalDate dateOfBirthM;

    private String cellPhone;

    private String additionalInformation;

    @ManyToOne
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;

    public Minor(Long idM, String lastName, String firstName, LocalDate dateOfBirthM, String cellPhone, String additionalInformation, UserProfile userProfile) {
        this.idM = idM;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirthM = dateOfBirthM;
        this.cellPhone = cellPhone;
        this.additionalInformation = additionalInformation;
        this.userProfile = userProfile;
    }

    public Minor() {
    }

    public Long getIdM() {
        return idM;
    }

    public void setIdM(Long idM) {
        this.idM = idM;
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

    public LocalDate getDateOfBirthM() {
        return dateOfBirthM;
    }

    public void setDateOfBirthM(LocalDate dateOfBirthM) {
        this.dateOfBirthM = dateOfBirthM;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }
}