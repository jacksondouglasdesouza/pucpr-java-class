package cursojavacomplementarcompleto.exercicios;
import java.util.Scanner;
import java.util.Locale;

public class ExercicioNumeroPecasCompra {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Fazer um programa para ler o código de uma peça 1,
        // número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
        // Calcule e mostre o valor a ser pago.

        double pecasComprada1, idPeca1, valorPeca1;
        double pecasComprada2, idPeca2, valorPeca2;

        System.out.println("Digite o código do produto: ");
        idPeca1 = scan.nextDouble();

        System.out.println("Digite a quantidade desejada do produto: ");
        pecasComprada1 = scan.nextDouble();

        System.out.println("Digite o valor do produto: ");
        valorPeca1 = scan.nextDouble();

        //--

        System.out.println("Digite o código do segundo produto: ");
        idPeca2 = scan.nextDouble();
        System.out.println("Digite a quantidade desejada do segundo produto: ");
        pecasComprada2 = scan.nextDouble();
        System.out.println("Digite o valor do segundo produto: ");
        valorPeca2 = scan.nextDouble();

        double valorPagar1 = pecasComprada1 * valorPeca1;
        double valorPagar2 = pecasComprada2 * valorPeca2;
        double valorTotal = valorPagar1 + valorPagar2;

        System.out.printf("Valor a pagar: %.2f", valorTotal);


    }
}
