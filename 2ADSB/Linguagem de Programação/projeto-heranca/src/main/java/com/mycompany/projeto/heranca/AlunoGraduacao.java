/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.heranca;

/**
 *
 * @author gabriel.f.a.santos
 */
public class AlunoGraduacao extends Aluno{
    private Double notaIntegrada;
    private Double notaContinuada;

    public AlunoGraduacao(Double notaIntegrada, Double notaContinuada, String ra, String nome, Double nota1, Double nota2) {
        super(ra, nome, nota1, nota2);
        this.notaIntegrada = notaIntegrada;
        this.notaContinuada = notaContinuada;
    }

    
            
    
    public Double getNotaIntegrada() {
        return notaIntegrada;
    }

    public void setNotaIntegrada(Double notaIntegrada) {
        this.notaIntegrada = notaIntegrada;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    @Override
    public Double calcularMedia() {
        return (super.getNota1()+ super.getNota2() + this.notaIntegrada + this.notaContinuada) /4; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return String.format("\nRa do aluno graduado: %s"
                + "\nNome do aluno graduado: %s"
                + "\nPrimeira Nota do aluno: %s"
                + "\nSegunda Nota do aluno: %s"
                + "\nNota da Integrada: %s"
                + "\nNota da ocntinuada: %s",
                super.getRa(),super.getNome(),super.getNota1(),super.getNota2(),this.notaIntegrada,this.notaContinuada);
    }
    
    
}
