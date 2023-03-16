package com.sptech.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {

    private List<Integer> inteiros;
    private List<Integer> numerosPares;
    private List<Integer> numerosImpares;
    private Integer soma = 0;
    private Integer maior = -1; 
    private Integer menor = 99999; 

    public ListaUtil() {
        inteiros = new ArrayList();
        numerosPares = new ArrayList();
        numerosImpares = new ArrayList();
    }

    public void add(Integer valor) {
        if (valor != null) {
            inteiros.add(valor);
            soma += valor;

            if (valor % 2 == 0) {
                numerosPares.add(valor);
            } else {
                numerosImpares.add(valor);
            }
            if( valor > maior && maior != null){
                maior = valor;
            } else
            if (valor < menor && menor != null){
               menor = valor; 
            }
        }
    }

    public void remove(Integer valor) {
        if (valor != null) {
            inteiros.remove(valor);
        }
    }

    public Integer count() {
        return inteiros.size();
    }

    public Integer countPares() {
        return numerosPares.size();
    }

    public Integer countImpares() {
        return numerosImpares.size();
    }

    public Integer somar() {
        return soma;
    }

    public Integer getMaior() {
        return maior;
    }

    public Integer getMenor() {
        return menor;
    }

    public Boolean hasDuplicidade() {
        return null;
    }
}
