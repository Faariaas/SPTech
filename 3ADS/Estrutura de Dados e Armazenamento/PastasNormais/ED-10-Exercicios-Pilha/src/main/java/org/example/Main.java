package org.example;

public class Main {
    public static void main(String[] args) {

        pulha pilha = new pulha(5);

        try {
            pilha.push(10);
            pilha.push(20);
            pilha.push(30);
            pilha.push(40);
            pilha.push(50);
            pilha.push(60);
        }
        catch (IllegalStateException erro) {
            System.out.println(erro);
        }

        pilha.exibe();
        System.out.println("Desempilhou: " + pilha.pop());
        pilha.exibe();
        System.out.println("Valor do topo: " + pilha.peek());
        System.out.println("Valor do topo: " + pilha.peek());
        pilha.exibe();

        System.out.println("\nEsvaziando a pilha:");
        while (!pilha.isEmpty()) {
            System.out.println("Desempilhou: " + pilha.pop());
        }
    }
}