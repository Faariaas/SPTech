package org.example;

import java.util.Scanner;

public class Exercicio2 {
    //2.  Escreva um programa que cria um vetor para armazenar 10 inteiros.
    // O programa deve solicitar que o usuário digite 10 números, que devem ser armazenados nesse vetor.
    //O programa deverá calcular a média dos números digitados e exibir a média.
    //Depois, deverá exibir os números que estão no vetor que estão acima da média.

    public static void calculaMedia(int[] v){
        for (int i = 0; i < v.length; i++){
            System.out.print("v[" + i + "]=" + v[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner leitorMedia = new Scanner(System.in);
        int soma=0;
        int media = soma/10;

        int[] vetor = new int[10];

        for (int num : vetor) {
            soma += num;
        }
        System.out.println("A soma dos elementos do vetor é " + soma);

    }
}
