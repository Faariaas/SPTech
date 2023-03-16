package org.example;

public interface Vendavel {
    public default double getValorVenda(){
        return getValorVenda();
    };
}
