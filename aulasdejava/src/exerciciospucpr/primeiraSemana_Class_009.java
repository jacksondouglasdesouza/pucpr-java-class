package exerciciospucpr;

import java.util.Scanner;

public class primeiraSemana_Class_009 {

    public static void main(String[] args) {

        // 9. Crie um algoritmo em Java que solicita ao usuário
        // para que insira um número inteiro entre 1 e 1000 e converta-o em um número romano.
        // Por exemplo, se o usuário inserir 58, o programa deve imprimir "LVIII".

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um número entre 1 e 1000: ");
        int value = scan.nextInt();
        scan.close();

        // Verificação de limite
        if (value < 1 || value > 1000) {
            System.out.println("Número inválido! Digite um número entre 1 e 1000.");
            return;
        }

        // Arrays com valores decrescentes e seus equivalentes romanos
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String resultado = "";

        // Conversão: enquanto o número for maior que 0, subtrai os maiores valores possíveis
        for (int i = 0; i < valores.length; i++) {
            while (value >= valores[i]) {
                resultado += romanos[i];   // Adiciona o símbolo romano ao resultado
                value -= valores[i];       // Subtrai o valor correspondente
            }
        }

        // Exibe o número convertido
        System.out.println("Número romano: " + resultado);
    }
}
