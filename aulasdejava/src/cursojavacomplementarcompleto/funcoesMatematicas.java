package cursojavacomplementarcompleto;
import java.util.Scanner;
import java.util.Locale;

public class funcoesMatematicas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // EXPRESSÕES MATEMÁCAS EM JAVA
        //  Math.sqrt(x)  -- Raiz quadrada de X;
        // Math.pow(x)  -- Potenciação de X;
        // Math.abs(x)  -- Valor Absoluto de X;

        double valueX = 3.0;
        double valueY = 4.0;
        double valueZ = -5.0;
        double valueA, valueB, valueC;

        //--

        valueA = Math.sqrt(valueX);
        valueB = Math.sqrt(valueY);
        valueC = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + valueX + " = " + valueA);
        System.out.println("Raiz quadrada de " + valueY + " = " + valueB);
        System.out.println("Raiz quadrada de 25.0 " + " = " + valueC);

        // --

        valueA = Math.pow(valueX, valueY);
        valueB = Math.pow(valueX, 2.0);
        valueC = Math.pow(5.0, 2.0);

        System.out.println(valueX + "elevado a " + valueY + " = " + valueA);
        System.out.println(valueX + "elevado a quadrado: " + valueB);
        System.out.println("5 elevado a quadrado: " + valueC);

        valueA = Math.abs(valueY);
        valueB = Math.abs(valueZ);

        System.out.println("O valor Absoluto de " + valueY + " = " + valueA);
        System.out.println("O valor Absoluto de " + valueZ + " = " + valueB);    ;


    }
}
