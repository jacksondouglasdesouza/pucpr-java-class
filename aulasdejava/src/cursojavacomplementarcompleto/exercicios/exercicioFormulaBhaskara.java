package cursojavacomplementarcompleto.exercicios;
import java.util.Locale;

public class exercicioFormulaBhaskara {

    /*
     * Exercício – Fórmula de Bhaskara
     *
     * Crie um programa em Java que calcule as raízes reais de uma equação do 2º grau,
     * no formato: ax² + bx + c = 0.
     *
     * Use os seguintes valores:
     * - a = 52
     * - b = 98
     * - c = 11
     *
     * Regras:
     * 1. Calcule o valor de Δ (delta) usando a fórmula:
     *      delta = b² - 4ac
     *
     * 2. Se delta for negativo, exiba:
     *      "Não existem raízes reais."
     *
     * 3. Caso contrário, calcule as raízes reais com as fórmulas:
     *      x1 = (-b + √delta) / (2a)
     *      x2 = (-b - √delta) / (2a)
     *
     * 4. Exiba o valor de delta, x1 e x2 na tela.
     *
     * Exemplo de saída esperada:
     * Delta: 7316.0
     * X1: -0.119
     * X2: -1.765
     */


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double a = 52.0;
        double b = 98.0;
        double c = 11.0;
        double delta, X1, X2;


        delta = Math.pow(b, 2.0) - 4 * a * c;

        System.out.println("Delta: " + delta);

        //--

        if(delta < 0){
            System.out.println("Não existe raízes reais!");
        } else {
            X1 = (-b + Math.sqrt(delta)) / (2 * a);
            X2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("X1 = %.3f: \n", X1);
            System.out.printf("X2 = %.3f: \n", X2);
        }
        //
    }

}
