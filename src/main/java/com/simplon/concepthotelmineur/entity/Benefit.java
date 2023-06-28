package com.simplon.concepthotelmineur.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Benefit {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idB;

    @Getter
    @Setter
    private String typeS;

    public Benefit(Long idB, String typeS) {
        this.idB = idB;
        this.typeS = typeS;
    }

    public Benefit() {
    }
}