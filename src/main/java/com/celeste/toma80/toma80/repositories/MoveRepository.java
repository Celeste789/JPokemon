package com.celeste.toma80.toma80.repositories;


import com.celeste.toma80.toma80.entities.Move;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoveRepository extends CrudRepository<Move, Long>{
    List<Move> findAll();
    Move findById(long id);
}
