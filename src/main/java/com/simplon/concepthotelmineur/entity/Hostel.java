package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Hostel {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idH;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String address;

    @Getter
    @Setter
    private int postalCode;

    @Getter
    @Setter
    private String city;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    @Email
    private String mailH;

    @Getter
    @Setter
    private String phone;

    @Getter
    @Setter
    @OneToMany
    @JoinColumn(name = "room_id")
    private List<Room> room = new ArrayList<Room>();

    public Hostel(Long idH, String name, String address, int postalCode, String city, String description, String mailH, String phone) {
        this.idH = idH;
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.description = description;
        this.mailH = mailH;
        this.phone = phone;
    }

    public Hostel() {
    }
}
