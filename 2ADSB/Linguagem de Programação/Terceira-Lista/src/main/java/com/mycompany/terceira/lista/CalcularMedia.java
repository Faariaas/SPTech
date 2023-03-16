/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.terceira.lista;

import java.util.Scanner;

/**
 *
 * @author gabriel.f.a.santos
 */
public class CalcularMedia {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        
        Metodos calc = new Metodos();
        
        System.out.println("Qual sua primeira nota?:");
        Double nota1 = nota.nextDouble();
        System.out.println("Qual sua segunda nota?:");
        Double nota2 = nota.nextDouble();
        
        Double media = calc.Media(nota1, nota2);
        System.out.println("Sua media foi: " + media);
    }
}
