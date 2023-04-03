package com.celeste.toma80.toma80.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "player_id", nullable = false)
    private Long playerID;

    @Column(name = "name")
    private String name;

    @Column(name = "pokemons")
    private List<Long> pokemons;

    @Column(name = "potions")
    private List<Long> potions;

    public Player() {
        super();
    }

    public Player(String name, List<Long> pokemons, List<Long> potions) {
        this.name = name;
        this.pokemons = pokemons;
        this.potions = potions;
    }
}
