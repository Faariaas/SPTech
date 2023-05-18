package org.example;

public class Main {
    public static void separaPositivoNegativoEmOrdem(int[] vetor) {
        var positiva = new FilaObj<Integer>(20);
        var negativa = new FilaObj<Integer>(20);

        for (int i = 0; i < vetor.length; i++) {
            var item = vetor[i];
            if (item >= 0) {
                negativa.insert(String.valueOf(item));
            } else {
                positiva.insert(String.valueOf(item));
            }
        }

        while (positiva.isEmpty()) {
            System.out.println(positiva.poll());
        }
        while (negativa.isEmpty()) {
            System.out.println(negativa.poll());
        }
    }

}