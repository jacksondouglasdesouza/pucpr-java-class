package cursojavacomplementarcompleto.aulas;
import java.util.Scanner;
import java.util.Locale;

public class estruturaFor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // Faça um Programa que:
        //Leia um valor N int;
        //Depois leia a quantidade de N números;
        //Mostrar a Soma de Ns Números.

        int valueN;

        System.out.println("Digite um numero: ");
        valueN = scan.nextInt();

        int soma = 0;

        for(int i = 0; i < valueN; i++){
            System.out.println("Digite um numero: ");
            int value2 = scan.nextInt();
            soma += value2;
        }

            System.out.println("SOMA: " + soma);

        scan.close();
    }
}
