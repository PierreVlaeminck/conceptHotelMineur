package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Bookmark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBk;

    @ManyToOne
    @JoinColumn(name="user_profile_id")
    private UserProfile userProfile;

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
