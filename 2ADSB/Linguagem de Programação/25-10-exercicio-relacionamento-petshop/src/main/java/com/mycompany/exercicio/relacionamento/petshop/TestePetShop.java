/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.relacionamento.petshop;

/**
 *
 * @author gabriel.f.a.santos
 */
public class TestePetShop {
    public static void main(String[] args) {
        Pet p1 = new Pet("Zulu","NobreD+");
        Pet p2 = new Pet("Macaco","NobreD+");
        Pet p3 = new Pet("sla oq mais","NobreD+");
        
        PetShop s1 = new PetShop("Gabs Petz",100.00);
        
        s1.darBanho(p1, 50.0);
        s1.darBanho(p1, 50.0);
        s1.darBanho(p2, 50.0);
        s1.darBanho(p3, 50.0);
        
        System.out.println(s1);
    }
}
