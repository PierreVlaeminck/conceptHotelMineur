package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idB;

    @Column(unique = true, nullable = false)
    private String bookingCode;

    private LocalDateTime dateArrived;

    private LocalDateTime departureDate;

    private LocalDateTime createdAt = LocalDateTime.now();

    private Double totalPrice;

    private Boolean pending;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @ManyToOne
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;

    @ManyToOne
    @JoinColumn(name = "minor_id")
    private Minor minor;

    public Booking(Long idB, String bookingCode, LocalDateTime dateArrived,
                   LocalDateTime departureDate, Double totalPrice, Boolean pending,
                   Room room, UserProfile userProfile, Minor minor) {
        this.idB = idB;
        this.bookingCode = bookingCode;
        this.dateArrived = dateArrived;
        this.departureDate = departureDate;
        this.totalPrice = totalPrice;
        this.pending = pending;
        this.room = room;
        this.userProfile = userProfile;
        this.minor = minor;
    }

    public Booking() {
    }

    @PrePersist
    private void generateBookingCode() {
        // Génération du code de réservation
        String codePrefix = "R";
        String codeNumber = String.format("%03d", idB);
        bookingCode = codePrefix + codeNumber;
    }
}