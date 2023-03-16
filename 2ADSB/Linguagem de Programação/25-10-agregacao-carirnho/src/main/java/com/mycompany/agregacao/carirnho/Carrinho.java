/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agregacao.carirnho;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Carrinho {
    private String cliente;
    private List<Produto> produto;

    //Nao precisa passar nada a lista de produtos...
    //...para criar um carinho
    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produto = new ArrayList<>();
        // -se nao colocar nada aceita qualquer coisa
        //                                      ROSA, Matheus
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProduto() {
        return produto;
    }
    
    public Integer getQuantidade(){
        return produto.size();
    }
    
    public void adicionar(Produto p){
        if (p != null){
            produto.add(p);
            System.out.println("Adicionado");
        }else{
            System.out.println("Null");
        }
    }
    
    public Boolean existePorNome(String nome){
        
//        for (int i = 0; i < produto.size(); i++) {
//            //Daria pra colocar
//            //Produto produtoDaVez = produto.get(i);
//            //==>  if(produtoDaVez.getNome().equals(Nome))
//            //que daria tambem =)
//            if(produto.get(i).getNome().equals(nome)){
//                return true;
//            }
//        }

        for (Produto produtoDaVez : produto) {
            if(produtoDaVez.getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }
    
    public Integer getQuantidadePorCategoria(String nomeCategoria){
        Integer qunatidadeTotal = 0;
        
        for (Produto produtoDaVez : produto) {
            if(produtoDaVez.getCategoria().equals(nomeCategoria)){
                qunatidadeTotal++;
            }
        }
        return qunatidadeTotal;
    }
    
    public void limpar(){
        produto.clear(); //1º maneira de limapar o Carrinho
//        produto.removeAll(produto);//2º maneira de limpar o carrinho
//        produto = new ArrayList();// 3º manirea de limpar o carirnho
        for (int i = 0; i < 10; i++) {
            produto.remove(i);
        }
    }
    
    public Produto getPorNome(String nome){
        for(Produto produtoDaVez : produto){
            if (produtoDaVez.getNome().equals(nome)){
                return produtoDaVez;
            }
        }
        return null;
    }
    
    public Double getValorTotal(){
        Double valorTotal = 0.0;
        for (Produto produto : produto) {
            valorTotal = valorTotal + produto.getPreco();
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return String.format("\nNome do Cliente: %s"
                + "\nLista de Compras: %s"
                    ,cliente, produto);
    }
    
    
}
