package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idD;

    private String name;

    private String document;

    @ManyToOne
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;

    public Document(Long idD, String name, String document, UserProfile userProfile) {
        this.idD = idD;
        this.name = name;
        this.document = document;
        this.userProfile = userProfile;
    }

    public Document() {

    }
}
