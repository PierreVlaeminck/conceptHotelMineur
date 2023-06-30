package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idR;

    @Getter
    @Setter
    private String roomNumber;

    @Getter
    @Setter
    private double price;

    @Getter
    @Setter
    @Column (columnDefinition = "text")
    @Size(min = 3, max = 1000)
    private String detail;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    @Getter
    @Setter
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
