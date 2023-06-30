package com.simplon.concepthotelmineur.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Benefit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idB;

    private String typeS;

    public Benefit(Long idB, String typeS) {
        this.idB = idB;
        this.typeS = typeS;
    }

    public Benefit() {
    }
}