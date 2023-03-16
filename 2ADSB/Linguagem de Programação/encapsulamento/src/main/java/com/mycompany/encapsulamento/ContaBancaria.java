/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento;

/**
 *
 * @author gabriel.f.a.santos
 */
public class ContaBancaria {
    
    private Double saldo = 0.0;
    private String nomeTitular = "";
    
    void depositar(Double valorDeposito){
        if (valorDeposito > 0) {
        saldo += valorDeposito;
        }
    }
    
    void sacar(Double valorSaque){
        saldo -= valorSaque;
    }
    
    Double pegarSaldo(){
        return saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    
    
}
