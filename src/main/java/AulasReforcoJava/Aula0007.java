package AulasReforcoJava;
import java.util.Scanner;

public class Aula0007 {

    // Aula de Switch Case!

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor de um a 7: ");
        int value = sc.nextInt();

        //--

        switch (value){
            case 1:
                System.out.println("É Domingo: ");
                break;
            case 2:
                 System.out.println("É sugunda Feira: ");
                 break;
            case 3:
                System.out.println("É Terça Feira: ");
                break;
            case 4:
                System.out.println("É Quarta Feira: ");
                break;
            case 5:
                System.out.println("É Quinta Feira: ");
                break;
            case 6:
                System.out.println("É Sexta Feira: ");
                break;
            case 7:
                System.out.println("É Sábado: ");
                break;
            default:
                System.out.println("Dia Inválido!");
                break;

        }

        sc.close();

        //--
    }
}
