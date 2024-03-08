package AulasReforcoJava;
import java.util.Scanner;
import java.util.Locale;

public class Aula0004_Exercicio02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        /*
        * Faça um programa para ler o valor do raio de um círculo, e depois
        * mostrar o valor da área deste círculo com quatro
        * casas decimais conforme exemplos.
        * Fórmula da área: area = π . raio2
        * Considere o valor de π = 3.14159
        * */


        System.out.println("Digite o Raio do círculo: ");
        System.out.println("Digite o Raio do círculo: ");
        double raio = sc.nextDouble();

        double pi = 3.14159;
        double area = pi * Math.pow(raio, 2.0);

        System.out.printf("A área do círculo é de: %.4f", area);

        sc.close();


    }
}
