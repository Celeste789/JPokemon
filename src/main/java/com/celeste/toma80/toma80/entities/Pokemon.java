package com.celeste.toma80.toma80.entities;


import com.celeste.toma80.toma80.repositories.PokemonRepository;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "pokemon")
@Data
@NoArgsConstructor
public class Pokemon extends Specie{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pokemon_id", nullable = false)
    private long pokemonID;

    @Column(name = "specie")
    String specieName;

    @Column(name = "hp")
    private int HP;

    @Column(name = "player_id")
    private long playerID;


    @Column(name = "name")
    private String name;

    @Column(name = "lvl")
    private int lvl;

    @Column(name = "exp")
    private int exp;

    @Column(name = "status")
    private boolean status;

    @Column(name = "is_evolution")
    private boolean isEvolution;



    public Pokemon(String name, Set<Long> learnSet, int HP, long playerID, long specie, String name1, int lvl, int exp, PokemonRepository pokemonRepository) {
        super(name, learnSet);
        this.HP = HP;
        this.playerID = playerID;
        this.specieName = this.getSpecieName();
        this.name = name1;
        this.lvl = lvl;
        this.exp = exp;
        this.status = HP > 0;
        this.isEvolution = this.evolutionLvl <= lvl;
    }
}
