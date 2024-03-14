package br.com.aulasjava.AulasReforcoJava;

public class Aula0005 {

    public static void main(String[] args) {

        //--

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25);
        //--

        System.out.println("Raiz Quadrade de " + x + " = " + A);
        System.out.println("Raiz Quadrada de " + y + " = " + B);
        System.out.println("Raiz Quadrada de 25 = " + C);
        System.out.println("\n");

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        //--

        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);
        System.out.println("\n");

        A = Math.abs(y);
        B = Math.abs(z);
        //--

        System.out.println("O valor Absoluto de " + y + " = " + A);
        System.out.println("O valor Absoluto de " + z + " = " + B);

        //- FUNÇÕES - FÓRMULA DE BÁSCARA

        /**
         * X = -b +ou- Raiz|b^2-4.a.c
         *     ______________________
         *             2.a
         */


        double a = 5.0;
        double b = 3.0;
        double c = -1.0;
        double xis01;
        double xis02;
        double delta;

        delta = Math.pow(b, 2.0) - 4.0 * a * c;

        xis01 = ((-b + Math.sqrt(delta)) / (2.0 * a));
        xis02 = ((-b - Math.sqrt(delta)) / (2.0 * a));

        System.out.println("Valor para X1 = " + xis01);
        System.out.println("Valor para X2 = " + xis02);


    } //-- End main

    //-- End Classe
}