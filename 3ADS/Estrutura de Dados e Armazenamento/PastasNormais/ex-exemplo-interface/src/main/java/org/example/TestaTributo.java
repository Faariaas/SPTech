package org.example;

public class TestaTributo {
    public static void main(String[] args) {
        Alimento Arroz = new Alimento(01, "Muito Bom", 23.90, 22);
        Perfume Avon = new Perfume(02,"Aroma Amadeirado", 56.99, "Cheiro de Pau");
        Servico Pintura = new Servico("Encanador", 300.90);

        Tributo trib = new Tributo();

        trib.adicionaTributavel(Arroz);
        trib.adicionaTributavel(Avon);
        trib.adicionaTributavel(Pintura);

        trib.exibeTodos();

        System.out.printf("\nO total de tributos é: R$ %.2f\n", trib.calculaTotalTributo());
    }
}
