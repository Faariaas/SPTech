/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundo.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author gabri
 */
public class acumulador {
    public static void main(String[] args) {
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 10);
        
        Integer i = 0;
        while(numeroAleatorio != 0){
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 10);
            i += numeroAleatorio;
        }
        System.out.println(i);
    }
}
