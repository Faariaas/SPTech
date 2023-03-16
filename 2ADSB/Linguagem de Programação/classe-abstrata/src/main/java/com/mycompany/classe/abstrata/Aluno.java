/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classe.abstrata;

/**
 *
 * @author gabriel.f.a.santos
 */
public abstract class Aluno {
    private String nome;
    private String ra;

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
    public abstract Double calcularMedia();
}
