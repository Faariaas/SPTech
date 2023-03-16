/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Utilitaria {
    
    //Assinatura do método
    //Retorno: void, esse nao retorna nada
    //Nome: exibirLinha
    //Argumentos: aqui nao tem nenhum
    //O que tem dentro das {} é o CORPO do método
    public void exibirLinha(){
        System.out.println("-------------------");
    }
    
    //Método que recee um argumento
    //Ao criar mètodo
    //Podemos aprovietar o mesmo codigo varias vezes
    //E se mudar, mudo em um só lugar
    void exibirNome(String nome){
        System.out.println(String.format("Nome: %s", nome));
    }
    
    
    //Da pra chamar Metodos dentro de outros metodos
    //Como exibirNome e exibirLinha dentro do exibriNomeDecorado;
    void exibirNomeDecorado(String nomeDecorado){
        exibirLinha();
        exibirNome(nomeDecorado);
        exibirLinha();
    }
    
}
