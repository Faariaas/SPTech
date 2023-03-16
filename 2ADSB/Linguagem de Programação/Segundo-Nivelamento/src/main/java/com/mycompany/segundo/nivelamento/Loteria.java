/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundo.nivelamento;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author gabri
 */
public class Loteria {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        Integer NumeroAleatorio = ThreadLocalRandom.current().nextInt(1, 10);
        
        System.out.println("Manda um numero ai");
        Integer NumeroDigitado = Leitor.nextInt();
        int ten = 0;
        
        while(NumeroDigitado != NumeroAleatorio){
            System.out.println("Errou!!!");
            System.out.println("Tenta de novo");
            NumeroDigitado = Leitor.nextInt();
            ten++;
        }
        
        if (ten <= 3){
            System.out.println("Vocé é bem sortudo");
        }else if(ten > 3 && ten <= 10){
            System.out.println("Vocé tem sorte");
        }else if(ten > 10){
            System.out.println("Melhor para de apostar");
        }
    }
}
