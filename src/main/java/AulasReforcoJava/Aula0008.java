package AulasReforcoJava;
import java.util.Scanner;

public class Aula0008 {

    // Aula de Expressão condicional Ternária

    // (CONDIÇÃO) ? VERDADEIRO : FALSO

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int value1 = 50;
        int value2 = 100;

        String resultado = ( value1 < value2 ) ? "Verdade" : "Falso";

        System.out.println(resultado);

        //--

        double precoGasolina = 35.50;

        double desconto = (precoGasolina < 20.00) ? precoGasolina * 0.1 : precoGasolina * 0.05;

        System.out.println(desconto);


        sc.close();


        //--
    }

    //--
}
