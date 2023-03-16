/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento.aula.prova;

/**
 *
 * @author gabriel.f.a.santos
 */
public class RecursosHumanos {

    private Integer totalPromovidos;
    private Integer totalReajustados;

    public void reajustarSalario(Colaborador colaborador, Double reajuste) {
        Double novoSalario = colaborador.getSalario() + reajuste;
        colaborador.setSalario(novoSalario);

        totalReajustados++;

    }

    public void promovercolaborador(Colaborador colaborador, String novoCargo, Double novoSalario) {

        if (novoSalario > colaborador.getSalario()) {
            colaborador.setSalario(novoSalario);
            colaborador.setCargo(novoCargo);
            totalPromovidos++;
        } else {
            System.out.println("Operação invalida");
        }
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public void setTotalPromovidos(Integer totalPromovidos) {
        this.totalPromovidos = totalPromovidos;
    }

    public Integer getTotalReajustados() {
        return totalReajustados;
    }

    public void setTotalReajustados(Integer totalReajustados) {
        this.totalReajustados = totalReajustados;
    }

    @Override
    public String toString() {
        return "RecursosHumanos{" + "totalPromovidos=" + totalPromovidos + ", totalReajustados=" + totalReajustados + '}';
    }
    
    

}
