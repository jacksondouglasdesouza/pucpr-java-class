package cursojavacomplementarcompleto;
import java.util.Scanner;
import java.util.Locale;

public class exercicioFuncionarioValorReceber {

    public static void main(String[] args) {
        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
        // o valor que recebe por hora e calcula o salário desse funcionário. A seguir,
        // mostre o número e o salário do funcionário, com duas casas decimais.

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int idFuncionario;
        double horaTrabalhada, valorPorHora, salarioTotal;

        System.out.println("Digite o seu ID de funcionario: ");
        idFuncionario = scan.nextInt();

        System.out.println("Digite quantas Hora de trabalhado você tem acumuladas: ");
        horaTrabalhada = scan.nextDouble();

        System.out.println("Digite o valor da hora paga pela empresa: ");
        valorPorHora = scan.nextDouble();

        salarioTotal = horaTrabalhada *  valorPorHora;

        System.out.println("-------------------------------------");
        System.out.println("ID FUNCIONAL: " +  idFuncionario);
        System.out.println("SALARIO DO MÊS: R$ " +  salarioTotal);
        System.out.println("-------------------------------------");


    }
}
