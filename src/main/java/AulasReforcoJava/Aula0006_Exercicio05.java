package AulasReforcoJava;
import java.util.Scanner;

public class Aula0006_Exercicio05 {

    /*
        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        seguir, calcule e mostre o valor da conta a pagar.
          Código  |      Produto      |    Preço
        ______________________________________________
            01    |   Dogão Quente    |    R$ 4,00
            02    |   X - Salada      |    R$ 4,50
            03    |   X - Bacon       |    R$ 5,00
            04    |   Torradas        |    R$ 2,00
            05    |   Refrigerantes   |    R$ 1,50
       _______________________________________________

     * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Código do Produto em Seguida digite a quantidade desejada: ");
        int id = Integer.parseInt(sc.nextLine());
        double quantidade = Integer.parseInt(sc.nextLine());

        double totalPagar = 0;

        switch (id){
            case 01:
                totalPagar = (double) quantidade * 4.0;
                break;
            case 02:
                totalPagar = (double) quantidade * 4.50;
                break;
            case 03:
                totalPagar = (double) quantidade * 5.0;
                break;
            case 04:
                totalPagar = (double) quantidade * 2.0;
                break;
            case 05:
                totalPagar = (double) quantidade * 1.50;
                break;
            default:
                System.out.println("Algo de Errado, Não está Certo!");
        }

        System.out.println("O Total a Pagar é: " + totalPagar);

        //--

        sc.close();



    } //--

    //-- Fim da Classe
}


