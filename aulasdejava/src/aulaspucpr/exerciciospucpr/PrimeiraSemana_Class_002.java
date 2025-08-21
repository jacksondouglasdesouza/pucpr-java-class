package aulaspucpr.exerciciospucpr;
import java.util.Scanner;

public class PrimeiraSemana_Class_002 {

    public static void main(String[] args) {

        // 2. Crie um algoritmo em Java que verifica se um número inteiro é positivo, negativo ou zero.

        Scanner scan = new Scanner(System.in);

        int value01;

        System.out.println("Digite um valor: ");
        value01 = scan.nextInt();

        scan.close();

        if (value01 > 0){
            System.out.println("O número é Positivo.");
        } else {
            System.out.println("O número é negativo.");
        }
        // --

    }

}
