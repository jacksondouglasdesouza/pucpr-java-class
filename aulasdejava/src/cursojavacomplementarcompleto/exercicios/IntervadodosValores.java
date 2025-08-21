package cursojavacomplementarcompleto.exercicios;
import java.util.Scanner;
import java.util.Locale;

public class IntervadodosValores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo
        // em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
        // Obviamente se o valor não estiver em nenhum destes intervalos
        // deverá ser impressa a mensagem “Fora de intervalo”.

        double value;

        System.out.println("Digite um valor inteiro entre 0 e 100: ");
        value = scan.nextDouble();

        if(value < 0 || value > 100){
            System.out.println("Fora de intervalo!");
            System.out.println("O valor deve ser entre 0 e 100");
        } else {
            //
            if (value >= 0 && value <= 25){
                System.out.println("O valor está entre [ 0 e 25 ] ");
            } else if(value > 25 && value <= 50){
                System.out.println("O valor está entre ( 25 e 50 ]");
            } else if(value > 50 && value <= 75){
                System.out.println("O valor está entre ( 50 e 75 ]");
            } else {
                System.out.println("O valor está entre ( 75 e 100 ]");
            } //
        }

        scan.close();
    }
}
