/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constantes;

import java.util.Scanner;

/**
 *
 * @author gabriel.f.a.santos
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PontoCardeal pc = new PontoCardeal();
        
        System.out.println("Digite a inicial de caralhos voe ta indo");
        String pontoCardeal = in.nextLine();
        
        switch(pontoCardeal){
            case "N":
                System.out.println("Voce esta indo para o " + PontoCardeal.NORTE);
            break;
            
            case "S":
                System.out.println("Voce esta indo para o " + PontoCardeal.SUL);
            break;
            
            case "L":
                System.out.println("Voce esta indo para o " + PontoCardeal.LESTE);
            break;
            
            case "O":
                System.out.println("Voce esta indo para o " + PontoCardeal.OESTE);
            break;
            
            default : 
                System.out.println("Vai pra casa do caralho");
        }
    }
}
