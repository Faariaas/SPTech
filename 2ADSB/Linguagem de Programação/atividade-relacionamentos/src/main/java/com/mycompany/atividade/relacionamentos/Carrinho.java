/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade.relacionamentos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Carrinho {
    private String cliente;
    private List<Produto> produto;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produto = new ArrayList<>();
    }

    public Integer getQuantidade(){
        return produto.size();
    }
    
    public void adicionar(Produto p){
        produto.add(p);
        System.out.println("Adicionado");
    }
    
    public Boolean existsPorNome(String nome){
        return existsPorNome(nome);
    }
    
    public Integer getQauntidadePorCategoria(String nome){
        return produto.indexOf(nome);
    }
    
    public void limpar(){
        
    }
    
    public void removerPorNome(String nome){
        produto.remove(nome);
    }
    
    public List<Produto> getPorNome(String nome){
        return produto;
    }
    
    public Double getValorTotal(){
        Double valorTotal;
        
        for (int i = 0;; i++) {
            
        }
        
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return String.format("\nNome do Cliente: %s\n Lista de produtos: %s\n", cliente, produto);
    }
    
    
}
