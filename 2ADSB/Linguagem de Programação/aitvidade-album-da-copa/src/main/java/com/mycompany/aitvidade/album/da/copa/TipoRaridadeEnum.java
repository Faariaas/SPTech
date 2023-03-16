/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aitvidade.album.da.copa;

/**
 *
 * @author gabriel.f.a.santos
 */
public enum TipoRaridadeEnum {
    LENDARIA("Landaria", 100.0), MITICA("Mitica", 75.0), RARA("Rara", 50.0), COMUM("Comun", 25.0);

    private final String nome;
    private final Double precoRevenda;

    private TipoRaridadeEnum(String nome, Double precoRevenda) {
        this.nome = nome;
        this.precoRevenda = precoRevenda;
    }

    public static TipoRaridadeEnum sortearRaridade(String nome) {
        for (int i = 0; i < TipoRaridadeEnum.values().length; i++) {
                if (TipoRaridadeEnum.values()[1].getNome().equals(nome)) {
                    return TipoRaridadeEnum.values()[1];
                }
            }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public Double getPrecoRevenda() {
        return precoRevenda;
    }

}
