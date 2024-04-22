package com.lotericas.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="concurso")
public class Concurso {

    @Id
    private Integer id;
    private String dataSorteio;
    private Integer bola1;
    private Integer bola2;
    private Integer bola3;
    private Integer bola4;
    private Integer bola5;
    private Integer bola6;
    private Long quantidadeGanhadores;
    private String cidadeGanhadores;
    private Double valorGanho;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataSorteio() {
        return dataSorteio;
    }

    public void setDataSorteio(String dataSorteio) {
        this.dataSorteio = dataSorteio;
    }

    public Integer getBola1() {
        return bola1;
    }

    public void setBola1(Integer bola1) {
        this.bola1 = bola1;
    }

    public Integer getBola2() {
        return bola2;
    }

    public void setBola2(Integer bola2) {
        this.bola2 = bola2;
    }

    public Integer getBola3() {
        return bola3;
    }

    public void setBola3(Integer bola3) {
        this.bola3 = bola3;
    }

    public Integer getBola4() {
        return bola4;
    }

    public void setBola4(Integer bola4) {
        this.bola4 = bola4;
    }

    public Integer getBola5() {
        return bola5;
    }

    public void setBola5(Integer bola5) {
        this.bola5 = bola5;
    }

    public Integer getBola6() {
        return bola6;
    }

    public void setBola6(Integer bola6) {
        this.bola6 = bola6;
    }

    public Long getQuantidadeGanhadores() {
        return quantidadeGanhadores;
    }

    public void setQuantidadeGanhadores(Long quantidadeGanhadores) {
        this.quantidadeGanhadores = quantidadeGanhadores;
    }

    public String getCidadeGanhadores() {
        return cidadeGanhadores;
    }

    public void setCidadeGanhadores(String cidadeGanhadores) {
        this.cidadeGanhadores = cidadeGanhadores;
    }

    public Double getValorGanho() {
        return valorGanho;
    }

    public void setValorGanho(Double valorGanho) {
        this.valorGanho = valorGanho;
    }
}
