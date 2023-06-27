package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;

@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idT;

    private String typeRoom;

    private Double price;

    public Type(Long idT, String typeRoom, Double price) {
        this.idT = idT;
        this.typeRoom = typeRoom;
        this.price = price;
    }

    public Type() {
    }

    public Long getIdT() {
        return idT;
    }

    public void setIdT(Long idT) {
        this.idT = idT;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}