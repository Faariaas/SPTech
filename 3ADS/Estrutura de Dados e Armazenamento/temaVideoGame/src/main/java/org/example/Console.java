package org.example;

public abstract class Console implements AssinaturaOnine{
    private String nome;
    private String versao;
    private String modelo;

    public Console(String nome, String versao, String modelo) {
        this.nome = nome;
        this.versao = versao;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Console{" +
                "nome='" + nome + '\'' +
                ", versao='" + versao + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
