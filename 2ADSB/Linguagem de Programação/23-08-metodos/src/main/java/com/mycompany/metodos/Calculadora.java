/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Calculadora {
    
    //Essa nao é void
    //Tem retorno, e é Double!
    Double somar(){
        return 10.0 + 20.0;
    }
    
    //Metodos sobrecarregados
    //O mesmo metodo fazendo mais de uma coisa
    Double somarComNumeros(Double num1, Double num2){
        return num1 + num2;
    }
    
    Boolean isNumeroPar(Double numero){
        Boolean isPar = numero % 2 == 0;
        
        return isPar;
    }
    
}
