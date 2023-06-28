package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Type {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idT;

    @Getter
    @Setter
    private String typeRoom;

    @Getter
    @Setter
    private String descriptionT;

    public Type(Long idT, String typeRoom) {
        this.idT = idT;
        this.typeRoom = typeRoom;
    }

    public Type() {
    }
}