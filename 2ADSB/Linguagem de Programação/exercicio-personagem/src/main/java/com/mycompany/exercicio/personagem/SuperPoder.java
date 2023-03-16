/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.personagem;

/**
 *
 * @author gabriel.f.a.santos
 */
public class SuperPoder {
    
    private String nome;
    private Integer categoria;

    public SuperPoder(String nome, Integer categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public Integer getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "SuperPoder{" + "nome=" + nome + ", categoria=" + categoria + '}';
    }
    
}
