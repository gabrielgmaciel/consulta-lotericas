package com.lotericas.repository;


import com.lotericas.dto.Concurso;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultadosRepository extends MongoRepository<Concurso, Integer> {

    List<Concurso> find(Integer id);
}
