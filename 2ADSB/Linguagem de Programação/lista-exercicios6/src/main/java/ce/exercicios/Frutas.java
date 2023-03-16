/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ce.exercicios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cesar
 */
public class Frutas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> frutas = new ArrayList();
        frutas.add("Pera");
        frutas.add("maça");
        frutas.add("uva");
        frutas.add("jaboticaba");
        frutas.add("kiwi");
        frutas.add("banana");
        frutas.add("melão");
        frutas.add("manga");

        System.out.println("Informe a Fruta: ");
        String vf = in.nextLine();
        Integer contador = 0;

        for (int i = 0; i < frutas.size(); i++) {
            if (vf.equals(frutas.get(i))) {
                contador++;
                break;
            }
        }
        if(contador >= 1){
            System.out.println("A fruta " +vf+ " existe na lista.");
        }else{
            System.out.println("Não existe a fruta " +vf+ " na lista.");
        }
    }
}


