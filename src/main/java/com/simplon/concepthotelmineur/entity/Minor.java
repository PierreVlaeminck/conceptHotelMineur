package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Minor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idM;

    private String lastName;

    private String firstName;

    private LocalDate dateOfBirthM;

    private String cellPhone;

    private String familyRelationship;

    @Column (columnDefinition = "text")
    @Size(max = 1500)
    private String additionalInformation;

    @ManyToOne
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;

    public Minor(String lastName, String firstName,
                 LocalDate dateOfBirthM, String cellPhone, String familyRelationship,
                 String additionalInformation, UserProfile userProfile) {
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