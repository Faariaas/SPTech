package org.example;

public abstract class PlayStaion extends Console{
    private String nomeUsuario;
    private int quantAmigos;
    private int quantJogos;

    public PlayStaion(String nome, String versao, String modelo, String nomeUsuario, int quantAmigos, int quantJogos) {
        super(nome, versao, modelo);
        this.nomeUsuario = nomeUsuario;
        this.quantAmigos = quantAmigos;
        this.quantJogos = quantJogos;
    }

    @Override
    public String toString() {
        return "PlayStaion{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", quantAmigos=" + quantAmigos +
                ", quantJogos=" + quantJogos +
                "} " + super.toString();
    }
}
