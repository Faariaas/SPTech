/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.vendedor.ocmicao;

/**
 *
 * @author gabriel.f.a.santos
 */
public class VendedorComicaoMaisFixo extends VendedorComicao{
    private Double salarioFixo;

    public VendedorComicaoMaisFixo(Double salarioFixo, Integer codigo, String nome, Double vendas, Double taxa) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }
    
    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    @Override
    public Double calcularSalario(){
        return (this.salarioFixo+(super.getVendas() * super.getTaxa()));
    }

    @Override
    public String toString() {
        return String.format("\nCodigo do vendedos: %s"
                + "\nNome do funcionario: %s"
                + "\nSalario fixo do funcionario: %.2f"
                + "\nVentas totais: %.1f"
                + "\ntaxa por venda: %.0f",
                super.getCodigo(), super.getNome(), this.salarioFixo, super.getVendas(), super.getTaxa());
    }
    
    
}
