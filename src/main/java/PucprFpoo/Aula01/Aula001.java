package PucprFpoo.Aula01;

import java.util.Scanner;

public class Aula001 {

    //--


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("O Número é Positivo!");
        } else if (numero < 0) {
            System.out.println("O Número é Negativo!");
        } else {
            System.out.println("O Número é Neutro!");
        }

        //--


        System.out.println("linha1\tcoluna1\nlinha2\tcoluna2");

        System.out.println("\n");


        //--

        /*
         * Exemplo de aplicação 1: crie um algoritmo em Java contendo uma variável do
         * tipo int, outra do tipo float e outra do tipo String.
         * A variável do tipo float precisa conter um valor.
         * O algoritmo também precisa ter duas constantes: uma do tipo float, e
         * outra do tipo String.
         * */

        //--

        int numerox;
        float altura = 1.70f;
        String nome;

        final float PI = 3.141617f;
        final String NOME_PAGINA = "home";

        // --

        /*
         * crie um algoritmo em Java que contenha
         * três variáveis inteiras,
         * duas booleanas e
         * uma do tipo float.
         * Utilize comentários e operadores aritméticos, lógicos e relacionais no seu código.
         * */

        //--


        int X, Y, Z;
        boolean p, q;
        float a = 10.5f;

        //-- Atribuição de Valores as Variáveis...

        X = 10;
        Y = X - 38;
        Z = 9 % 2;
        p = (3 >= 5);
        q = (true || false);

        System.out.println("O valor de X: " + X);
        System.out.println("O valor de Y: " + Y);
        System.out.println("O valor de Z: " + Z);
        System.out.println("O valor de p: " + p);
        System.out.println("O valor de q: " + q);
        System.out.printf("O valor de a é :%.2f ", a * 3);

        //--

        System.out.println("\n");

        int value = 8;

        switch (value) {
            case 1:
                System.out.println("O numero no swtch vale 01!");
                break;
            case 2:
                System.out.println("O número no swtch vale 02!");
                break;
            case 3:
                System.out.println("O número no swtch vale 3!");
                break;
            case 4:
                System.out.println("O número no swtch vale 4!");
                break;
            default:
                System.out.println("O número no swtch é diferente de 1  até 4!");
                break;
        }

        //--


        int cont = 1;

        while (cont <= 10) {
            System.out.println("Contador Vale: " + cont);
            cont++;
        }

        //--


        int contagem = 0;

        do {
            System.out.println("A Contagem ta Valendo: " + contagem);
            contagem++;
        } while (contagem < 1);


        //--


        for(int i = 0; i <= 10; i++){
            System.out.println("O número [ I ], esta  valendo: " + i);
        }

        //--



    }
    //-- fim main
}
