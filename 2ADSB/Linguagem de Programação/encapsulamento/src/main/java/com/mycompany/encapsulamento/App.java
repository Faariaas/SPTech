/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento;

/**
 *
 * @author gabriel.f.a.santos
 */
public class App {
    public static void main(String[] args) {
        
        ContaBancaria conta01 = new ContaBancaria();
       // conta01.nomeTitular = "Farias";
        //conta01.saldo = 0.0;
        
        ContaBancaria conta02 = new ContaBancaria();
        //conta01.nomeTitular = "Felix";
        //conta01.saldo = 0.0;
        
        System.out.println("Conta 01: ");
        conta01.depositar(10.0);
        
        System.out.println("Conta 02: ");
        conta02.depositar(10000.00);
        
        Double saldoConta1 = conta01.pegarSaldo();
        
        System.out.println("Saldo C1: " + saldoConta1);
//        System.out.println("Saldo C2: %.2f" + conta02.saldo);
    }
}
