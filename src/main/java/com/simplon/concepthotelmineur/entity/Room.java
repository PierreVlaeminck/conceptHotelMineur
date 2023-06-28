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
    private boolean available;

    @Getter
    @Setter
    private Integer roomNumber;

    @Getter
    @Setter
    private double price;

    @Getter
    @Setter
    private String detail;

    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "type_id")
    private Type type;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "hostel_id")
    private Hostel hostel;

    public Room(Long idR, Integer roomNumber, Boolean available, Double price, String detail, Type type) {
        this.idR = idR;
        this.roomNumber = roomNumber;
        this.available = available;
        this.price = price;
        this.detail = detail;
        this.type = type;
    }

    public Room() {
    }
}
