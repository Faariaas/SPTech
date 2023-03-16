/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo.relacionamento;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Contato {
    private String nome;
    private String telefone;
    private Boolean bloqueado;

        // No contrutor nao faz sentido puxar boolean entao tira o argumento e seta false ou true
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = false;
    }
    
    public void bloquear(){
        this.bloqueado = true;
    }
    
    public void desbloquear(){
        this.bloqueado = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(Boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    @Override
    public String toString() {
        return String.format("\nNome: %s\nTelfone: %s\nBloqueado: %s\n", nome, telefone, bloqueado ? "Sim":"Não");
    }
    
}
