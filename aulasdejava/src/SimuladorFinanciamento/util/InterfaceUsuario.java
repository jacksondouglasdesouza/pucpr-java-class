package SimuladorFinanciamento.util;
import java.util.Scanner;

public class InterfaceUsuario {

    // Atributos
    private Scanner scanner;

    // Construtor
    public InterfaceUsuario(){
        this.scanner = new Scanner(System.in);
    }

    // Métodos
    public double pedirValorImovel(){
        double valor;
        do{
            System.out.println("Digite o valor do imóvel: ");
            valor = scanner.nextDouble();
            if(valor <= 0){
                System.out.println("Valor Inválido. Digite um número positivo.");
            }
        }while(valor <= 0);
        return valor;
    }

    public int pedirPrazoFinanciamento(){
        int prazo;
        do{
            System.out.println("Digite o prazo de financiamento em anos: ");
            prazo = scanner.nextInt();
            if(prazo <= 0){
                System.out.println("Prazo Inválido. Digite um número positivo.");
            }
         }while (prazo <= 0);
        return prazo;
    }

    public double pedirTaxaDeJuros(){
        double taxa;
        do{
            System.out.println("Digite o taxa de juros anual (%): ");
            taxa = scanner.nextDouble();
            if(taxa <= 0){
                System.out.println("Taxa Inválida. Digite um número positivo.");
            }
        }while (taxa <= 0);
        return taxa;
    }

}