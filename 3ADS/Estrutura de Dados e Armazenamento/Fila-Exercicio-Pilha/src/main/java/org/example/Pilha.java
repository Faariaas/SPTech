package org.example;

public class Pilha {

    private int[] pilha;

    private int topo;

//  ----CONSTRUTOR----
    public Pilha(int[] pilha, int topo) {
        this.pilha = pilha;
        this.topo = topo;
    }
//  ------------------

//  ----GETTERS & SETTERS----
    public int[] getPilha() {
        return pilha;
    }
    public int getTopo() {
        return topo;
    }
    public void setTopo(int topo) {
        this.topo = topo;
    }
    public void setPilha(int[] pilha) {
        this.pilha = pilha;
    }
//  -------------------------
}
