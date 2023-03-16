/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio.conta.corrente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AlfaUser
 */
public class ContaCorrente {
    private String titular;
    private Double saldo;
    private List<Historico> listHistorico;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.listHistorico = new ArrayList<>();
    }
    
    public void depositar(Double valor, Integer dia, Integer mes, Integer ano) {
        if (valor > 0 && dia > 0 && dia <= 31 && mes > 0 && mes <= 12  && ano > 0) {
            saldo += valor;
            Historico h = new Historico(dia, mes, ano, valor, "Depositar");
            listHistorico.add(h);
        }
    }
    
    public void sacar(Double valor,  Integer dia, Integer mes, Integer ano) {
        if (valor > 0 && dia > 0 && dia <= 31 && mes > 0 && mes <= 12  && ano > 0 && saldo >= valor) {
            saldo -= valor;
            Historico h = new Historico(dia, mes, ano, valor, "Saque");
            listHistorico.add(h);

        }
    }
    
    public void exibirExtrato() {
        for (Historico historico : listHistorico) {
            System.out.println(historico);
        }
    }

    @Override
    public String toString() {
        return String.format("\nTitular: %s"
                + "\nSaldo: %.2f"
                + "\n===================================================",titular,saldo);
    }
    
    
    
    
}
