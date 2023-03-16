/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.desenvolvedor;

/**
 *
 * @author gabri
 */
public class TestDesenvolvedor {
    public static void main(String[] args) {
        Desenvolvedor dev1 = new Desenvolvedor("Gabs", 12, 3.60);
        Desenvolvedor dev2 = new Desenvolvedor("Guilhermo del Toro", 24, 32.60);
        
        System.out.println(dev1);
        System.out.println("-".repeat(20));
        System.out.println(dev2);
    }
}
