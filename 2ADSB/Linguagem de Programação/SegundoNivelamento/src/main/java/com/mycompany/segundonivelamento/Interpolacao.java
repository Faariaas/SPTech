/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundonivelamento;

/**
 *
 * @author aluno
 */
public class Interpolacao {
    public static void main(String[] args) {
        String nome ="Gabriel farias";
        Integer idade = 23;
        Double altura = 1.871;
        
        // %s = String || %d = Integer(Inteiros) ||
        // %.2f = Double com 2 casa decimais & %.1f = Double com 1 casa Decimal
        
//        System.out.println(String.format("Meu nome é %s, tenho %d de idade , e %.2f de altura e meu pet é o"
//                + "%s ta ligado", nome, idade, altura, "Zuca boy"));
        
        String Frase = String.format("Meu nome é %s, tenho %d de idade , e %.2f de altura e meu pet é o Big "
                + "%s ta ligado", nome, idade, altura, "Zuca boy");
        
        System.out.println(Frase);
    }
}
