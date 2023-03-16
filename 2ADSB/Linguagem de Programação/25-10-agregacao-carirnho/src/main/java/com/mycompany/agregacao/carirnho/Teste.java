/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agregacao.carirnho;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Teste {
    public static void main(String[] args) {
      
    
    Produto p1 = new Produto("Pão", "Padaria", 1.50);
    Produto p2 = new Produto("Pães", "segunda Padaria", 1.50);
    
    Carrinho c1 = new Carrinho("Carrinho do Felix");
    
    c1.adicionar(p1);
        System.out.println(c1);
    }
}
