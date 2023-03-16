/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel.f.a.santos
 */
public class TesteAnimacao {
    public static void main(String[] args) {
        List<Animacao> animacoes =new ArrayList();
//        LIst<String> = nomeA = new ArrayList();
//        List<Integer> = anoA = new ArrayList();
        
        Animacao animacao01 = new Animacao("procurando nemo", 2003, 2.3);
        Animacao animacao02 = new Animacao("Juregui", 2005, 2.10);
        
        animacoes.add(animacao01);
        animacoes.add(animacao02);
        animacoes.add(new Animacao("Penis Penis", 200, 2.10));
        
        String nomeProcurar = "Juregui";
        
        // Essa parte serve de aprendizado;
//        if (anomacoes.contains(nomeProcurar)) {
//            System.out.println("Achou");}
        
Boolean Sera = false;
        for (int i =0; i < animacoes.size(); i++){
            
            Animacao animacaoDaVez = animacoes.get(i);
            
            if(animacaoDaVez.getNome().equalsIgnoreCase(nomeProcurar)){
                System.out.println( nomeProcurar + " Existe na lista");
                Sera = true;
            }
        }
        
        
        System.out.println(Sera ? "Achou" : "Não achou");
        
        for(Animacao itemAnimacao: animacoes){
            if(itemAnimacao.getNome().equals(nomeProcurar)){
                System.out.println("Achei no enhanced for");
            }
        }
        
    }
}