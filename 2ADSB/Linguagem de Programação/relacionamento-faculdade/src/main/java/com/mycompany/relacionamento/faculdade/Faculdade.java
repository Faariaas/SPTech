/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relacionamento.faculdade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel.f.a.santos
 */
public class Faculdade {
    private String nome;
    private List<Aluno> aluno;

    public Faculdade(String nome) {
        this.nome = nome;
        this.aluno = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return String.format("\nFaculdade: %s"
                + "\nLista de aluno: %s",
                nome, aluno);
    }
    
    public void matricularAluno(Aluno a){
        if (a != null){
            aluno.add(a);
        }else{
            System.out.println("null");
        }
    }
    
    public void cancelarMatricula(String ra){
        for (Aluno alunoNaVez : aluno) {
            if (alunoNaVez.getRa().equals(ra)){
                aluno.remove(alunoNaVez);
                System.out.println("Cacelado");
            }
        }
    }
    
    public void exibirAlunos(){
        System.out.println(aluno);
    }
    
    public void exibirAlunosPorSemestre(Integer semestre){
        for (Aluno alunoPorSemestre : aluno) {
            if(alunoPorSemestre.getSemestre().equals(semestre)){
                System.out.println(alunoPorSemestre);
            }
        }
    }
    
    public void exibirCancelados(){
        
    }
}
