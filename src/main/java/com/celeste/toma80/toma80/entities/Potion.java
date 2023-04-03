package com.celeste.toma80.toma80.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "potion")
@Getter @Setter
public class Potion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "pwr")
    private int pwr;

    @Column(name = "effect")
    private String effect;

    public Potion() {
        super();
    }


}
