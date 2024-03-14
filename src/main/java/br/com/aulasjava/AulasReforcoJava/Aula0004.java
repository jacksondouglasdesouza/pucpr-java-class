package br.com.aulasjava.AulasReforcoJava;
import java.util.Scanner;

public class Aula0004 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String entrada01, entrada02, entrada03, vazio;
        int x;

        System.out.println("Digites os três dados: ");

        x = sc.nextInt();
        vazio = sc.nextLine();
        entrada01 = sc.nextLine();
        entrada02 = sc.nextLine();
        entrada03 = sc.nextLine();
        System.out.println("DADOS DIGITADOS: ");
        System.out.println(x);
        System.out.println(entrada01);
        System.out.println(entrada02);
        System.out.println(entrada03);



        sc.close();

    }


}

