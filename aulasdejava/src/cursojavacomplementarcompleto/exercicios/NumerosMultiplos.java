package cursojavacomplementarcompleto.exercicios;
import java.util.Locale;
import java.util.Scanner;

public class NumerosMultiplos {

    public static void main(String[] args) {

        // Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
        // "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
        // Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int value1, value2;

        System.out.println("Digite um número inteiro: ");
        value1 = scan.nextInt();

        System.out.println("Digite outro numero inteiro: ");
        value2 = scan.nextInt();

        if(value1 == 0 && value2 == 0){
            System.out.println("Os números Digitados São multiplos");
        } else if(value1 == 0 || value2 == 0){
            System.out.println("Os números não são multiplos!");
        } else if(value1 % value2 == 0 || value2 % value1 == 0){
            System.out.println("Os números Digitados São multiplos.");
        } else {
            System.out.println("Os números não são multiplos!");
        }

        scan.close();


    }
}
