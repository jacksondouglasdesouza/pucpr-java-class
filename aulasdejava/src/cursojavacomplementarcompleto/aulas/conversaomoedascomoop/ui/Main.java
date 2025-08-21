package cursojavacomplementarcompleto.aulas.conversaomoedascomoop.ui;
import cursojavacomplementarcompleto.aulas.conversaomoedascomoop.entities.ConvensorDeMoedas;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de dollar que quer comprar: ");
        double quantidadeMoedas = scan.nextDouble();
        System.out.println("Digite o valor do dollar atual: ");
        double valorDollar = scan.nextDouble();

        double total = ConvensorDeMoedas.totalPagarComImposto(quantidadeMoedas, valorDollar);

        System.out.println("Você pagará exatamente R$" + String.format("%.2f",total) + " com imposto de 6% incluso.");

        scan.close();
    }
}
