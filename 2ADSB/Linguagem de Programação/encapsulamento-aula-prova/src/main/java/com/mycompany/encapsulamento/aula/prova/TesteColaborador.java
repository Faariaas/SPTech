/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento.aula.prova;

/**
 *
 * @author gabriel.f.a.santos
 */
public class TesteColaborador {
    public static void main(String[] args) {
        Colaborador colab01 = new Colaborador("Gabs", "Dev jr", 8000.00);
//        colab01.setNome("Giuliana");
//        colab01.setCargo("Dev Sandy");
//        colab01.setSalario(8000.0);
        
        Colaborador colab02 = new Colaborador("Felix", "Estagiotario Jr", 2000.00);
//        colab02.setNome("Carlos");
//        colab02.setCargo("Estagiario Dev");
//        colab02.setSalario(2000.0);
        
        RecursosHumanos rh = new RecursosHumanos();
        rh.setTotalPromovidos(0);
        rh.setTotalReajustados(0);
        
        System.out.println(String.format("Colaborador 01:\n Nome: %s\n Cargo: %s\n Salario: %s",colab01.getNome(), colab01.getCargo(), colab01.getSalario()));
        
        System.out.println("Colaborador 01:");
        System.out.println(colab01.getNome());
        System.out.println(colab01.getCargo());
        System.out.println(colab01.getSalario());
        
        System.out.println("--------------------");
        
        System.out.println("Colaborador 02:");
        System.out.println(colab02.getNome());
        System.out.println(colab02.getCargo());
        System.out.println(colab02.getSalario());
        
        rh.promovercolaborador(colab02, "Dev Jr", 3000.0);
        rh.promovercolaborador(colab01, "Dev Jr", 5000.0);
        rh.reajustarSalario(colab02, 500.0);
        
        System.out.println("--------------------");
        
        System.out.println("Colaborador 01:");
        System.out.println(colab01.getNome());
        System.out.println(colab01.getCargo());
        System.out.println(colab01.getSalario());
        
        System.out.println("--------------------");
        
        System.out.println("RH");
        System.out.println(rh.getTotalPromovidos());
        System.out.println(rh.getTotalReajustados());
        
        System.out.println(colab01);
        System.out.println(colab01.toString());
        
        System.out.println("============");
        System.out.println("RH - relatorio");
        System.out.println(rh);
    }
}
