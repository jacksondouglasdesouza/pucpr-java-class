package cursojavacomplementarcompleto.exercicios;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioValorRaioCirculo {

    public static void main(String[] args) {
        // Faça um programa para ler o valor do raio de um círculo,
        // e depois mostrar o valor da área deste círculo com quatro
        //casas decimais.

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);



        double PI = 3.14159;

        System.out.printf("Digite o valor do raio para calcular: ");
        double raio = scan.nextDouble();

        raio = PI * Math.pow(raio, 2);

        System.out.printf("A área do raio de de: %.4f", raio);

    }
}
