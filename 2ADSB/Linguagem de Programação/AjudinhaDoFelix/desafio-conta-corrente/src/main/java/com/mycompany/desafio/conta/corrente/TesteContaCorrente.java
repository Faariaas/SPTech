/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio.conta.corrente;

/**
 *
 * @author AlfaUser
 */
public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente c = new ContaCorrente("Fulano");
        
        c.depositar(30.0, 3, 6, 2000);
        c.sacar(50.0, 4, 6, 2000);
        c.sacar(10.0, 5, 6, 2000);
        c.depositar(-30.0, 3, 6, 2000);
        
        System.out.println(c);
        c.exibirExtrato();



    }
}
