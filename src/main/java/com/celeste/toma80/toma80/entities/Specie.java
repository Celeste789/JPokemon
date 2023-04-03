package com.celeste.toma80.toma80.entities;


import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;
import java.util.Set;

@MappedSuperclass
@Data
@Table(name = "specie")
public abstract class Specie {

    @Column(name = "name")
    protected String name;

    @Column(name = "learnset")
    protected Set<Long> learnSet;

    @Column(name = "weaknesses")
    protected TypeEnum type;

    @Column(name = "basic_stats")
    protected List<Integer> basicStats;

    @Column(name = "evolution_lvl")
    protected int evolutionLvl;


    public Specie() {
        super();
    }

    public Specie(String name, Set<Long> learnSet) {
        this.name = name;
        this.learnSet = learnSet;
    }

    public void setBasicStats(){
        switch (this.name) {
            case "Totodile" -> {
                //HP, Attk, Def, SpAttk, SpDef, Spd
                this.basicStats.set(0, 12);
                this.basicStats.set(1, 6);
                this.basicStats.set(2, 6);
                this.basicStats.set(3, 5);
                this.basicStats.set(4, 6);
                this.basicStats.set(5, 6);
            }
            case "Cyndaquil" -> {
                //HP, Attk, Def, SpAttk, SpDef, Spd
                this.basicStats.set(0, 12);
                this.basicStats.set(1, 6);
                this.basicStats.set(2, 6);
                this.basicStats.set(3, 6);
                this.basicStats.set(4, 6);
                this.basicStats.set(5, 5);
            }
            case "Chikorita" -> {
                //HP, Attk, Def, SpAttk, SpDef, Spd
                this.basicStats.set(0, 12);
                this.basicStats.set(1, 6);
                this.basicStats.set(2, 5);
                this.basicStats.set(3, 6);
                this.basicStats.set(4, 6);
                this.basicStats.set(5, 6);
            }
            case "Quilava"->{
                //HP, Attk, Def, SpAttk, SpDef, Spd
                this.basicStats.set(0, 40);
                this.basicStats.set(1, 22);
                this.basicStats.set(2, 21);
                this.basicStats.set(3, 24);
                this.basicStats.set(4, 23);
                this.basicStats.set(5, 29);
            }
            case "Croconaw"->{
                this.basicStats.set(0,51);
                this.basicStats.set(1, 33);
                this.basicStats.set(2, 33);
                this.basicStats.set(3, 23);
                this.basicStats.set(4, 27);
                this.basicStats.set(5, 27);
            }
            case "Bayleef"->{
                this.basicStats.set(0, 45);
                this.basicStats.set(1, 24);
                this.basicStats.set(2, 30);
                this.basicStats.set(3, 22);
                this.basicStats.set(4, 30);
                this.basicStats.set(5, 26);
            }
            case "Typhlosion"->{
                this.basicStats.set(0, 102);
                this.basicStats.set(1, 65);
                this.basicStats.set(2, 61);
                this.basicStats.set(3, 74);
                this.basicStats.set(4, 66);
                this.basicStats.set(5, 84);
            }
            case "Meganium"->{
                this.basicStats.set(0, 91);
                this.basicStats.set(1, 58);
                this.basicStats.set(2, 54);
                this.basicStats.set(3, 66);
                this.basicStats.set(4, 59);
                this.basicStats.set(5, 75);
            }
            case "Feraligatr"->{
                this.basicStats.set(0, 91);
                this.basicStats.set(1, 68);
                this.basicStats.set(2, 65);
                this.basicStats.set(3, 46);
                this.basicStats.set(4, 54);
                this.basicStats.set(5, 56);
            }
        }
    }

    public List<Integer> getBasicStats() {
        return basicStats;
    }

    public void setEvolutionLvl() {
        switch (this.name) {
            case "Cyndaquil" -> this.evolutionLvl = 14;
            case "Chikorita" -> this.evolutionLvl = 16;
            case "Totodile" -> this.evolutionLvl = 18;
            case "Quilava" -> this.evolutionLvl = 36;
            case "Bayleef" -> this.evolutionLvl = 32;
            case "Croconaw" -> this.evolutionLvl = 30;
        }
    }

    public void setType(){
        switch (name){
            case "Cyndaquil", "Quilava", "Typhlosion" -> this.type = TypeEnum.FIRE;
            case "Chikorita", "Bayleef", "Meganium" -> this.type = TypeEnum.GRASS;
            case "Totodile", "Croconaw", "Feraligatr" -> this.type = TypeEnum.WATER;
        }
    }

}
