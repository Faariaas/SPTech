package org.example;

public abstract class Atracoes {

    private int cadigo;
    private String nome;

    //Criação do contrutor


    public Atracoes(int cadigo, String nome) {
        this.cadigo = cadigo;
        this.nome = nome;
    }

    //Metodo Abstrato
    public abstract int getRenda();
    public abstract Double getValorImposto();

    //ToString

    @Override
    public String toString() {
        return "Atracoes{" +
                "cadigo=" + cadigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}
