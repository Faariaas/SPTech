/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classe.abstrata;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Teste {
    public static void main(String[] args) {
        AlnoGraduacao a1 = new AlnoGraduacao(10.0, 5.0, "Bob", "01221010");
        
        AlunoPosGraduacao a2 = new AlunoPosGraduacao(6.0, 9.0, "Bolonho", "01221010");
        
        System.out.println("=".repeat(20));
        System.out.println("A media da Graduação é:");
        System.out.println(a1.calcularMedia());
        System.out.println("=".repeat(20));
        System.out.println("A media da Pós");
        System.out.println(a2.calcularMedia());
        System.out.println("=".repeat(20));
    }
}
