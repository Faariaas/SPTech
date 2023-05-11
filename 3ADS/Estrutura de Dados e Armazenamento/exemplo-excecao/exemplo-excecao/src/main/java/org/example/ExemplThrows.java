package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemplThrows {
    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digita qualquer merda ai");
            int numerador = leitor.nextInt();

            System.out.println("Digita mais merda ai, se preocupa nao filhao");
            int denominador = leitor.nextInt();

            System.out.println(numerador + denominador + divide(numerador,denominador));
        } catch (ArithmeticException erro){
            System.out.println("Divisão por zero!");
            erro.printStackTrace();
        } catch (InputMismatchException erro){
            System.out.println("Digite apenas numeros");
            erro.printStackTrace();
        }
    }
}
