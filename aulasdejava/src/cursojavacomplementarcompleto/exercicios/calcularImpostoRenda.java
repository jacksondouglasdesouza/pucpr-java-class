package cursojavacomplementarcompleto.exercicios;
import java.util.Scanner;
import java.util.Locale;

public class calcularImpostoRenda {

    /*
            Num país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar os seus
            impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados
            são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o
            Rombus, cujo símbolo é o R$. Leia um valor com duas casas decimais, equivalente ao salário de
            uma pessoa de Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto
            de Renda, segundo a tabela abaixo.

            - 0 a 2.000,00 - ISENTA
            - 2.000,01 até 3.000,00 - 8%
            - 3.000,01 até 4.500,00 - 18%
            - Acima de 4.500,00 - 28%

            Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00,
            pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda.
            No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta
            em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais

     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double salario, imposto = 0.0;

        System.out.println("Digite o seu salário: ");
        salario = scan.nextDouble();

        if (salario < 2000.0){
            imposto = 0.0;
        } else if(salario <= 3000.0){
            imposto = (salario - 2000.0) * 0.08;
        } else if(salario <= 4500.0){
            imposto = (1000.0 * 0.08) + (salario - 3000.0) * 0.18;
        } else {
            imposto = (1000.0 * 0.08) + (1500.0 * 0.18) + (salario - 4500.0) * 0.28;
        }

        System.out.printf("O total de Imposto a pagar é de: %.2f",  imposto);

        scan.close();

    }
}
