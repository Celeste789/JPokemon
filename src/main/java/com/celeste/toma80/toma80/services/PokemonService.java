package com.celeste.toma80.toma80.services;


import com.celeste.toma80.toma80.entities.Move;
import com.celeste.toma80.toma80.entities.Pokemon;
import com.celeste.toma80.toma80.repositories.MoveRepository;
import com.celeste.toma80.toma80.repositories.PokemonRepository;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    PokemonRepository pokemonRepository;
    MoveRepository moveRepository;

    public void receiveDamage(long pokemonAttackingId, long pokemonBeingAtackedId, long moveID) {
        Pokemon pokemonAttacking = pokemonRepository.findById(pokemonAttackingId);
        Pokemon pokemonBeingAttacked = pokemonRepository.findById(pokemonBeingAtackedId);
        Move move = moveRepository.findById(moveID);
        int effectiveness = (int) (pokemonAttacking.getType().effectivenessInNumbers() * move.getType().effectivenessInNumbers());
        boolean isSpecial = move.isSpecial();
        int attack = pokemonAttacking.getBasicStats().get(1);
        int defense = pokemonBeingAttacked.getBasicStats().get(2);
        int HP = pokemonAttacking.getHP();
        if (isSpecial) {
            attack = pokemonAttacking.getBasicStats().get(3);
            defense = pokemonAttacking.getBasicStats().get(4);
        }
        int damage = ((((2 * pokemonAttacking.getLvl() / 5) + 2)) * move.getPower() * attack / defense / 50 + 2) * effectiveness;
        HP -= damage;
        if (HP <= 0) {
            pokemonAttacking.setStatus(false);
        }
    }
}
