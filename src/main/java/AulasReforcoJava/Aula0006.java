package AulasReforcoJava;
import java.util.Scanner;

public class Aula0006 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //--

        int hora;

        // System.out.println("Bom dia");

        /*
        if(x > 0){
            System.out.println("Boa Tarde");
        }

         */

        // System.out.println("Boa Noite");

        System.out.println("Que horas são: ");
        hora = sc.nextInt();

        if(hora < 12){
            System.out.println("Bom dia Amigão!");
        } else if (hora < 18) {
            System.out.println("Boa Tarde Amigão!");
        } else {
            System.out.println("Boa noite!");
        }

        sc.close();

        //--
    }
}
