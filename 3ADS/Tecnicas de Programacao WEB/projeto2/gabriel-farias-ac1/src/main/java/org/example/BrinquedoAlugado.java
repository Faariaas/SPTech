package org.example;

public class BrinquedoAlugado extends Atracoes{

    private int valorHora;
    private int qtdHoraAlugada;

    public BrinquedoAlugado(int cadigo, String nome, int valorHora, int qtdHoraAlugada) {
        super(cadigo, nome);
        this.valorHora = valorHora;
        this.qtdHoraAlugada = qtdHoraAlugada;
    }

    @Override
    public int getRenda() {
        return valorHora * qtdHoraAlugada;
    }

    @Override
    public Double getValorImposto() {
        return getRenda() * 0.13;
    }

    @Override
    public String toString() {
        return "BrinquedoAlugado{" +
                "valorHora=" + valorHora +
                ", qtdHoraAlugada=" + qtdHoraAlugada +
                "} " + super.toString();
    }
}
