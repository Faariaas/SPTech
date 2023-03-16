/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Inteiros {

    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        
        List<Integer> ListaNumeros = new ArrayList();
        List<Integer> NumerosPares = new ArrayList();
        List<Integer> NumerosImpares = new ArrayList();
        Integer numero = 1;
        Integer Soma = 0;
        Integer Maior = -1;
        Integer Menor = 9999;

        for (int i = 0; numero > 0; i++) {
            System.out.println("Digite um numero inteiro");
            numero = Leitor.nextInt();
            ListaNumeros.add(numero);
            Soma += numero;
            
            if (numero % 2 == 0 ) {
                NumerosPares.add(numero);
            } else {
                NumerosImpares.add(numero);
                System.out.println("cabou");
            }
            if( numero > Maior  ){
                Maior = numero;
            }
            else if (numero < Menor){
               Menor = numero; 
            }
            System.out.println(ListaNumeros);
//            System.out.println("foi");
        }
        System.out.println(numero);
        System.out.println("Pares: " + NumerosPares);
        System.out.println("Impares: " + NumerosImpares);
        System.out.println("Soma: " + Soma);
        System.out.println("Menor: " + Menor);
        System.out.println("Maior: " + Maior);
    }
}
