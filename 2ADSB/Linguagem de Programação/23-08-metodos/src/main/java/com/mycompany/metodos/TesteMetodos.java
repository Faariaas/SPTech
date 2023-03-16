/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

import java.util.Scanner;

/**
 *
 * @author gabriel.f.a.santos
 */
public class TesteMetodos {
    public static void main(String[] args) {
        
        
        //Nosso proprio objeto
        
        //Instaniando a classe Utilitaria
        Utilitaria util = new Utilitaria();
        
        //INVOCANDO um Método (chamando)
        util.exibirLinha();
        
        //A variavel nao precisa ter o mesmo nome do metodo
        //Mas precisa ter o mesmo tipo
        String nome = "É o Gabs";
        String nome2 = "Sla Kemy";
        util.exibirNome(nome);
        util.exibirNome(nome2);
        util.exibirNome("Bruninho");
        
        util.exibirNomeDecorado(nome);
        
        System.out.println("---> CALCULADORA <---");
        Calculadora calc = new Calculadora();
        Double soma = calc.somar();
        System.out.println(soma);
        
        Scanner numeroDig = new Scanner(System.in);
        
        System.out.println("Fala um numero primiero");
        Double numeroDigitado1 = numeroDig.nextDouble();
        System.out.println("Fala o segundo numero");
        Double numeroDigitado2 = numeroDig.nextDouble();
        
        Double soma1 = calc.somarComNumeros(numeroDigitado1, numeroDigitado2);
        System.out.println("Retorno de um calculo bem fodasse mesmo " + soma1);
        
        
        if(calc.isNumeroPar(soma1)){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
