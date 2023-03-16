/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.personagem;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Heroi extends Personagem {

    public Heroi(String codinome, String nome) {
        super(codinome, nome);
    }

    @Override
    public Double getForcaTotal() {
        
        Integer soma = 0;
        
        for (SuperPoder poder : this.getPoderes()) {
            soma += poder.getCategoria();
        }
        
        return soma * 1.15;
//        for (int i = 0; i <= this.getPoderes().size(); i++) {;
//        }
    }
    
}
