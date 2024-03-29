package br.com.aulasjava.AulasReforcoJava;
import java.util.Scanner;

/*
* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
* */


public class Aula0010_Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senhaBancoDados = 2002;
        int senha;

        System.out.println("Digite sua senha: ");
        senha = sc.nextInt();

        while (senha != senhaBancoDados){
            System.out.println("Digite sua senha: ");
            senha = sc.nextInt();
            System.out.println("Senha Inválida!");
        }

        //--

        if(senha == senhaBancoDados){
            System.out.println("*******************************");
            System.out.println("*******************************");
            System.out.println("*****  Acesso Permitido!  *****");
            System.out.println("*******************************");
            System.out.println("*******************************");
        }

        sc.close();


        //-- end Main
    }


    //-- end class

}
