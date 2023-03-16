/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundonivelamento;

/**
 *
 * @author aluno
 */
public class OperadorTernario {
    public static void main(String[] args) {
        Boolean bloqueado = false;
        
        String frase;
        
        if(bloqueado){
            frase = "Usuario nao tem acesso a essa bagacera!!";
        }else{
            frase = "Pó passa amigao ta tranquilo";
        }
        
        //Usando operador ternario
        // condição ? se for verdade faz isso :  se nao faz isso
        
        frase = bloqueado ? "usuario bloqueado" : "usuario desbloqueado";
        
        System.out.println(frase);
        
        Double salario =1000.0;
        
        Double bonus = salario > 1000.0 ? 0.15 : 0.10;
        
        System.out.println(bonus);
    }
}
