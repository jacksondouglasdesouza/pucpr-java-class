package AulasReforcoJava;
import java.util.Scanner;

public class Aula0006_Exercicio02 {

    /*
     * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
     * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //--

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número é Par!");
        } else {
            System.out.println("O número é Impar!");
        }

        //--

        sc.close();

    }
}


