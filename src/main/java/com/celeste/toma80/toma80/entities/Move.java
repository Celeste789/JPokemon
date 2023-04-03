package com.celeste.toma80.toma80.entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Objects;


@Entity
@Getter
@Table(name = "move")
public class Move {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "move_id", nullable = false)
    private Long moveID;

    @Column(name = "is_special")
    boolean isSpecial;

    @Column(name = "name")
    private String name;

    @Column(name = "power")
    private int power;

    @Column(name = "accuracy")
    private int accuracy;

    @Column(name = "type")
    private TypeEnum type;

    public Move() {
        super();
    }

    public Move(String name, int power, int accuracy) {
        this.name = name;
        this.power = power;
        this.accuracy = accuracy;
    }

    public void setType(String name){
        switch (name) {
            case "Water Gun", "Aqua Tail", "Hydro Pump" -> this.type = TypeEnum.WATER;
            case "Ember", "Flame Wheel", "Eruption" -> this.type = TypeEnum.FIRE;
            case "Razor Leaf", "Magical Leaf", "Solar Beam" -> this.type = TypeEnum.GRASS;
        }
    }

    public void setSpecial(String name){
        isSpecial = Objects.equals(name, "Water Gun") || Objects.equals(name, "Ember") || Objects.equals(name, "Magical Leaf") || Objects.equals(name, "Hydro Pump") || Objects.equals(name, "Eruption") || Objects.equals(name, "Solar Beam");
    }
}
