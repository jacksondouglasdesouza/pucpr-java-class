package aulaspucpr.exerciciospucpr;
import java.util.Scanner;

public class primeiraSemana_Class_001 {

    public static void main(String[] args) {
        // 1. Crie um algoritmo em Java que solicita três números decimais ao
        // usuário. Em seguida, a média destes números é calculada e mostrada na tela para o usuário.

        Scanner scan = new Scanner(System.in);

        double value001, value002, value003, media;

        System.out.println("Digite um número com casa decimal: ");
        value001 = scan.nextDouble();

        //--

        System.out.println("Digite um segundo número com casa decimal: ");
        value002 = scan.nextDouble();

        //--

        System.out.println("Digite um terceiro número com casa decimal: ");
        value003 = scan.nextDouble();

        scan.close();

        media = (value001 + value002 + value003) / 3;

        System.out.printf("A média é: %.2f\n", media);

    }
}
