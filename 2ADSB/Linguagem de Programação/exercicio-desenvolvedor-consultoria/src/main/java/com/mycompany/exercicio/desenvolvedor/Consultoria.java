/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.desenvolvedor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Consultoria {
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedor;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedor = new ArrayList();
    }
    
    public Boolean existePorNome(String nome){
        for (Desenvolvedor desenvolvedor1 : desenvolvedor) {
            if(desenvolvedor1.getNome().equals(nome)){
            System.out.println(String.format("\nO nome '%s' existe na lista", desenvolvedor1.getNome()));
            return true;
            }
        }
        return false;
    }
    
    public void contratar(Desenvolvedor d){
        this.desenvolvedor.add(d);
    }
    
    public Integer getQuandidadeDesenvolvedor(){
        System.out.println(String.format("\nA lista possui %s Devs", desenvolvedor.size()));
        return desenvolvedor.size();
    }
    
    public Integer getQuandidadeDesenvolvedorMobile(){
        Integer ocntador = 0;
        for (Desenvolvedor desenvolvedor1 : desenvolvedor) {
            if(desenvolvedor1 instanceof DesenvolvedorMobile){
                ocntador++;
                System.out.println(String.format("\nA lista possui %s Devs Mobile", ocntador));
            }
        }
        return ocntador;
    }
    
    public Double getTotalSalarios(){
        Double totalSalariosContador = 0.0;
        for (int i = 0; i < desenvolvedor.size(); i++) {
            totalSalariosContador += desenvolvedor.get(i).getSalario();
            System.out.println(String.format("Total de salarios: %s", totalSalariosContador));
            return totalSalariosContador;
        }
        return null;
    }
    
    public Desenvolvedor buscarDesenvolvedorPorNome(String nome){
        System.out.println("Buscando por nome:");
        for (Desenvolvedor desenvolvedor1 : desenvolvedor) {
            if(desenvolvedor1.getNome().equals(nome)){
                System.out.println(desenvolvedor1);
                return desenvolvedor1;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("\nA consultoria %S"
                + "\nPossui %s vagas,"
                + "\nCandidatos: %S", this.nome,this.vagas, this.desenvolvedor);
    }
}
