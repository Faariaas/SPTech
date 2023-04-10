package org.example;

public class Main {
    public static void main(String[] args) {
        String nome1 = "Um Merda";
        String nome2 = "Felix";
        int ra1 = 50000;
        int ra2 = 60000;
        Double nota1 = 8.5;
        Double nota2 = 10.0;

        System.out.printf("-".repeat(30)+"\n");
        System.out.printf("%-7S %-14S %6S\n", "ra", "nome", "nota");
        System.out.printf("%-7d %-14s %6.2f\n", ra1, nome1, nota1);
        System.out.printf("%-7d %-14s %6.2f\n", ra2, nome2, nota2);
        System.out.printf("-".repeat(30)+"\n");

    }
}