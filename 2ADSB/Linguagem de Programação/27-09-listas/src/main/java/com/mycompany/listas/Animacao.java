/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listas;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Animacao {
    private String nome;
    private Integer anoLancamento;
    private Double duracao;
    
    public Animacao(String nome, Integer anoLancamento, Double duracao) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }
    
}
