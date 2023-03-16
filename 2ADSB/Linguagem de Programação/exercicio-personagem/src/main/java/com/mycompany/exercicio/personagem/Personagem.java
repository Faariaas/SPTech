/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.personagem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel.f.a.santos
 */
public abstract class Personagem {
    private String codinome;
    private String nome;
    private List<SuperPoder> poderes;

    public Personagem(String codinome, String nome) {
        this.codinome = codinome;
        this.nome = nome;
        this.poderes = new ArrayList();
    }

    public String getCodinome() {
        return codinome;
    }

    public String getNome() {
        return nome;
    }

    public List<SuperPoder> getPoderes() {
        return poderes;
    }
    
    public void adicionaPoder(String nome, Integer categoria){
        
        SuperPoder poder = new SuperPoder(nome, categoria);
        
        poderes.add(poder);
        
    }
    
    public abstract Double getForcaTotal();
}
