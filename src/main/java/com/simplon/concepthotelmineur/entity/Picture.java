package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idI;

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