package org.example;

import java.util.Date;

public class videoJogos {
    private int id;
    private String nome;
    private String categoria;
    private Double valor;
//    private Date dataDeLançamento;
    private String produtora;

    public videoJogos(int id, String nome, String categoria, Double valor, String produtora) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.valor = valor;
//        this.dataDeLançamento = dataDeLançamento;
        this.produtora = produtora;
    }

    @Override
    public String toString() {
        return "videoJogos{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", categoria='" + categoria + '\'' +
                ", valor=" + valor +
//                ", dataDeLançamento=" + dataDeLançamento +
                ", produtora='" + produtora + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

//    public Date getDataDeLançamento() {
//        return dataDeLançamento;
//    }
//
//    public void setDataDeLançamento(Date dataDeLançamento) {
//        this.dataDeLançamento = dataDeLançamento;
//    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }
}
