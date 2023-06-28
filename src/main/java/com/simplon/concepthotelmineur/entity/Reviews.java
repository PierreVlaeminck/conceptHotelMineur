package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Reviews {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRe;

    @Getter
    @Setter
    private String commentary;

    @Getter
    @Setter
    private Integer scores;

    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    public Reviews(Long idRe, String commentary, Integer scores, Booking booking) {
        this.idRe = idRe;
        this.commentary = commentary;
        this.scores = scores;
        this.booking = booking;
    }

    public Reviews() {
    }
}