package AulasReforcoJava;

import java.util.Locale;
import java.util.Scanner;

public class Aula0004_Exercicio06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        /*
        *Fazer um programa que leia três valores com ponto flutuante de
        * dupla precisão: A, B e C. Em seguida, calcule e mostre:
        *
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
        *
        * */


        System.out.println("Digite o valor A: ");
        double valueA = sc.nextDouble();
        System.out.println("Digite o valor B: ");
        double valueB = sc.nextDouble();
        System.out.println("Digite o valor C: ");
        double valueC = sc.nextDouble();

        //--
        double pi = 3.14159;
        double areaT6rianguloRetangulo = (valueA * valueC) / 2;
        double areaCirculo = pi * Math.pow(valueC, 2.0);
        double areaTrapezio = valueC * ((valueA + valueB) / 2);
        double areaQuadrado = Math.pow(valueB, 2.0);
        double areaRetangulo = valueA * valueB;

        //--

        System.out.println("A área do triângulo retângulo que tem A por base e C por altura: " + areaT6rianguloRetangulo);
        System.out.println("A área do círculo de raio C: " + areaCirculo);
        System.out.println("A área do trapézio que tem A e B por bases e C por altura: " + areaTrapezio);
        System.out.println("A área do quadrado que tem lado B: " + areaQuadrado);
        System.out.println("A área do retângulo que tem lados A e B: " + areaRetangulo);


        sc.close();


    } //-- end main

} //-- end classe
