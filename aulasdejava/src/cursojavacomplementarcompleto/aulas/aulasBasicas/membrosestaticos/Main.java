package cursojavacomplementarcompleto.aulas.aulasBasicas.membrosestaticos;
import cursojavacomplementarcompleto.aulas.aulasBasicas.membrosestaticos.CalculadoraEstatica;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do Raio: ");
        double raio = scan.nextDouble();

        String resultado = CalculadoraEstatica.formatacaoResultado(raio);

        System.out.println(resultado);

        scan.close();

    }
}
