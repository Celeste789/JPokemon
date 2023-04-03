package com.celeste.toma80.toma80.repositories;


import com.celeste.toma80.toma80.entities.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
    List<Player> findAll();
}
