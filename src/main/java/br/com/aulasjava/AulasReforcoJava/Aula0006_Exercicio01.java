package br.com.aulasjava.AulasReforcoJava;
import java.util.Scanner;

public class Aula0006_Exercicio01 {

    /*
     * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
     * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        int numero = sc.nextInt();

        if (numero > 0){
            System.out.println("O Número Digitado é Positivo!");
        } else if (numero< 0) {
            System.out.println("O Número Digitado é Negativo!");
        } else{
            System.out.println("O Número Digitado é Nulo!");
        }

        //--

        sc.close();


    }
}


