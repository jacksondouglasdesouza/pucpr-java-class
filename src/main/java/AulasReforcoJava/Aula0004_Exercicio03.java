package AulasReforcoJava;

import java.util.Locale;
import java.util.Scanner;

public class Aula0004_Exercicio03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        /*
        * Fazer um programa para ler quatro valores inteiros A, B, C e D.
        * A seguir, calcule e mostre a diferença do produto
        * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        * */

        int value1, value2, value3, value4;

        System.out.println("Digite Quatro Valores Inteiros: ");

        value1 = Integer.parseInt(sc.nextLine());
        value2 = Integer.parseInt(sc.nextLine());
        value3 = Integer.parseInt(sc.nextLine());
        value4 = Integer.parseInt(sc.nextLine());

        int diferenca = value1 * value2 - value3 * value4;

        System.out.println("A a diferença do produto de A e B pelo produto de C e D e de: " + diferenca);


        sc.close();

    }
}
