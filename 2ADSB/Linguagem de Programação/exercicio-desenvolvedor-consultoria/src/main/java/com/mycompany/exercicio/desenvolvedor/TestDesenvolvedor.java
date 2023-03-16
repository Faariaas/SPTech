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
        
        DesenvolvedorMobile devMob1 = new DesenvolvedorMobile(12, 23.2,"Felix", 24, 32.60);
        
        
        Consultoria con01 = new Consultoria("GabsEnterprise", 2);
        
//        System.out.println(dev1);
//        System.out.println("-".repeat(20));
//        System.out.println(dev2);
        
        
        con01.contratar(dev1);
        con01.contratar(dev2);
        con01.contratar(devMob1);
        con01.buscarDesenvolvedorPorNome("Guilhermo del Toro");
        con01.existePorNome("Gabs");
        con01.getQuandidadeDesenvolvedor();
        con01.getQuandidadeDesenvolvedorMobile();
        con01.getTotalSalarios();
    }
}
