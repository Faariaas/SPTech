/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.relacionamento.petshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author gabriel.f.a.santos
 */
public class PetShop {

    private String nome;
    private Double faturamento;
    private List<Pet> listaPet;

    public PetShop(String nome, Double faturamento) {
        this.nome = nome;
        this.faturamento = faturamento;
        this.listaPet = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }

    public void darBanho(Pet pet, Double valor) {
        if(!listaPet.contains(pet)){
                listaPet.add(pet);
                System.out.println("Adicionado");
                
            
            
        } 
faturamento += valor;
                pet.setQtdVisitas(pet.getQtdVisitas()+1);
                pet.setValorGasto(pet.getValorGasto() + valor);
    }

    public void darBanho(Pet pet, Double valor, Double valorDesconto) {
        if (pet != null) {
            listaPet.add(pet);
            System.out.println("Adicionado");
            faturamento += valor;
            if(listaPet.contains(nome)){
                pet.setQtdVisitas(pet.getQtdVisitas()+1);
                pet.setValorGasto(pet.getValorGasto() +pet.getValorGasto());
            }
            
        } else {
            System.out.println("null");
        }
    }

    @Override
    public String toString() {
        return String.format("\n==============="
                + "\nNome: %s"
                + "\nFaturamento: %s"
                + "\nDados dos Animais: %s",
                nome, faturamento, listaPet);
    }

}
