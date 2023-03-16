/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.personagem;

/**
 *
 * @author gabriel.f.a.santos
 */
public class App {
    public static void main(String[] args) {
        
        Heroi heroi = new Heroi("Sonic", "Sonic O Ouriço");
        Heroi heroi2 = new Heroi("Knucles", "Knucles o Equidina");
        
        Vilao vilao = new Vilao("Eggman", "DR Robotnik");
        Vilao vilao2 = new Vilao("Metal Sonic", "Metal Sonic");
        
        heroi.adicionaPoder("GiraBolinha", 100);
        heroi2.adicionaPoder("VelocidadeMaxima", 500);
        
        vilao.adicionaPoder("SuperInteligenia", 450);
        vilao2.adicionaPoder("Se vestir de cleopatra", 50);
        
        Confornto.lutar(heroi, vilao2);
    }
}
