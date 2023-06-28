package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
public class Booking {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idB;

    @Getter
    @Setter
    private String bookingCode;

    @Getter
    @Setter
    private LocalDateTime dateArrived;

    @Getter
    @Setter
    private LocalDateTime departureDate;

    @Getter
    @Setter
    private Double totalPrice;

    @Getter
    @Setter
    private Boolean pending;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;

    @Getter
    @Setter
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
}
