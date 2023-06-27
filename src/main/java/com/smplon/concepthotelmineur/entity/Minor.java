package com.smplon.concepthotelmineur.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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

    public Minor(Long idM, String lastName, String firstName, LocalDate dateOfBirthM, String cellPhone, String additionalInformation) {
        this.idM = idM;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirthM = dateOfBirthM;
        this.cellPhone = cellPhone;
        this.additionalInformation = additionalInformation;
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
}