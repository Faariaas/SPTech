package org.example;

import java.util.Scanner;

public class Main {

    // Desafio 1
    // Exibir a soma dos elementos do vetor

    // Desafio 2
    // Exibir a quantidade de elementos pares do vetor

    // Desafio 3
    // Criar um vetor com os dias das semanas [Segunda, terça, quarta ...]
    // Solicitar que o usuario digite um numero de 1 a 7
    // e ficar num loop caso o numero nao seja entre 1 a 7
    // se for valido exibir o dia da semana correspondente
    // 1 = Domingo e assim por diante

    public static void exibeVetor(int[] v){
        for (int i = 0; i < v.length; i++){
            System.out.print("v[" + i + "]=" + v[i] + "\t");
        }
        System.out.println();
    }

    public static void somaVetor(int[] v){
        int soma = 0;
        for(int i = 0; i < v.length; i++ ){
             soma+=v[i];
        }
        System.out.println("Soma dos elementos é igual a: " + soma );
    }

    public static void exibePares(int[] v){
        int pares;
        for(int i = 0; i < v.length; i++ ){
            if (v[i]%2 == 0){
                pares++;
            }
        }
        System.out.println("Esses são os numeros pares: ");
    }
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //criação de um vetor de inteiros, tamanho 5
        int[] vetor = new int[4];

        // Criação de um 2ª Vetor de inteiros, ja inicializando com valores
        int[] vetor2 = {
                100, 200, 300, 40, 500, 600, 700
        };

        String[] vetor3 = new String[4];

//---------------------------------------------------------------------------------------------------
        // Criação de um vetor de dias da semana
        String[] diaSemana = {
                "Domingo", "Segunda", "Terça", "QUarta", "qu"
        };


//---------------------------------------------------------------------------------------------------
        // Inicializar o vetor ocm valores
        for(int i=0; i < vetor.length; i++){
            vetor[i] = i * 10;
        }

//---------------------------------------------------------------------------------------------------
        //Exibe o vetor
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Veotr[" + i + "]" + vetor[i]);
        }

//---------------------------------------------------------------------------------------------------
        //solicite que o usuario digite oos valores do vetor
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o valor de vetor[" + i + "]");
            vetor[i] = leitor.nextInt();
        }

//---------------------------------------------------------------------------------------------------
        // soliicite que o usuario escreva o valor do vetor
        for (int i = 0; i < vetor3.length; i++){
            System.out.println("Digite o valor do terciero vetor: [" + i + "]");
            vetor3[i] = leitor.nextLine();
        }

        for (int num : vetor){
            if(num%2 == 0){
                contaPares++;
            }
        }

        do {
            System.out.println();
            escolha = leitor.nextInt();
        } while (escolha  < 1 || escolha > 7);
        System.out.println("O dia da semana correpondente é : " + diaSemana[escolha - 1]);

        //Declaração de um quinto vetor de inteiros, cujo tamanho sera digitado pelo usuario

//---------------------------------------------------------------------------------------------------


        //exibindo vetor 1
        exibeVetor(vetor);

        //exibindo veotr 2
        exibeVetor(vetor2);

        //exibindo vetor 3
        for (String s : vetor3){
            System.out.print(s + "\t");
        }
        System.out.println();

        //Desafio 1 SOMA
        somaVetor(vetor);

        //Desafio 2 PARES

    }
}