package br.com.aulasjava.AulasReforcoJava;
import java.util.Scanner;

    // OPERADORES BITWISE

    // & - Operação " E " bit a bit
    // | - Operção " OU " bit a bit
    // ^ - Operação " OU - exclusive " bit a bit

    // XOR -    OU EXCLUSIVE
    // Diferença: V ^ V = F

public class Aula0013 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero01 = 89;  //-- Valor em Binário : 0101 1001
        int numero02 = 60;  //-- Valor em Binário : 0011 1100

        // USANDO A OPERAÇÃO " E " bit a bit;
        int valueOperacaoE = numero01 & numero02; // RESULTADO 24 em Decimal -- Valor em Binário : 0001 1000

        System.out.println("USANDO A OPERAÇÃO \" E \" bit a bit:  " + valueOperacaoE);

        //--

        // USANDO A OPERAÇÃO " OU " bit a bit;

        //-- Valor em Binário : 0101 1001
        //-- Valor em Binário : 0011 1100
        // RESULTADO 125 em Decimal -- Valor em Binário : 0111 1101
        int valueOperacaoOu = numero01 | numero02;

        System.out.println("USANDO A OPERAÇÃO \" OU \" bit a bit:  " + valueOperacaoOu);


        //--

        // USANDO A OPERAÇÃO " XOR - OU - Exclusive " bit a bit;

        //-- Valor em Binário : 0101 1001
        //-- Valor em Binário : 0011 1100
        // RESULTADO 101 em Decimal -- Valor em Binário : 0110 0101
        int valueOperacaoXor = numero01 ^ numero02;

        System.out.println("USANDO A OPERAÇÃO \" XOR - OU - Exclusive \" bit a bit:  " + valueOperacaoXor);


        //--

        int mask = 0b00100000;
        System.out.println("Digite o valor para comparação: ");
        int valueEntrada = sc.nextInt();


        if ((valueEntrada & mask) != 0){
            System.out.println("6th bit is true");

        } else {
            System.out.println("6th bit is false");
        }



        sc.close();
    }   //--


}   //--
