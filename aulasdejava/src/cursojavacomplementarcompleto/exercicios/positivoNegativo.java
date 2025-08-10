package cursojavacomplementarcompleto.exercicios;
import java.util.Scanner;
import java.util.Locale;

public class positivoNegativo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        int value;

        System.out.println("Digite um número inteiro: ");
        value = scan.nextInt();

        if(value >= 0){
            System.out.println("O número digitado é não negativo!");
        } else {
            System.out.println("O número digitado é negativo!");
        }

        scan.close();
    }
}
