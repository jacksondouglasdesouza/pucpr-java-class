package br.com.aulasjava.AulasReforcoJava;
import java.util.Scanner;


/*
*   Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
*   um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
*   4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
*   que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
*   mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível,
* * */


public class Aula0010_Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int gasolina = 0;
        int alcool = 0;
        int dissel = 0;

        System.out.println("**************************************************");
        System.out.println("1 - Gasolina | 2 - Álcool | 3 - Diesel | 4 - sair ");
        System.out.println("**************************************************");
        System.out.println("Escolha um Opção para Abastecimento: ");
        int valueEscolha = sc.nextInt();

        //--

        boolean sair = false;

        while (sair != true){

            if (valueEscolha == 1){
                gasolina += 1;
            } else if (valueEscolha == 2) {
                alcool += 1;
            } else if (valueEscolha == 3) {
                dissel += 1;
            } else if(valueEscolha == 4){
                sair = true;
                break;
            }

            //--

            System.out.println("**************************************************");
            System.out.println("1 - Gasolina | 2 - Álcool | 3 - Diesel | 4 - sair ");
            System.out.println("**************************************************");
            System.out.println("Escolha um Opção para Abastecimento: ");
            valueEscolha = sc.nextInt();

        }


        //--

        sc.close();

        System.out.println("Você Abasteceu com Sucesso!");
        System.out.println("Quantidade de Clientes Abasteceram - Gasolina: " + gasolina);
        System.out.println("Quantidade de Clientes Abasteceram - Álcool: " + alcool);
        System.out.println("Quantidade de Clientes Abasteceram - Diesel: " + dissel);
        System.out.println("Programa Finalizado!");



        //-- end main
    }

    //-- end class
}
