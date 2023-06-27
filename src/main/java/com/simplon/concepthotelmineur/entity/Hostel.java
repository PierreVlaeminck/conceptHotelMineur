package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Hostel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idH;

    @OneToMany
    @JoinColumn(name = "room_id")
    private List<Room> room = new ArrayList<Room>();

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Benefit benefit;

    private String name;

    private String streetNumber;

    private String address;

    private int postalCode;

    private String city;

    private String description;

    @Email
    private String mailH;

    private String phone;

    public Hostel(Long idH, String name, String streetNumber, String address, int postalCode, String city, String description, String mailH, String phone, Benefit benefit) {
        this.idH = idH;
        this.name = name;
        this.streetNumber = streetNumber;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.description = description;
        this.mailH = mailH;
        this.phone = phone;
        this.benefit = benefit;
    }

    public Hostel() {
    }

    public Long getIdH() {
        return idH;
    }

    public void setIdH(Long idH) {
        this.idH = idH;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMailH() {
        return mailH;
    }

    public void setMailH(String mailH) {
        this.mailH = mailH;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
