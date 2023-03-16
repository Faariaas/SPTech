/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classe.abstrata;

/**
 *
 * @author gabriel.f.a.santos
 */
public class AlunoPosGraduacao extends Aluno{
    private Double notaArigo;
    private Double notaProjeto;

    public AlunoPosGraduacao(Double notaArigo, Double notaProjeto, String nome, String ra) {
        super(nome, ra);
        this.notaArigo = notaArigo;
        this.notaProjeto = notaProjeto;
    }

    @Override
    public Double calcularMedia() {
        return (notaArigo + notaProjeto) / 2;
    }
    
    

    public Double getNotaArigo() {
        return notaArigo;
    }

    public void setNotaArigo(Double notaArigo) {
        this.notaArigo = notaArigo;
    }

    public Double getNotaProjeto() {
        return notaProjeto;
    }

    public void setNotaProjeto(Double notaProjeto) {
        this.notaProjeto = notaProjeto;
    }
    
    
}
