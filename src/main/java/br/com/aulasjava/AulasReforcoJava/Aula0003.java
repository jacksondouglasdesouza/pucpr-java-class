package br.com.aulasjava.AulasReforcoJava;
import java.util.Locale;
import java.util.Scanner;

public class Aula0003 {

    //-- SCANNER -- Entrada de Dados no Código.


    public static void main(String[] args) {

        Locale.setDefault(Locale.US); //-- Define o código com padrões Americano.
        // Por exemplo, quando digitado um número em vez de usar vírgula, podemos usar o ponto, normalmente!

        Scanner sc = new Scanner(System.in);

        //--

        System.out.println("Digite o seu nome: ");
        String nome = sc.next();  //-- Vai receber e armazenar os dados na variáve nome;
        //--
        System.out.println("Agora digite um número: ");
        int numero = sc.nextInt(); //-- Vai receber e armazenar os dados na variável numero;
        //--
        System.out.println("Agora digite um número Double: ");
        double Double = sc.nextDouble(); //-- Vai receber e armazenar os dados na variável Double;
        //--

        //Pegando a primeira entrada do dados somente.

        System.out.println("Digite Seu sexo: ");
        char sexo = sc.next().charAt(0);

        //--

        //Entrada de Dados na mesm linha:

        System.out.println("Digite uma String: ");
        String umaString = sc.next();
        System.out.println("Digite um número inteiro: ");
        int umInteiro = sc.nextInt();
        System.out.println("Digite um número Double: ");
        double umDouble = sc.nextDouble();



        sc.close();  //-- Encerrar o processamento do Scanner;

        //--

        System.out.println(nome);
        System.out.println(numero);
        System.out.println(Double);
        System.out.println(sexo);
        //--

        System.out.println(umaString + " " + umInteiro + " " + umDouble);


    }
}
