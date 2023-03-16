/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundonivelamento;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Lacos {
    public static void main(String[] args) {
        System.out.println("For - 0-10");
        
        for(int i = 0; i<=10; i++){
            System.out.println(i);
        }
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Advinhe o numero:");
        Integer numeroDigitado = leitor.nextInt();
        
        while(numeroDigitado != 42){
            System.out.println("Errou!!!");
            System.out.println("Digite Outro!!");
            numeroDigitado = leitor.nextInt();
        }
    }
}
