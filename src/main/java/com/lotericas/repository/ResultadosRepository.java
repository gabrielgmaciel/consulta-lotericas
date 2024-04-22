package com.lotericas.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lotericas.dto.Concurso;

@Repository
public interface ResultadosRepository extends MongoRepository<Concurso, Integer> {
}
