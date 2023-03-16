/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.personagem;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Vilao extends Personagem{

    public Vilao(String codinome, String nome) {
        super(codinome, nome);
    }

    @Override
    public Double getForcaTotal() {
        
        Integer soma = 0;
        
        for (SuperPoder poder : this.getPoderes()) {
            soma += poder.getCategoria();
        }
        
        return soma.doubleValue();
    }
    
}
