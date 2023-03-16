/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avaliacao.continuada1.gabriel.farias;

import java.util.Scanner;

/**
 *
 * @author gabriel.f.a.santos
 */
public class GabrielFarias {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        
        Double Conta = 0.0;
        for(int i = 0; i >= 0; i++){
        System.out.println("Ola, oque deseja fazer:");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Simular investimentos");
        System.out.println("0 - Sair");
        
        Double AReceber = Leitor.nextDouble();
        
        
        if(AReceber == 1){
            System.out.println("Digite o valor do deposito:");
            Double Deposito = Leitor.nextDouble();
            if(Deposito > 0){
                
            Conta += Deposito;
            
                System.out.println("Deposito realizado - Saldo atual: R$ " + Conta);
            }else{
                System.out.println("Valor invalido");
            }
            
        }
        if(AReceber == 2){
            System.out.println("Digite o valor do saque:");
            Double Saque = Leitor.nextDouble();
            if(Saque < Conta){
                
                Conta -= Saque;
                
                System.out.println("Saque realizado - Saldo Atual: R$ " + Conta);
                
            }else{
                System.out.println("Valo Invalido");
            }
        }
        if(AReceber == 3){
            System.out.println("Saldo Atual: R$ " + Conta);
            if(Conta > 0){
                Double Simula = Conta;
                for(int a = 1; a <= 12; a++){
                    Simula += Simula * 0.10;
                    System.out.println(String.format("Mes %d  | Saldo: R$ %.2f", a, Simula));
                    
                }
            }else{
                System.out.println("Conta zerada, Operação invalida");
            }
        }
        if(AReceber == 0){
            i = -2;
            
        }
        }
    }
}
