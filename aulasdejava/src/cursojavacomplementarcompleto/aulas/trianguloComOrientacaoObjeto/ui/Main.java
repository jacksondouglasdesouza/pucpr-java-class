package cursojavacomplementarcompleto.aulas.trianguloComOrientacaoObjeto.ui;
import cursojavacomplementarcompleto.aulas.trianguloComOrientacaoObjeto.entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Triangle trianguloX, trianguloY;
        double ladoAdeX,ladoBdeX,ladoCdeX;
        double ladoAdeY,ladoBdeY,ladoCdeY;

        System.out.println("Digite a medida do lado A do triÂngulo X: ");
        ladoAdeX = scan.nextDouble();
        System.out.println("Digite a medida do lado B do triângulo X: ");
        ladoBdeX = scan.nextDouble();
        System.out.println("Digite a medida do lado C do triângulo X: ");
        ladoCdeX = scan.nextDouble();

        trianguloX = new Triangle(ladoAdeX, ladoBdeX, ladoCdeX);

        System.out.println("Digite a medida do lado A do triângulo Y: ");
        ladoAdeY = scan.nextDouble();
        System.out.println("Digite a medida do lado B do triângulo Y: ");
        ladoBdeY = scan.nextDouble();
        System.out.println("Digite a medida do lado C do triângulo Y: ");
        ladoCdeY = scan.nextDouble();

        trianguloY = new Triangle(ladoAdeY, ladoBdeY, ladoCdeY);

        // --

        double areaDeX = trianguloX.calcularArea();
        double areaDeY = trianguloY.calcularArea();

        //

        if (areaDeX > areaDeY) {
            System.out.println("####################################");
            System.out.println("A área do triângulo [ X ] é maior!");
            System.out.printf("[Área do Triângulo X = %.4f]", areaDeX);
        } else {
            System.out.println("####################################");
            System.out.println("A área do triângulo [ Y ] é maior!");
            System.out.printf("Área do Triângulo [ Y = %.4f]", areaDeY);
        }

        System.out.println("\n#####################################");
        System.out.println("PROGRAMA FINALIZADO COM SUCESSO!");
        System.out.println("#####################################");


        scan.close();

    }
}

