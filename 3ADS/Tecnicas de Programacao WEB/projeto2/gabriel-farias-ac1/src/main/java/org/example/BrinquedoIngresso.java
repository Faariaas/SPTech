package org.example;

public class BrinquedoIngresso extends Atracoes{

    private int valorIngresso;
    private int qtdIngressoVendido;

    //Construtor
    public BrinquedoIngresso(int cadigo, String nome, int valorIngresso, int qtdIngressoVendido) {
        super(cadigo, nome);
        this.valorIngresso = valorIngresso;
        this.qtdIngressoVendido = qtdIngressoVendido;
    }

    //Metodos

    @Override
    public int getRenda() {
        return valorIngresso * qtdIngressoVendido;
    }

    @Override
    public Double getValorImposto() {
        return getRenda() * 1.18;
    }

    @Override
    public String toString() {
        return "BrinquedoIngresso{" +
                "valorIngresso=" + valorIngresso +
                ", qtdIngressoVendido=" + qtdIngressoVendido +
                "} " + super.toString();
    }
}
