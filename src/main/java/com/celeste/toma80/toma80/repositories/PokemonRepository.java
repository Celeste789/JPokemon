package com.celeste.toma80.toma80.repositories;


import com.celeste.toma80.toma80.entities.Pokemon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Long> {
    List<Pokemon> findAll();
    Pokemon findById(long id);

}
