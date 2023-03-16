/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.vendedor.ocmicao;

/**
 *
 * @author gabriel.f.a.santos
 */
public class AppComicao {
    public static void main(String[] args) {
        VendedorComicao vendedor1 = new VendedorComicao(1, "Chiquinho", 30.0, 0.30);
        VendedorComicaoMaisFixo vendedorFixo1 = new VendedorComicaoMaisFixo(2020.00, 3,"Felix", 34.0, 12.0);
        
        System.out.println(vendedor1);
            System.out.println(String.format("A Comição do %s é: %.2f",
                    vendedor1.getNome(), vendedor1.calcularSalario()));
            
        System.out.println("=".repeat(30));
            
        System.out.println(vendedorFixo1);
            System.out.println(String.format("A Comição do %s é: %.2f", 
                    vendedor1.getNome(), vendedorFixo1.calcularSalario()));
    }
}
