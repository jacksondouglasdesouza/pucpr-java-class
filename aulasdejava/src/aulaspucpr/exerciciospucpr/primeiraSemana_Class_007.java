package aulaspucpr.exerciciospucpr;
import java.util.Scanner;

public class primeiraSemana_Class_007 {

    public static void main(String[] args) {

        //7. Crie um algoritmo em Java que peça ao usuário a temperatura em graus Celsius e
        // converta-a para graus Fahrenheit. Além disso, o programa deve imprimir se está frio (abaixo de 32°F),
        // moderado (entre 32°F e 80°F) ou quente (acima de 80°F).

        Scanner scan = new Scanner(System.in);

        double grausCelsius, grausFahrenheit;

        System.out.println("Digite a temperatura em Graus C°: ");
        grausCelsius = scan.nextDouble();
        scan.close();

        grausFahrenheit = (grausCelsius * 9 / 5) + 32;

        //--

        if(grausFahrenheit < 32){
            System.out.println("A conversão é de " +  grausFahrenheit + "º Fahrenheit e está com clima muito frio.");
        } else if (grausFahrenheit <= 80){
            System.out.println("A conversão é de " + grausFahrenheit + "º Fahrenheit e está com clima moderado.");
        } else {
            System.out.println("A conversão é de " + grausFahrenheit + "º Fahrenheit e está com clima quente");
        }//


    }
}
