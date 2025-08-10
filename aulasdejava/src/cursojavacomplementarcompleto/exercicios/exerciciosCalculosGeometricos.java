package cursojavacomplementarcompleto.exercicios;
import java.util.Locale;
import java.util.Scanner;

public class exerciciosCalculosGeometricos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        //mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159)
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.

        double A, B, C, PI;
        PI = 3.14159;

        System.out.println("Digite o valor de A: ");
        A = scan.nextDouble();

        System.out.println("Digite o valor de B: ");
        B = scan.nextDouble();

        System.out.println("Digite o valor de C: ");
        C = scan.nextDouble();

        //-- Fórmulas

        // Área do triângulo retângulo
        double areaTrianguloRetangulo = (A * C) / 2;

        // Área do círculo (raio = C):
        double areaCirculoRaioC = PI * Math.pow(C, 2);

        // Área do trapézio (bases A e B, altura C):
        double areaTrapezio = ((A + B) * C) / 2;

        //  Área do quadrado (lado = B):
        double areaQuadradoB = Math.pow(B, 2);

        // Área do retângulo (lados A e B):
        double areaRetanguloAporB = A * B;

        System.out.printf("Área do Triângulo:  %.2f\n", areaTrianguloRetangulo);
        System.out.printf("Área do Círculo:   %.2f\n", areaCirculoRaioC );
        System.out.printf("Área do Trapézio:    %.2f\n",areaTrapezio );
        System.out.printf("Área do Quadrado: %.2f\n", areaQuadradoB );
        System.out.printf("Área do Retângulo:  %.2f\n", areaRetanguloAporB );

    }
}
