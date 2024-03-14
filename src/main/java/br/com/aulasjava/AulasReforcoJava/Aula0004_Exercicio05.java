package br.com.aulasjava.AulasReforcoJava;

import java.util.Locale;
import java.util.Scanner;

public class Aula0004_Exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        /*
        * Fazer um programa para ler
        * o código de uma peça 1,
        * o número de peças 1,
        * o valor unitário de cada peça 1;
        *
        * código de uma peça 2,
        * o número de peças 2,
        * o valor unitário de cada peça 2.
        *
        * Calcule e mostre o valor a ser pago.
        * */

        int peca1 = 0;
        int peca2 = 0;
        int numeroPeca1 = 0;
        int numeroPeca2 = 0;
        double valorPeca1 = 0;
        double valorPeca2 = 0;

        System.out.println("Digite o Código do produto 01: ");
        peca1 = sc.nextInt();
        System.out.println("Quantas Peças do Produto você vai levar: ");
        numeroPeca1 = sc.nextInt();
        System.out.println("Qual o valor unitário da peça: ");
        valorPeca1 = sc.nextDouble();

        //--

        System.out.println("\nPronto, adicione outro produto! \n");

        //--

        System.out.println("Digite o Código do produto 02: ");
        peca2 = sc.nextInt();
        System.out.println("Quantas Peças do Produto você vai levar: ");
        numeroPeca2 = sc.nextInt();
        System.out.println("Qual o valor unitário da peça: ");
        valorPeca2 = sc.nextDouble();

        //--

        double totalPagarPeca1 = numeroPeca1 * valorPeca1;
        double totalPagarPeca2 = numeroPeca2 * valorPeca2;
        double totalPagar = totalPagarPeca1 + totalPagarPeca2;

        System.out.println("O valor  pagar e de: R$ " + totalPagar);

        sc.close();



    } //-- end main

} //-- end classe
