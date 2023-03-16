package org.example;

import java.util.Scanner;

public class Exercicio1 {

    // 1.  Escreva um programa que leia 7 números e armazene-os em um vetor.
    // Depois, o programa deve percorrer o vetor exibindo os números na ordem em que foram inseridos.
    // E depois, deve percorrer o vetor de trás para frente, exibindo os números na ordem inversa em que foram inseridos (dica: utilize o for ao contrário).

    public static void exibeVetor(int[] v){
        for (int i = 0; i < v.length; i++){
            System.out.print("v[" + i + "]=" + v[i] + "\t");
        }
        System.out.println();
    }

    public static void exibeAoContrario(int[] v){
        for (int i = 0; i > v.length - 1; i--){
            System.out.print("v[" + i + "]=" + v[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[7];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o valor de vetor[" + i + "]");
            vetor[i] = leitor.nextInt();
        }

        exibeVetor(vetor);
        exibeAoContrario(vetor);
    }

}
