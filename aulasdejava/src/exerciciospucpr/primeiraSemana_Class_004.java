package exerciciospucpr;
import java.util.Scanner;

public class primeiraSemana_Class_004 {

    public static void main(String[] args) {

        //4. Crie um algoritmo em Java que peça ao usuário para que se digite um número inteiro (exemplo: 14).
        // Em seguida, o algoritmo deve mostrar a tabuada do número digitado utilizando o “for”.

        Scanner scan = new Scanner(System.in);

        int valueEntrada;

        System.out.println("***  CALCULADORA BÁSICA DE INTEIROS  ***");
        System.out.println("Digite um numero inteiro: ");
        valueEntrada = scan.nextInt();

        scan.close();

        System.out.println("---------------------------- ");
        System.out.println("[ *** MULTIPLICAÇÃO *** ]");
        System.out.println("---------------------------- ");


        for(int i = 1; i <= 10; i++){
            System.out.println(valueEntrada + " X " + i + " = " + (valueEntrada * i));
        }
        //--

        System.out.println("---------------------------- ");
        System.out.println("[ *** ADIÇÃO *** ]");
        System.out.println("---------------------------- ");

        for (int i = 1; i <= 10; i++){
            System.out.println(valueEntrada + " + " + i + " = " + (valueEntrada + i));
        }
        //--

        System.out.println("---------------------------- ");
        System.out.println("[ *** SUBTRAÇÃO *** ]");
        System.out.println("---------------------------- ");

        for(int i = 1; i <= 10; i++){
            System.out.println(valueEntrada + " - " + i + " = " + (valueEntrada - i));
        }
        //--

        System.out.println("---------------------------- ");
        System.out.println("[ *** DIVISÃO *** ]");
        System.out.println("---------------------------- ");

        for(int i = 1; i <= 10; i++){
            double divisao = (double) valueEntrada / i;
            System.out.println(valueEntrada + " / " + i + " = " + String.format("%.2f", divisao));
        }
        //-

        System.out.println("---------------------------- ");
        System.out.println("PROGRAMA FINALIZADO COM SUCESSO!");
    }
}
