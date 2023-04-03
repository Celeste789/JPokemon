package com.celeste.toma80.toma80.repositories;


import com.celeste.toma80.toma80.entities.Potion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PotionRepository extends CrudRepository<Potion, Long> {
    List<Potion> findAll();
}
