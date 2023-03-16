/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.terceira.lista;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Metodos {
    
    //Metodo do CalcularMedia
    Double Media(Double num1, Double num2){
        return num1*0.4 + num2*0.6;
    }
    
    //Metodo do ClasseSocial
    Double Classe(Double num1){
        return num1 / 1100;
    }
    void exibirClasse(String Classe){
        System.out.println(String.format("Você pertence a classe social: ", Classe));
    }
}
