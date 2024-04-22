package com.lotericas.controller;

import com.lotericas.dto.Concurso;
import com.lotericas.service.ResultadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsultaController {

    @Autowired
    private ResultadosService resultadosService;

    @GetMapping("/consulta")
    List<Concurso> buscarResultado(
            @RequestParam Integer bola1,
            @RequestParam Integer bola2,
            @RequestParam Integer bola3,
            @RequestParam Integer bola4,
            @RequestParam Integer bola5,
            @RequestParam Integer bola6
    ) {
        return resultadosService.buscar(bola1, bola2, bola3, bola4, bola5, bola6);
    }
}
