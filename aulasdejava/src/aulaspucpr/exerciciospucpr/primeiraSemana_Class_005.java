package aulaspucpr.exerciciospucpr;
import java.util.Scanner;

public class primeiraSemana_Class_005 {

    public static void main(String[] args) {

        //5. Crie um algoritmo em Java que peça ao usuário para que se digite um ano (exemplo: 2032).
        // Em seguida, o algoritmo deve verificar se o ano informado é ou não bissexto.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano (exemplo: 2032): ");
        int ano = scanner.nextInt();
        scanner.close();

        boolean bissexto = false; // Inicialmente considera que o ano NÃO é bissexto

        /*
         * Ano bissexto é um ano que tem 366 dias, em vez de 365.
         * Isso acontece para corrigir a diferença entre o tempo que a Terra leva para dar uma volta completa
         * ao redor do Sol (aproximadamente 365,25 dias) e o calendário que usamos.
         * Para ajustar essa diferença, a cada 4 anos adicionamos 1 dia extra (29 de fevereiro).
         * Porém, nem todos os anos múltiplos de 4 são bissextos, porque há exceções para os anos múltiplos de 100,
         * que só são bissextos se também forem múltiplos de 400.
         */

        // Regra para determinar se um ano é bissexto:
        // 1. Se o ano for divisível por 400, ele é bissexto
        // 2. Se não, mas for divisível por 4 E NÃO for divisível por 100, ele é bissexto
        // 3. Caso contrário, não é bissexto

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            bissexto = true;
        }

        //--

        if (bissexto) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }
    }
}
