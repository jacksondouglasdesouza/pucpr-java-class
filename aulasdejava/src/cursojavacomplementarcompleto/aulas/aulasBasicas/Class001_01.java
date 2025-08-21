package cursojavacomplementarcompleto.aulas.aulasBasicas;

import java.util.Scanner;

public class Class001_01 {

    public static void main(String[] args) {
        // ENTRADA DE DADOS EM JAVA SCANNER

        Scanner scan = new Scanner(System.in);

        int numero01, numero02;

        System.out.println("Digite um número inteiro: ");
        numero01 =  scan.nextInt();
        System.out.println("Digite outro número inteiro: ");
        numero02 = scan.nextInt();
        int somaNumeros = numero01 + numero02;

        scan.close();

        System.out.printf("A soma dos números digitado é: %d", somaNumeros);

    }

}
