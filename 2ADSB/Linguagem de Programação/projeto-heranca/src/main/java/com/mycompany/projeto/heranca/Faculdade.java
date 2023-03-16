/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.heranca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Faculdade {
    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList();
    }
    
    public void matricular(Aluno aluno){
        this.alunos.add(aluno);
    }
    
    public void excluirAlunoPorRA(String ra){
        
        for (int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getRa().equals(ra)){
                this.alunos.remove(i);
            }
        }
    }
    
    public void exibirAlunos(){
        System.out.println("Exibindo todos os alunos");
        //Exibir com FOR aprimorado exibiria o list entre conchetes []
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
    
    public void exibirAlunosGraduacao(){
        System.out.println("Exibindo alunos ocm graduação");
        for (Aluno aluno : alunos) {
            if(aluno instanceof AlunoGraduacao){
                System.out.println(aluno);
            }
        }
    }
}
