/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.desenvolvedor;

/**
 *
 * @author gabri
 */
public class DesenvolvedorMobile extends Desenvolvedor{
    private Integer qtdHoraTrabalhadasMobile;
    private Double valorHoraTrabalhadaMobile;

    public DesenvolvedorMobile(Integer qtdHoraTrabalhadasMobile, Double valorHoraTrabalhadaMobile, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHoraTrabalhadasMobile = qtdHoraTrabalhadasMobile;
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    public Integer getQtdHoraTrabalhadasMobile() {
        return qtdHoraTrabalhadasMobile;
    }

    public void setQtdHoraTrabalhadasMobile(Integer qtdHoraTrabalhadasMobile) {
        this.qtdHoraTrabalhadasMobile = qtdHoraTrabalhadasMobile;
    }

    public Double getValorHoraTrabalhadaMobile() {
        return valorHoraTrabalhadaMobile;
    }

    public void setValorHoraTrabalhadaMobile(Double valorHoraTrabalhadaMobile) {
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }
    
    @Override
    public Double getSalario(){
        return (this.valorHoraTrabalhadaMobile * this.qtdHoraTrabalhadasMobile+
                (super.getQtdHorasTrabalhadas() * super.getValorHoraTrabalhada()));
    }
    
    @Override
    public String toString() {
        return String.format("\nNome: %s"
                + "\nHoras Trabalhadas no mobile: %s"
                + "\nValor por hora mobile: %.0f",
                super.getNome(),this.qtdHoraTrabalhadasMobile, this.valorHoraTrabalhadaMobile);
    }
    
    
}
