package org.example;

import java.util.ArrayList;

public class Tributo {
    private ArrayList<Tributavel> listaTrib;

    public Tributo() {
        listaTrib = new ArrayList<>();
    }

    public void adicionaTributavel(Tributavel t){
        listaTrib.add(t);
    }

    public void exibeTodos(){
        for (Tributavel t : listaTrib){
            System.out.println(t);
        }
    }
    public Double calculaTotalTributo(){
        Double total = 0.0;
        for (Tributavel t : listaTrib){
            total += t.getValorTributo();
        }
        return total;
    }
}
