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
public class Teste {
    public static void main(String[] args) {
        List listaEstranha = new ArrayList();
        
        listaEstranha.add("Felix");
        listaEstranha.add(42);
        listaEstranha.add(false);
        listaEstranha.add(42.0);
        
        System.out.println(listaEstranha);
        
        //Lista com tipo
        List<String> nomes = new ArrayList();
        nomes.add("Felix Segundo");
        nomes.add("Matilda");
        nomes.add("Gabs");
        
        System.out.println(nomes);
        
        //Percorrendo Lista
//        add adiciona na lista
        //size retorna o tamnaho da lista
        //get retorna o valor de acordo com a posição/ indice
        
        //remove: ó adivinha só... remove algo seu idiota
        
        for(int i = 0; i < nomes.size(); i++){
            if(nomes.get(i).equals("Felix Segundo")){
//            System.out.println("nome " + (i + 1) + " " + nomes.get(i));
                System.out.println("Achei e removi");
                nomes.remove(i);
            }
        }
        System.out.println("Nome: " + nomes);
    }
}
