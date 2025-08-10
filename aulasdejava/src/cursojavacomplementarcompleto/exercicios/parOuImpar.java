package cursojavacomplementarcompleto.exercicios;
import java.util.Scanner;
import java.util.Locale;

public class parOuImpar {

    public static void main(String[] args) {

        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int value;

        System.out.println("Digite um número inteiro: ");
        value = scan.nextInt();

        if(value % 2 == 0){
            System.out.println("O número digitado é Par!");
        } else {
            System.out.println("O número digitado é ímpar!");
        }

        scan.close();
    }
}
