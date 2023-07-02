package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idR;

    private String roomNumber;

    private double price;

    @Column(columnDefinition = "text")
    @Size(min = 3, max = 1000)
    private String detail;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    @ManyToOne
    @JoinColumn(name = "hostel_id")
    private Hostel hostel;

    public Room(Long idR, String roomNumber, Double price, String detail, Type type) {
        this.idR = idR;
        this.roomNumber = roomNumber;
        this.price = price;
        this.detail = detail;
        this.type = type;
    }

    public Room() {
    }
}