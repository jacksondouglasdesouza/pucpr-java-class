package cursojavacomplementarcompleto.exercicios;
import java.util.Locale;
import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // Faça um programa para ler 10 números inteiros e mostrar na tela o maior entre eles.
        // USE VÁRIAS ESTRUTURAS APRENDIDA AO LONGO DO CURSO COMO FOR, IF, WHILE, ARRAYS E ETC... //

        int i = 0;
        int maior = Integer.MIN_VALUE; // ~~ 2.1474 * 10 ^ 9
        int[] values = new int[10];

        do {
            System.out.print("Digite um valor: ");
            values[i] = scan.nextInt();

            for (int j = 0; j < values.length; j++) {
                if (values[j] > maior) {
                    maior = values[j];
                }
            }
            i++;

        } while (i < 10);

        System.out.println("O maior número entre eles é: " + maior);

        scan.close();
    }
}
