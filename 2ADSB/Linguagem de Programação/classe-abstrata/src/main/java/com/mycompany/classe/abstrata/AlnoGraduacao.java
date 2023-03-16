/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classe.abstrata;

/**
 *
 * @author gabriel.f.a.santos
 */
public class AlnoGraduacao extends Aluno{
    private Double notaIntegreda;
    private Double notaContinuada;

    public AlnoGraduacao(Double notaIntegreda, Double notaContinuada, String nome, String ra) {
        super(nome, ra);
        this.notaIntegreda = notaIntegreda;
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaIntegreda() {
        return notaIntegreda;
    }

    public void setNotaIntegreda(Double notaIntegreda) {
        this.notaIntegreda = notaIntegreda;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    @Override
    public Double calcularMedia() {
        return (notaContinuada * 0.4) + (notaIntegreda * 0.6);
    }
    
    
}
