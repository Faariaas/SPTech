package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListaOBJ<videoJogos> listaJogos = new ListaOBJ<>(3);

        listaJogos.adiciona(new videoJogos(1,"Gta", "rpg", 199.99, "Ubisoft"));
        listaJogos.adiciona(new videoJogos(2,"Gta2", "rpg2", 199.99, "Ubisoft2"));
        listaJogos.adiciona(new videoJogos(3,"Gta3", "rpg3", 199.99, "Ubisoft3"));

//        listaJogos.exibe();
        gravaArquivoCsv(listaJogos, "ListaDeJogos");
        System.out.println();
        leArquivoCsv("ListaDeJogos");

//        String nome1 = "Maria";
//        String nome2 = "João";
//        int ra1 = 50000;
//        int ra2 = 50001;
//        Double nota1 = 8.5;
//        Double nota2 = 10.0;
//
//        System.out.printf("-".repeat(20)+"\n");
//        System.out.printf("%-7S %-14S %7S\n", "ra", "nome", "nota");
//        System.out.printf("%07d %-14s %7.2f\n", ra1, nome1, nota1);
//        System.out.printf("%07d %-14s %7.2f\n", ra2, nome2, nota2);

    }
    public static void gravaArquivoCsv(ListaOBJ<videoJogos> lista, String nomeArq) {
        FileWriter arq = null;
        Formatter saida = null;
        Boolean deuRuim = false;

        nomeArq += ".csv";

        try {
            arq = new FileWriter(nomeArq);
            saida = new Formatter(arq);
        } catch (IOException erro) {
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        try {
            for (int i = 0; i < lista.getTamanho(); i++) {
                videoJogos jogo = lista.getElemento(i);
                saida.format("%d;%s;%s;%.2f\n", jogo.getId(),
                        jogo.getNome(),
                        jogo.getCategoria(),
                        jogo.getValor());
            }
        } catch (FormatterClosedException erro) {
            System.out.println("Erro ao gravar o arquivo");
            deuRuim = true;
        } finally {
            saida.close();
            try {
                arq.close();
            } catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }
    public static void leArquivoCsv(String nomeArq) {
        FileReader arq = null;
        Scanner entrada = null;
        Boolean deuRuim = false;

        nomeArq += ".csv";

        try {
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        } catch (FileNotFoundException erro) {
            System.out.println("Arquivo nao encontrado");
            System.exit(1);
        }

        try {
            System.out.printf("%4S %-15S %-9S %4S\n", "id", "nome", "categoria", "valor");
            while (entrada.hasNext()) {
                int id = entrada.nextInt();
                String nome = entrada.next();
                String categoria = entrada.next();
                Double valor = entrada.nextDouble();
                System.out.printf("%4d %-15s %-9s %4.1f\n", id, nome, categoria, valor);
            }
        } catch (NoSuchElementException erro) {
            System.out.println("Arquivo com problemas");
            deuRuim = true;
        } catch (IllegalStateException erro) {
            System.out.println("Erro na leitura do arquivo");
            deuRuim = true;
        } finally {
            entrada.close();
            try {
                arq.close();
            } catch (IOException erro) {
                System.out.println("Erro ao fechar o arquivo");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }
}