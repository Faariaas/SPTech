/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relacionamento.faculdade;

/**
 *
 * @author gabriel.f.a.santos
 */
public class TesteFaculdade {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("01221010", "Gabriel", 2);
        Aluno a2 = new Aluno("01221011", "Matheus", 4);
        Aluno a3 = new Aluno("01221012", "Felix", 2);
        
        Faculdade f1 = new Faculdade("SPtech");
        
        f1.matricularAluno(a1);
        f1.matricularAluno(a2);
        f1.matricularAluno(a3);
        f1.exibirAlunos();
            System.out.println(f1);
    }
}
