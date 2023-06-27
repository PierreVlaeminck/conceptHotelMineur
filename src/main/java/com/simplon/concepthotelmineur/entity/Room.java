package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idR;

    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name ="type_id")
    private Type type;

    private boolean available;

    private Integer roomNumber;

    public Room(Long idR, Integer roomNumber, Boolean available, Type type) {
        this.idR = idR;
        this.roomNumber = roomNumber;
        this.available = available;
        this.type = type;
    }

    public Room() {
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public Long getIdR() {
        return idR;
    }

    public void setIdR(Long idR) {
        this.idR = idR;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
}
