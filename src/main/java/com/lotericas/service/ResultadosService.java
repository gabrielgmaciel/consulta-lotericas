package com.lotericas.service;

import com.lotericas.dto.Concurso;
import com.lotericas.repository.ResultadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultadosService {

    @Autowired
    private ResultadosRepository resultadosRepository;

    public List<Concurso> buscar(Integer bola1, Integer bola2, Integer bola3, Integer bola4, Integer bola5, Integer bola6) {
//        return resultadosRepository.find(bola1, bola2, bola3, bola4, bola5, bola6);
//        return resultadosRepository.find(bola1);
        return resultadosRepository.findAll();
    }
}
