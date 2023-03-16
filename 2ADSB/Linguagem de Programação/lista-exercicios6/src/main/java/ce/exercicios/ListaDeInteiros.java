/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ce.exercicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author cesar
 */
public class ListaDeInteiros {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        List<Integer> num  = new ArrayList();
        List<Integer> pares  = new ArrayList();
        List<Integer> impares  = new ArrayList();
        
        Integer adicionar = 1 ;
        Integer soma = 0;
        Integer numeroMaior = -9999;
        Integer numeroMenor = 9999;
        
        
        for (int i = 0; adicionar > 0; i++) {
            
            
            System.out.println("Digite um numero inteiro");
            adicionar = in.nextInt();
            num.add (adicionar);
            
            soma += adicionar;
            
            
            if (adicionar % 2 == 0){
                pares.add (adicionar);
            }
            else{
                impares.add (adicionar);
            }
            
            if( adicionar > numeroMaior  ){
                numeroMaior = adicionar;
            }
            else if (adicionar < numeroMenor){
               numeroMenor = adicionar; 
            }
                
             
        }
        
        System.out.println("Numeros Pares: " +pares);
        
        System.out.println("Numeros Impares: "+impares);
        
        System.out.println("Soma de todos os numeros: " +soma);
        
        System.out.println("Menor numero da lista: " +numeroMenor);
        
        System.out.println("Maior numero da lista: " +numeroMaior);
        
    }
}
