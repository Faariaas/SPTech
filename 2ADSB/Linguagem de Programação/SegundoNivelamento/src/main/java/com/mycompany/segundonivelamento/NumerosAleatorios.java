/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundonivelamento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author aluno
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 101);
        
        System.out.println(numeroAleatorio);
        
        Double NumeroAletorioQuebrado = ThreadLocalRandom.current().nextDouble(1, 101);
        
        System.out.println(NumeroAletorioQuebrado);
        
    }
}
