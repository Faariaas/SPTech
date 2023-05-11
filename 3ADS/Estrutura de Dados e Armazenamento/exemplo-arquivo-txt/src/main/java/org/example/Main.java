package org.example;

import java.io.*;
import java.nio.Buffer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void gravaRegistro(String registro, String nomeArq) {
        BufferedWriter saida = null;

        //TryCatch pra abrir sapoha
        try{
            saida =new BufferedWriter(new FileWriter(nomeArq,true));
        }catch (IOException erro){
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        try{
            saida.append(registro + "\n");
            saida.close();
        }catch(IOException erro){
            System.out.println("Erro ao gravar essa po$#%*");
        }
    }

    public static void gravaArquivoTxt(List<Aluno> lista, String nomeArq) {
        int contaRegistroDadosGravdos = 0;
         String header = "00NOTA20231";
         header += LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
         header += "01";

         //Grava o registro
         gravaRegistro(header, nomeArq);

         //Monta e grava os registro do corpo
        String corpo;
        for (int i = 0 ; i < lista.size(); i++){
            Aluno a = lista.get(i);
            corpo = "02";
            corpo += String.format("%5.5s", a.getCurso());
            corpo += String.format("%8.8s", a.getRa());
            corpo += String.format("%-50.50s", a.getNome());
            corpo += String.format("%-40.40s", a.getDisciplina());
            corpo += String.format("%05.2f", a.getMedia());
            corpo += String.format("%03d", a.getQtdFalta());
            gravaRegistro(corpo, nomeArq);
            contaRegistroDadosGravdos ++;
            //Example : no %5.5 o primeiro numero 5 represene numero de caracteres disponivel como _____
            // ja o segundo 5 representa o numero de preenchimento dentro dos cinco primeiros
        }

        String traile = "01";
        traile += String.format("%010d", contaRegistroDadosGravdos);
        gravaRegistro(traile,nomeArq);
    }

    public static void leArquivoTxt(String nomeArq){
        BufferedReader entrada = null;
        String registro, tipoRegistro;
        String curso, ra, nome,disciplina;
        Double media;
        int qtdFalta;
        int contaRegistroDadosLidos = 0;
        int qtdRegistroDadosGravados;



        //tryCatch pra abrir os arquivos
        try {
            entrada = new BufferedReader(new FileReader(nomeArq));
        }catch (IOException erro){
            System.out.println("Erro ao abrir");
            System.exit(1);
        }

        try {
            registro = entrada.readLine();

                while (registro != null){
                    tipoRegistro = registro.substring(0,2);
                    if(tipoRegistro.equals("00")) {
                        System.out.println("É um registro de header");
                        System.out.println("Tipo arquivo: " + registro.substring(2,6));
                        System.out.println("Ano e Semestre: " + registro.substring(6,11));
                        System.out.println("Data e hora de gravação do arquivo: " + registro.substring(11, 30));
                        System.out.println("Versao do documento: " + registro.substring(30,32));
                    } else if (tipoRegistro.equals("01")) {
                        System.out.println("É um registro de traile");
                        qtdRegistroDadosGravados = Integer.parseInt(registro.substring(2,12));
                        if (qtdRegistroDadosGravados == contaRegistroDadosLidos){
                            System.out.println("Quantidadde de registors de daods gravados compativel com quantidade de registro de dados lidos");
                        } else{
                            System.out.println("Quantidadde de registors de daods gravados imcompativel com quantidade de registro de dados lidos");
                        }
                    } else if (tipoRegistro.equals("02")) {
                        System.out.printf("É um registro de dados ou corpo\n");
                        curso = registro.substring(2,7).trim();
                        ra = registro.substring(7,15).trim();
                        nome = registro.substring(15,65).trim();
                        disciplina = registro.substring(65,105).trim();
                        media = Double.valueOf(registro.substring(105, 110).replace(',', '.'));
                        qtdFalta = Integer.parseInt(registro.substring(110,113));
                        Aluno a = new Aluno(ra, nome, curso, disciplina, media, qtdFalta);
                        contaRegistroDadosLidos++;
                        //.trim tira os brancos essedentes

                        listaLida.add(a);
                    } else {
                        System.out.println("Tipo de registro invalido");
                    }
                    registro = entrada.readLine();
                }
                entrada.close();
        }
        catch(IOException erro){
            System.out.println("Eror ao ler o arquivo");
        }

        System.out.println("\n Lista contendo os dados lidos de arquivos");
        for (Aluno a: lista) {
            System.out.println();
        }

    }
    public static void main(String[] args) {
        List<Aluno> lista= new ArrayList<>();
        lista.add(new Aluno("0122101", "Gabriel Farias Santos", "ADS", "Pesquisa e Inovação", 9.5, 4));
        lista.add(new Aluno("0122150", "Andrey Rodrigues", "ADS", "Estrutura de dados", 5.5, 9));
        lista.add(new Aluno("0122149", "Eduardo Francisco", "CCO", "Analise de algoritimos", 8.0, 13));
        lista.add(new Aluno("0122todos", "Poderosissimo FELIX", "Todas", "Todas", 10.0, 0));

        System.out.println("Lista Original:");
        for(Aluno a: lista){
            System.out.println(a);
        }

        //gravaArquivoTxt(lista, "aluno.txt");

        leArquivoTxt("aluno.txt");
    }
}