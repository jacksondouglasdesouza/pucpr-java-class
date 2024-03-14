package br.com.aulasjava.AulasReforcoJava;
import java.util.Scanner;
public class Aula0004_Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        mensagem explicativa.
        * */

        int numeroDigitado01, numeroDigitado02;

        System.out.println("Digite 2 Números inteiros: ");

        numeroDigitado01 = Integer.parseInt(sc.nextLine());
        numeroDigitado02 = Integer.parseInt(sc.nextLine());

        sc.close();

        int soma = numeroDigitado01 + numeroDigitado02;

        System.out.println("A soma dos números é: " + soma);




    }
}
