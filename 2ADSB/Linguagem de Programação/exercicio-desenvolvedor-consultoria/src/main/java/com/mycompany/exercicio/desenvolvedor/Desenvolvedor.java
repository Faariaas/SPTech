/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.desenvolvedor;

/**
 *
 * @author gabri
 */
public class Desenvolvedor {
    private String nome;
    private Integer qtdHorasTrabalhadas;
    private Double valorHoraTrabalhada;

    public Desenvolvedor(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(Integer qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public Double getSalario(){
        return (this.qtdHorasTrabalhadas * this.valorHoraTrabalhada);
    }
    
    @Override
    public String toString() {
        return String.format("\nNome: %s"
                + "\nHoras Trabalhadas: %s"
                + "\nValor por hora: %.0f",
                this.nome, this.qtdHorasTrabalhadas, this.valorHoraTrabalhada);
    }
    
}
