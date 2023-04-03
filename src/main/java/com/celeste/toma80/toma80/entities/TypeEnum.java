package com.celeste.toma80.toma80.entities;

public enum TypeEnum {
    FIRE, WATER, GRASS;

    public Effectiveness weaknesses(TypeEnum type){
        switch (this){
            case FIRE:
                return switch (type) {
                    case GRASS -> Effectiveness.SUPER;
                    case FIRE, WATER -> Effectiveness.NOT_VERY;
                };
            case WATER:
                return switch (type){
                    case FIRE -> Effectiveness.SUPER;
                    case GRASS, WATER -> Effectiveness.NOT_VERY;
                };
            case GRASS:
                return switch (type){
                    case WATER -> Effectiveness.SUPER;
                    case GRASS, FIRE -> Effectiveness.NOT_VERY;
                };
        }
        return Effectiveness.NORMAL;
    }

    public double effectivenessInNumbers(){
        switch (weaknesses(this)){
            case NORMAL -> {
                return 1;
            }
            case NOT_VERY -> {
                return 0.5;
            }
            case SUPER -> {
                return 2;
            }
        }
        return 0;
    }


    public enum Effectiveness {
        NOT_VERY, NORMAL, SUPER;
    }
}
