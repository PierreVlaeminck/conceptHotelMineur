package com.smplon.concepthotelmineur.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idS;

    private String typeS;

    private Double priceS;

    public Service(Long idS, String typeS, Double priceS) {
        this.idS = idS;
        this.typeS = typeS;
        this.priceS = priceS;
    }

    public Service() {
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