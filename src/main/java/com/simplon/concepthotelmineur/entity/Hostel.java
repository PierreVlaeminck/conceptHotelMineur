package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Hostel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idH;

    private String name;

    private String address;

    private int postalCode;

    private String city;

    @Column (columnDefinition = "text")
    @Size (min = 3, max = 1000)
    private String description;

    @Email
    private String mailH;

    private String phone;

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

    @OneToMany(mappedBy = "hostel")
    private List<BenefitHostel> benefitHostels;

    public List<BenefitHostel> getBenefitHostels() {
        return benefitHostels;
    }

    @OneToMany(mappedBy = "hostel")
    private List<Room> rooms;

    public List<Room> getRooms() {
        return rooms;
    }
}