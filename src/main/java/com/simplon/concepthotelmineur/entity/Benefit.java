package com.simplon.concepthotelmineur.entity;


import jakarta.persistence.*;

@Entity
public class Benefit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idS;

    private String typeS;

    private Double priceS;

    public Benefit(Long idS, String typeS, Double priceS) {
        this.idS = idS;
        this.typeS = typeS;
        this.priceS = priceS;
    }

    public Benefit() {
    }

    public Long getIdS() {
        return idS;
    }

    public void setIdS(Long idS) {
        this.idS = idS;
    }

    public String getTypeS() {
        return typeS;
    }

    public void setTypeS(String typeS) {
        this.typeS = typeS;
    }

    public Double getPriceS() {
        return priceS;
    }

    public void setPriceS(Double priceS) {
        this.priceS = priceS;
    }
}