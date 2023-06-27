package com.smplon.concepthotelmineur.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRe;

    private String commentary;

    private Integer scores;

    public Reviews(Long idRe, String commentary, Integer scores) {
        this.idRe = idRe;
        this.commentary = commentary;
        this.scores = scores;
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
}
