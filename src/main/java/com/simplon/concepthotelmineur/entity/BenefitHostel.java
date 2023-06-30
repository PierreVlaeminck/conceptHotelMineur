package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class BenefitHostel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBh;

    @ManyToOne
    @JoinColumn(name = "benefit_id")
    private Benefit benefit;

    @ManyToOne
    @JoinColumn(name = "hostel_id")
    private Hostel hostel;

    private Double price;

    public BenefitHostel(Long idBh, Benefit benefit, Hostel hostel, Double price) {
        this.idBh = idBh;
        this.benefit = benefit;
        this.hostel = hostel;
        this.price = price;
    }

    public BenefitHostel() {
    }

}
