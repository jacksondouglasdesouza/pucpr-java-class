package AulasReforcoJava;
import java.util.Scanner;



public class Aula0011 {

    // ESTRUTURA DE REPETIÇÃO FOR

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;
        int resultado;
        int iteracoes = 0;
        int somaI = 0;

        for(int i = 0; i <= 10; i++){
            resultado = i * i;
            System.out.println(i + " X " + i + " = " + resultado);
            soma += resultado;
            iteracoes += 1;
            somaI += i;


        }

        //--

        System.out.println(" ");
        System.out.println("Ouve uma quantidade de: " + iteracoes + " iterações no laço For!");
        System.out.println("A soma das iterações vale = " + somaI);
        System.out.println("O soma do resultado de cada iteração de [ i ] vale = " + soma);




    } //-- end main


} //-- end class
