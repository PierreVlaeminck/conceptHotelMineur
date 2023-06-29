package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
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
    @Column (columnDefinition = "text")
    @Size(min = 3, max = 1500)
    private String commentary;

    @Getter
    @Setter
    private Double scores;

    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    public Reviews(Long idRe, String commentary, Double scores, Booking booking) {
        this.idRe = idRe;
        this.commentary = commentary;
        this.scores = scores;
        this.booking = booking;
    }

    public Reviews() {
    }
}