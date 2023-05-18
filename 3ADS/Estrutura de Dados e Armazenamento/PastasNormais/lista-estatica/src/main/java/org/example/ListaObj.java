package org.example;

public class ListaObj <T> {

    private T[] vetor;
    private int nroElem;

    public ListaObj(int tamanho) {
        vetor = (T[]) new Object[tamanho];
    }

    public

    public void adiciona(int elemento) {
        if (nroElem >= vetor.length) {
            System.out.println("Lista está cheia");
        }
        else {
            vetor[nroElem++] = elemento;
        }
    }
    public void exibe() {
        if (nroElem == 0) {
            System.out.println("\nA lista está vazia.");
        }
        else {
            System.out.println("\nElementos da lista:");
            for (int i = 0; i < nroElem; i++) {
                System.out.print(vetor[i] + "\t");
            };
            System.out.println();
        }
    }
    public int busca(int elementoBuscado) {
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elementoBuscado) {   // se encontrou
                return i;                        // retorna seu índice
            }
        }
        return -1;    // não encontrou, retorna -1
    }
    public boolean removePeloIndice (int indice) {
        if (indice < 0 || indice >= nroElem) {
            System.out.println("\nÍndice inválido!");
            return false;
        }
        // Loop para "deslocar para a esquerda" os elementos do vetor
        // sobrescrevendo o elemento removido
        for (int i = indice; i < nroElem-1; i++) {
            vetor[i] = vetor[i+1];
        }
        nroElem--;          // decrementa nroElem
        return true;
    }
    public boolean removeElemento(int elementoARemover) {
        return removePeloIndice(busca(elementoARemover));
    }

}
