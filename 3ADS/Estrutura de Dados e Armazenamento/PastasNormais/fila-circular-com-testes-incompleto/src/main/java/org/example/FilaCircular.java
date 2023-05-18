package org.example;

public class FilaCircular {
    int tamanho, inicio, fim;
    String[] fila;

    // Construtor - Recebe a capacidade da fila (tamanho total do vetor)
    public FilaCircular(int capacidade) {
        // Cria o vetor para armazenar a fila e inicializa o tamanho
        fila = new String[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = 0;

    }

    // Método isEmpty() - Retorna true se a fila está vazia e false caso contrário
    public boolean isEmpty() {
        if(tamanho == 0){
            return true ;
        }
        return false ;
    }

    // Método isFull() - Retorna true se a fila está cheia e false caso contrário
    public boolean isFull() {
        if ( fila.length == tamanho ){
            return true;
        }
        return false;
    }

    // Método insert - Recebe informação a ser inserida na fila
    public void insert(String info) {
        if (isFull()){
            throw new IllegalStateException ("Lotou");
        }
        fila[fim++] = info;
        fim = (fim) % fila.length;
        tamanho++;
    }

    // Método peek() - Retorna o primeiro da fila, sem remover
    public String peek() {
        return fila[inicio];
    }

    // Método poll() - Retorna o primeiro da fila, removendo-o
    public String poll() {
        if (isEmpty()){
            return null;
        }
        String auxi = fila[inicio];
        fila[inicio]= null;
        inicio = (inicio + 1) % fila.length;
        tamanho--;
        return auxi;
    }

    // Método exibe() - exibe os elementos da fila
    public void exibe() {

    }

    public int getTamanho() {
        return tamanho;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFim() {
        return fim;
    }

    // Cria um vetor e percorre a fila adicionando os elementos no vetor (
    // Retorna o vetor criado e não a fila
    // Esse método é equivalente ao exibe, mas em vez de exibir os elementos da fila na console,
    // copia os elementos da fila para um vetor, na ordem em que seriam exibidos
    public String[] getFila(){
        String[] vetor = new String[tamanho];
        for (int i = 0, auxiliar = inicio; i < tamanho; i++, auxiliar = (auxiliar + 1) % fila.length) {
            vetor[i] = fila[auxiliar];
        }
        return vetor;
    }
}

