package com.simplon.concepthotelmineur.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idT;

    private String typeRoom;

    @Column(columnDefinition = "text")
    @Size(min = 3, max = 1000)
    private String descriptionT;

    public Type(Long idT, String typeRoom) {
        this.idT = idT;
        this.typeRoom = typeRoom;
    }

    public Type() {
    }
}