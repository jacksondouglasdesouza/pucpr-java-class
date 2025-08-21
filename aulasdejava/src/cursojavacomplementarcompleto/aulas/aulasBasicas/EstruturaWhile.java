package cursojavacomplementarcompleto.aulas.aulasBasicas;
import java.util.Scanner;
import java.util.Locale;

public class EstruturaWhile {

    public static void main(String[] args) {

        // ESTRUTURA DE REPETIÇÃO WHILE //

        // Usa-se esta estrutura de repetição quando não se sabe previamente
        // a quantidade de repetições que será realizada.

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        /*
        * Faça um programa que lê números inteiros
        * até que o número sero seja lido. Ao final
        * mostre no console a soma dos números lidos
        **/

        int numero = -1, soma = 0;

        while (numero != 0) {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();
            soma += numero;
        }

        scan.close();

        System.out.println("A soma dos números é: " + soma);

    } //

}
