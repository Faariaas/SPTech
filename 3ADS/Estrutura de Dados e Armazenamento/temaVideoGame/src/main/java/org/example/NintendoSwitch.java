package org.example;

public class NintendoSwitch extends Console{

    private String nomeUsuario;

    private String regiaoConta;
    private String quantJogosConta;

    public NintendoSwitch(String nome, String versao, String modelo, String nomeUsuario, String regiaoConta, String quantJogosConta) {
        super(nome, versao, modelo);
        this.nomeUsuario = nomeUsuario;
        this.regiaoConta = regiaoConta;
        this.quantJogosConta = quantJogosConta;
    }

    @Override
    public String toString() {
        return "NintendoSwitch{" +
                "nomeUsuario='" + nomeUsuario + '\'' +
                ", regiaoConta='" + regiaoConta + '\'' +
                ", quantJogosConta='" + quantJogosConta + '\'' +
                "} " + super.toString();
    }
}
