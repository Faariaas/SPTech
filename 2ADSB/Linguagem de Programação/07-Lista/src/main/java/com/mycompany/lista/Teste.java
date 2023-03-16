/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Teste {
    public static void main(String[] args) {
        
        List<Medicamente> medicamento = new ArrayList<>();
        
        Scanner Leitor = new Scanner(System.in);
        Scanner LeitorNL = new Scanner(System.in);
        
//        Medicamente medicamneto01 = new Medicamente(1, "Paracetamal", 3, 10.30);
//        Medicamente medicamneto02 = new Medicamente(2, "Dipirona", 5, 2.50);
        Integer escolha = 0;
        while (escolha != 4){
            System.out.println("=============================\n"
                    + "Selecione uma opção:\n"
                    + "01 - Cadastrar medicamento\n"
                    + "02 - Exibir medicamentos\n"
                    + "03 - Buscar medicamento\n"
                    + "04 - sair\n"
                    + "=============================");
            
           escolha = Leitor.nextInt();
        switch (escolha){
            case 1 :
                
                System.out.println("=================================");
                System.out.println("Qual identificador do medicamento:");
                Integer id = Leitor.nextInt();
                System.out.println("Qual nome do medicamento:");
                String nome = LeitorNL.nextLine();
                System.out.println("Quantos tem no estoque:");
                Integer quantidade = Leitor.nextInt();
                System.out.println("Qual valor do produto:");
                Double valor = Leitor.nextDouble();
                
                break;
                
//                medicamente
            case 2 :
                
                System.out.println("O case 2 foi");
                
                break;
                
            case 3 :
                
                System.out.println("case 3 foi");
                
                break;
                
            case 4 :
                break;
        }
        }
        
//        System.out.println(medicamneto01);
    }
}
