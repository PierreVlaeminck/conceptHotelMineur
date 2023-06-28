package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Document {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idD;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String document;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name="user_profile_id")
    private UserProfile userProfile;

    public Document(Long idD, String name, String document, UserProfile userProfile) {
        this.idD = idD;
        this.name = name;
        this.document = document;
        this.userProfile = userProfile;
    }

    public Document(){

    }
}
