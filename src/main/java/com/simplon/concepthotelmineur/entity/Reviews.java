package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRe;

    @Column (columnDefinition = "text")
    @Size(min = 3, max = 1500)
    private String commentary;

    private Double scores;

    private LocalDateTime createdAt;

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