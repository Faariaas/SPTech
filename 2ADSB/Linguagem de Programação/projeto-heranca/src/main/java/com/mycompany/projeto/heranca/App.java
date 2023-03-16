/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.heranca;

/**
 *
 * @author gabriel.f.a.santos
 */
public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("1234", "Felix", 7.0, 4.56);
        AlunoGraduacao graduado1 = new AlunoGraduacao(9.0, 6.87, "456", "Gabriel", 7.0, 4.56);
        
        System.out.println(aluno1);
        System.out.println(String.format("A Madia do %s é: %.1f \n",
                aluno1.getNome(),aluno1.calcularMedia()));
        
        System.out.println("-~-".repeat(20));
        
        System.out.println(graduado1);
        System.out.println(String.format("A Madia do %s é: %.1f",
                graduado1.getNome(),graduado1.calcularMedia()));
        
        System.out.println("~-~".repeat(20));
        
        Faculdade f01 = new Faculdade("SPTech");
        f01.matricular(aluno1);
        f01.matricular(graduado1);
        
        f01.exibirAlunos();
        f01.exibirAlunosGraduacao();
    }
}
