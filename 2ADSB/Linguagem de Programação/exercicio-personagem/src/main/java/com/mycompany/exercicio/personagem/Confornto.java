/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.personagem;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Confornto {
     public static void lutar(Heroi heroi, Vilao vilao) {
        
         Double poderHeroi = heroi.getForcaTotal();
         Double poderVilao = vilao.getForcaTotal();
         
         if(poderVilao > poderHeroi){
             System.out.println(String.format("%s Venceu!! o mundo corre perigo!!", vilao.getNome()));
         }else if(poderHeroi > poderVilao){
             System.out.println(String.format("%s venceu!!, O mundo ta safe porra",heroi.getNome()));
         }else {
             System.out.println(String.format("Empatou, Nosso Heroi %s empatou com vilao %s", heroi.getNome(),vilao.getNome()));
         }
    }
}
