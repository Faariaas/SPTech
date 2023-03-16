/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.vendedor.ocmicao;

/**
 *
 * @author gabriel.f.a.santos
 */
public class VendedorComicao {
    private Integer codigo;
    private String nome;
    private Double vendas;
    private Double taxa;

    public VendedorComicao(Integer codigo, String nome, Double vendas, Double taxa) {
        this.codigo = codigo;
        this.nome = nome;
        this.vendas = vendas;
        this.taxa = taxa;
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }
    
    public Double calcularSalario(){
        return (vendas * taxa);
    }

    @Override
    public String toString() {
        return String.format("\nCodigo: %s"
                + "\nNome: %s"
                + "\nVendas: %s"
                + "\nTaxa: %.0f",
                this.codigo, this.nome, this.vendas, this.taxa);
    }
    
    
}
