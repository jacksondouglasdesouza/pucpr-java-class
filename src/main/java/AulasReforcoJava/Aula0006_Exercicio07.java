package AulasReforcoJava;
import java.util.Scanner;


/*
*   Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
*   que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
*   qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
*   Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
*   mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
*
* */


public class Aula0006_Exercicio07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Seu Sálario: ");
        double salario = sc.nextDouble();

        double imposto;

        if(salario <= 2000.00){
            System.out.println("Você está Isento(a) do Imposto de Renda!");
        } else if (salario > 2000.00 && salario <= 3000.00){
            imposto = salario * 0.08;
            System.out.printf("Você vai pagar R$ %.2f Imposto de Renda!", imposto);
        } else if (salario > 3000.00 && salario <= 4500.00){
            imposto = salario * 0.18;
            System.out.printf("Você vai pagar R$ %.2f Imposto de Renda!", imposto);
        } else {
            imposto = salario * 0.28;
            System.out.printf("Você vai pagar R$ %.2f Imposto de Renda!", imposto);
        }


        sc.close();

    }





} //-- Fim da Classe


