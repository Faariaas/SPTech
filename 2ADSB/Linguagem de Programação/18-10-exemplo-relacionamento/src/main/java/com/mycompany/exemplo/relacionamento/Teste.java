/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo.relacionamento;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Teste {
    public static void main(String[] args) {
        Contato c1 = new Contato("Giuliana", "(11)9 0000-0001");
        Contato c2 = new Contato("Mortuaia", "(11)9 0000-0002");
        Contato c3 = new Contato("Rosa", "(11)9 0000-0003");
        Contato c4 = new Contato("Michael jackson", "(11)9 0000-0004");
        
        Grupo g1 = new Grupo("Trabalho");
        Grupo g2 = new Grupo("Amigos");
        
        g1.adiciona(c1);
        g1.adiciona(c2);
        
        g2.adiciona(c1);
        g2.adiciona(c3);
        g2.adiciona(c4);
        
        System.out.println(g1);
        System.out.println(g2);
    }
}
