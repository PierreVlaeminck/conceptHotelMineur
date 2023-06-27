package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;

@Entity
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRe;

    private String commentary;

    private Integer scores;

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

    public Long getIdRe() {
        return idRe;
    }

    public void setIdRe(Long idRe) {
        this.idRe = idRe;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
