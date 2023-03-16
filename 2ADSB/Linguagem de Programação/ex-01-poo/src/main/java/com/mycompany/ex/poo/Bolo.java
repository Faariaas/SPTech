/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex.poo;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Bolo {
    
    String sabor;
    Double valor;
    Integer quantidadeVendida;
    
    void comprarBolo(Integer quantidadeDesejada){
        Integer quantidadeValidar = quantidadeDesejada + quantidadeVendida;
        
        if (quantidadeVendida <= 100) {
            quantidadeVendida += quantidadeDesejada;
            System.out.println("Compra realizada");
        }else{
        System.out.println("Seu pedido Ultrapassou");
    }
    }
    
    void exibirRelatorio(){
        
    }
}
