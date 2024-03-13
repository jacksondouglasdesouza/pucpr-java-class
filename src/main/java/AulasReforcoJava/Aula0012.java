package AulasReforcoJava;
import java.util.Scanner;

// LAÇO DE REPETIÇÃO DO WHILE

public class Aula0012 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valueTemperatura;
        boolean paraPrograma = false;


        do {
            System.out.println("Digite a temperatura em Celsius: ");
            valueTemperatura = sc.nextDouble();
            double valueConversao = ((9 * valueTemperatura) / 5) + 32;

            //--

            System.out.println("O valor da temperatura em Graus Fahrenheit é: " + valueConversao);
            System.out.println("Você deseja fazer outra conversão?");
            System.out.println("[ S - Sim | N -  Não ]");
            char continuaPrograma = sc.next().charAt(0);


            //--

            if(continuaPrograma == 'N'){
                paraPrograma = true;
                break;
            }

        }while(paraPrograma != true);


        sc.close();

        System.out.println("********************************");
        System.out.println("***   PROGRAMA FINALIZADO!   ***");
        System.out.println("********************************");


    } //-- end main

} //-- end class
