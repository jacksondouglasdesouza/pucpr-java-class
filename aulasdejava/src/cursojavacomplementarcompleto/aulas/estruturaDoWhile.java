package cursojavacomplementarcompleto.aulas;
import java.util.Locale;
import java.util.Scanner;

public class estruturaDoWhile {

    public static void main(String[] args) {
        //
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        char resposta;

        do{
            System.out.println("Digite a temperatura em Graus Celsius: ");
            double temCelsius = scan.nextDouble();
            double temFahrenheit = 9.0 * temCelsius / 5.0 + 32;
            System.out.println("A conversão para Fahrenheit: " + temFahrenheit);
            System.out.println("Deseja fazer uma nova Conversão?");
            System.out.println("[ S - Sim  || N - Não ]");
            resposta = scan.next().charAt(0);

        } while (resposta != 'N');

        scan.close();

        System.out.println("PROGRAMA FINALIZADO COM SUCESSO!\n");
    }
}
