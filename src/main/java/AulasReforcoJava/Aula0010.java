package AulasReforcoJava;
import java.util.Scanner;

public class Aula0010 {

    //-- ESTRUTURA DE REPETIÇÃO ENQUANTO - WHILE

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um Numero: ");
        numero = sc.nextInt();

        int soma = 0;

        while (numero != 0){
            soma += numero;
            numero = sc.nextInt();
        }

        if (numero == 0){
            System.out.println("Programa Finalizado!");
            System.out.println("Total da soma é: " + soma);
        }

        //--

        int x = 0;
        int y = 4;

        while (x < 3){
            y += 2;
            x+= 1;
            System.out.println(x + " - " + y);
        }


        sc.close();

        //-- END MAIN
    }

    //-- END CLASSE
}
