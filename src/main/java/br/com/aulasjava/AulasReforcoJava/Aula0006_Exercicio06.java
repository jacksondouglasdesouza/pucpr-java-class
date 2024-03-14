package br.com.aulasjava.AulasReforcoJava;
import java.util.Scanner;

/*
    Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
    seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
    nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
*/

public class Aula0006_Exercicio06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        double value = sc.nextDouble();

        if(value < 0.0 || value > 100.0) {
            System.out.println("Só são permitidos valores entre 0 e 100!");
        }else if (value >= 0.0 && value <= 25.0){
            System.out.println("O valor está no Intervalo de [ 0, 25 ]");
        } else if (value > 25.0 && value <= 50.0) {
            System.out.println("O valor está no Intervalo de [ 25, 50 ]");
        } else if (value > 50.0 && value <= 75.0) {
            System.out.println("O valor está no Intervado de [ 50, 75 ]");
        }else if (value > 75 && value <= 100){
            System.out.println("O valor está no Intervalo de [ 75, 100 ]");
        } else {
            System.out.println("Dados Inválidos!");
        }


        sc.close();


    }





} //-- Fim da Classe


