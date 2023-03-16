/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.segundonivelamento;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner leitor= new Scanner(System.in);
        
        System.out.println("DIgite um dia da semana");
        Integer dia = leitor.nextInt();
        
        switch(dia){
            case 1:
                System.out.println("Segundou!!");
                break;
            case 2:
                System.out.println("Terçou!!");
                break;
            case 3:
                System.out.println("Quartou");
                break;
            case 4:
                System.out.println("Quintou");
                break;
            case 5:
                System.out.println("Sextou!!");
                break;
            default:
                System.out.println("Fudeu");
                break;
        }
    }
}
