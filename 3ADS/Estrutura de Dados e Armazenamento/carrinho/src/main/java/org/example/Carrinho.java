package org.example;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Vendavel> cart = new ArrayList<Vendavel>();

    public void adcionaVendavel(Vendavel t){
        cart.add(t);
    }

    public double calculaTotalVenda(){
        return 0;
    }

    public void exibeItensCarrinho(){
        System.out.println(cart);
    }
}
