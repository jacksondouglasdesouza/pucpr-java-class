package AulasReforcoJava;

import java.util.Locale;
import java.util.Scanner;

public class Aula0004_Exercicio04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        /*
        * Fazer um programa que leia de um funcionário,
        * Código do Colaborador;
        * seu número de horas trabalhadas,
        * o valor que recebe por hora e
        * calcula o salário desse funcionário.
        * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
        * */

        System.out.println("Digite o seu registro: ");
        int registroFuncional = sc.nextInt();
        System.out.println("Digite o Número de Horas trabalhadas");
        int numeroHoras = sc.nextInt();
        System.out.println("Digite o valor da hora de Trabalho recebido: ");
        double valorDaHora = sc.nextDouble();

        double salarioColaborador = (double) numeroHoras * valorDaHora;

        System.out.println("Seu Registro Funcional é: " + registroFuncional);
        System.out.println("Seu Salário a receber é de: R$: " + salarioColaborador);

        sc.close();

    }
}
