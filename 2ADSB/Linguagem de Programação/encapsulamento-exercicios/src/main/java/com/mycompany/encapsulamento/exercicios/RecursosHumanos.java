/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento.exercicios;

/**
 *
 * @author gabriel.f.a.santos
 */
public class RecursosHumanos {
    
    Colaborador colab01 = new Colaborador();
    
    Integer promovidos = 0;
    Double TotalReajuste = 0.0;
     
    void reajustarSalario(Colaborador colab01,Double TotalReajuste){
        this.TotalReajuste += TotalReajuste;
    }
    
    void promoverColaborador(Colaborador nome,String cargo,Double salario){
        
    }
    
    
    
}
