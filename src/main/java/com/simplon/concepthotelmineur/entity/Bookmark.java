package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Bookmark {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBk;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name="user_profile_id")
    private UserProfile userProfile;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name="hostel_id")
    private Hostel hostel;

    public Bookmark(Long idBk, UserProfile userProfile, Hostel hostel) {
        this.idBk = idBk;
        this.userProfile = userProfile;
        this.hostel = hostel;
    }

    public Bookmark(){

    }
}
