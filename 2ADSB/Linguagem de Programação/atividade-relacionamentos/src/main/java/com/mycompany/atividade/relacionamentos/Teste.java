/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.relacionamentos;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Teste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Ajax", "Lipeza", 10.90);
        Produto p2 = new Produto("Neuza", "remedio", 10.90);
        
        Carrinho c1 = new Carrinho("Felix");
        
        c1.adicionar(p1);
        c1.adicionar(p2);
        
        System.out.println(c1);
    }
}
