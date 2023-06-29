package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Picture {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idI;

    @Getter
    @Setter
    private String url;

    @ManyToOne
    @JoinColumn(name = "hostel_id")
    private Hostel hostel;

    public Picture(Long idI, String url, Hostel hostel) {
        this.idI = idI;
        this.url = url;
        this.hostel = hostel;
    }

    public Picture() {
    }
}