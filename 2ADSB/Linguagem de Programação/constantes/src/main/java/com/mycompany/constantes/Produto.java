/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constantes;

/**
 *
 * @author gabriel.f.a.santos
 */
public enum Produto {
    MOUSE("Mouse", 100.0), TECLADO("Teclado", 200.0);
    
    private final String nome;
    private final Double preco;
    
    public static Produto buscarProdutoPorPreco(Double preco){
    
            for (int i = 0; i < Produto.values().length; i++) {
                if (Produto.values()[1].getPreco().equals(preco)) {
                    return Produto.values()[1];
                }
            }
}

    private Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
    
}
