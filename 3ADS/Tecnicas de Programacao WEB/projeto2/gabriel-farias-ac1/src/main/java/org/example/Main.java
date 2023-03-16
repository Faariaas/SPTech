package org.example;

public class Main {
    public static void main(String[] args) {

        //adicionando
        BrinquedoAlugado bA = new BrinquedoAlugado(1, "Evolution", 10, 3) {
        };
        BrinquedoIngresso bI = new BrinquedoIngresso(2,"MontanhaRussa",35,134){
        };

        //exibindo
        System.out.println(bA);
        System.out.println(bI);
    }
}