package br.com.aulasjava.AulasReforcoJava;
import java.util.Scanner;


public class Aula0009 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double price = 400.00;
        double priceTwo = 5000.00;

        System.out.println(price);
        System.out.println(priceTwo);

        // ESCOPO DA VARIÁVEL

        double desconto = (price < 200.00) ? price * 0.1 : price * 0.05;

        System.out.println( desconto);

        if(priceTwo < 200.00){
            double descontoEscopo = priceTwo * 0.05;
        }

        // System.out.println(descontoEscopo); <<<  O Copilador vai da erro pois a variável
        // esta declarada somente dentro do IF.

        // Para a variável ser encontrada ela precisa está declarada fora do If.


        sc.close();



        //--
    }



    //--
}
