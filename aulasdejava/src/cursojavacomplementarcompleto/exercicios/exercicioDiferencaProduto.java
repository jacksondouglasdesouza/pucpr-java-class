package cursojavacomplementarcompleto.exercicios;
import java.util.Scanner;
import java.util.Locale;

public class exercicioDiferencaProduto {

    // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
    // calcule e mostre a diferença do produto
    //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double value1, value2, value3, value4, diferenca;

        System.out.println("Digite o  primeiro valor: ");
        value1 = scan.nextDouble();

        System.out.println("Digite o segundo valor: ");
        value2 = scan.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        value3 = scan.nextDouble();

        System.out.println("Digite o quarto valor: ");
        value4 = scan.nextDouble();

        diferenca = (value1 * value2 - value3 * value4);

        System.out.println("A diferença do produto é: " + diferenca);


    }


}
