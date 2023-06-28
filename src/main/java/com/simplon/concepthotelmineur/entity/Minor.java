package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
public class Minor {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idM;

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
    private String cellPhone;

    @Getter
    @Setter
    private String familyRelationship;

    @Getter
    @Setter
    private String additionalInformation;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;

    public Minor(Long idM, String lastName, String firstName,
                 LocalDate dateOfBirthM, String cellPhone, String familyRelationship,
                 String additionalInformation, UserProfile userProfile) {
        this.idM = idM;
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirthM = dateOfBirthM;
        this.cellPhone = cellPhone;
        this.familyRelationship = familyRelationship;
        this.additionalInformation = additionalInformation;
        this.userProfile = userProfile;
    }

    public Minor() {
    }
}