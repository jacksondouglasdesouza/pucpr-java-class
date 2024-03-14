package br.com.aulasjava.AulasReforcoJava;
import java.util.Scanner;

    //-- Algumas funções para String

public class Aula0014 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String strings = "AbcFr PoNhgtF plOMJBHV nkjlbxgdNJSWGDU NJKBFJWEB";

        String stringsMaiusculas = strings.toUpperCase();
        String stringMinusculas = strings.toLowerCase();
        String stringTrin = strings.trim();
        String stringSub = strings.substring(2);
        String stringSubLimite = strings.substring(2, 9);

        System.out.println("Essa é a estring Normal: - " + strings + "-");
        System.out.println(" ");
        System.out.println("Essas estão em Maiúsculas: - " + stringsMaiusculas + "-");
        System.out.println(" ");
        System.out.println("Essas estão em Minúsculas: - " + stringMinusculas + "-");
        System.out.println(" ");
        System.out.println("Essas estão sem espaços: - " + stringTrin  + " -");
        System.out.println(" ");
        System.out.println("Essas estão sem espaços: - " + stringSub  + " - subString(2)"); // Inicia apartir da 2 pos.
        System.out.println(" ");
        // Inicia apartir da 2 posição e Termina na 9 posição!
        System.out.println("Essas estão sem espaços: - " + stringSubLimite  + " - subString(2, 9)");
        System.out.println(" ");
        //--

        // O REPLACE VAI TROCAR O PRIMEIRO PARAMETRO PELO SEGUNDO PASSADO!
        String stringReplace = strings.replace("c", "7");
        String stringReplaceSub = strings.replace("nkj", "777");
        String stringReplaceSubTwo = strings.replace("JWEB", "7777");

        System.out.println(" ");
        System.out.println("Replace, trocando c minúsculo por 7: " + stringReplace);

        System.out.println(" ");
        System.out.println("Replace, trocando nkj minúsculo por 777: " + stringReplaceSub);
        System.out.println(" ");

        System.out.println("Replace, trocando nkj minúsculo por 777: " + stringReplaceSubTwo);
        System.out.println(" ");

        int indiceVariavelEnd = strings.indexOf("B"); // Vai buscar o index da primeira ocorrência de B;
        int indiceVariavelLast = strings.lastIndexOf("B");   // Vai buscar o index da última ocorrência de B;

        System.out.println(" ");
        System.out.println("Essa é a estring Normal: - " + strings + "-");
        System.out.println("O index da primeira ocorrência de B é: " + indiceVariavelEnd);
        System.out.println(" ");
        System.out.println("O index da última ocorrência de B é: " + indiceVariavelLast);

        //-- OPERAÇÕES COM SPLIT --//

        String listaDeStrings = "Batata Apple Lemon";

        String[] vetorStrings = listaDeStrings.split(" ");

        String vetorStringsPosicao01 = vetorStrings[0];
        String vetorStringsPosicao02 = vetorStrings[1];
        String vetorStringsPosicao03 = vetorStrings[2];

        System.out.println(" ");

        System.out.println(vetorStringsPosicao01);
        System.out.println(vetorStringsPosicao02);
        System.out.println(vetorStringsPosicao03);
        System.out.println("");
        System.out.println(vetorStrings[0]);
        System.out.println(vetorStrings[1]);
        System.out.println(vetorStrings[2]);


    }   //--


}   //--
