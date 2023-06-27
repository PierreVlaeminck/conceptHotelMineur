package com.smplon.concepthotelmineur.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idB;

    private LocalDateTime dateArrived;

    private LocalDateTime departureDate;

    private Double totalPrice;

    private Boolean pending;

    public Booking(Long idB, LocalDateTime dateArrived, LocalDateTime departureDate, Double totalPrice, Boolean pending) {
        this.idB = idB;
        this.dateArrived = dateArrived;
        this.departureDate = departureDate;
        this.totalPrice = totalPrice;
        this.pending = pending;
    }

    public Booking() {
    }

    public Long getIdB() {
        return idB;
    }

    public void setIdB(Long idB) {
        this.idB = idB;
    }

    public LocalDateTime getDateArrived() {
        return dateArrived;
    }

    public void setDateArrived(LocalDateTime dateArrived) {
        this.dateArrived = dateArrived;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Boolean getPending() {
        return pending;
    }

    public void setPending(Boolean pending) {
        this.pending = pending;
    }
}
