package org.example;

import java.util.List;

public class ControleImposto {

    private List<Atracoes> lista;

    public Double totalImposto(){
        Double total = 0.0;
                for (Atracoes a: lista){
                    total += a.getValorImposto();
                }
                return total;
    }
}
