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
public class ClasseSocial {
    public static void main(String[] args) {
        Scanner ValorRend = new Scanner(System.in);
        
        System.out.println("Qual sua renda mensal");
        Double Valor = ValorRend.nextDouble();
        
        Metodos ClasseSocial = new Metodos();
        Metodos Classe = new Metodos();
        
        Double Renda = ClasseSocial.Classe(Valor);
        
        if(Renda < 2){
            String nome = "E";
        }else if(Renda >= 2 && Renda < 4){
            String nome = "D";
        }else if(Renda >= 4 && Renda < 10){
            String nome = "C";
        }else if(Renda >= 10 && Renda < 20){
            String nome = "B";
        }else if(Renda > 20){
            String nome = "A";
        }
        
        
        Classe.exibirClasse(nome);
        
        System.out.println("Você recebe aproximadamente "
        + Renda + " salários mìnimos");
        System.out.println(Classe.exibirClasse(nome));
        
    }
}
