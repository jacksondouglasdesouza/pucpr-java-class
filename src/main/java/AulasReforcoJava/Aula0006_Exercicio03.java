package AulasReforcoJava;
import java.util.Scanner;

public class Aula0006_Exercicio03 {

    /*
     * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        ordem crescente ou decrescente
     * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //--

        System.out.println("Digite um Número Inteiro: ");
        int numero01 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int numero02 = sc.nextInt();

        if (numero01 % numero02 == 0 || numero02 % numero01 == 0){
            System.out.println("Os número são Multiplos!");
        } else{
            System.out.println("Os números não são Multiplos!");
        }

        //--

        sc.close();

    }
}


