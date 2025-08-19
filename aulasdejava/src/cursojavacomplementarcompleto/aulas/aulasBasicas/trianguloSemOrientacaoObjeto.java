package cursojavacomplementarcompleto.aulas.aulasBasicas;
import java.util.Scanner;
import java.util.Locale;

public class trianguloSemOrientacaoObjeto {

    public static void main(String[] args) {


        /*
        * Problema exemplo
        *
        * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y
        * (suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois
        * triângulos e dizer qual dos dois triângulos possui a maior área.
        *
        * A fórmula para calcular a área de um triângulo a partir das medidas dos
        * seus lados a, b e c é a seguinte (fórmula de Heron):
        *
        * area = sqrt(p(p-a)(p-b)(p-c)) onde p = (a+b+c) / 2
        *
        */

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double trianguloX, ladoAtrianguloX, ladoBtrianguloX,ladoCtrianguloX;
        double trianguloY, ladoAtrianguloY, ladoBtrianguloY, ladoCtrianguloY;
        double semiPerimetroTrianguloX, semiPerimetroTrianguloY;
        double formulaDeHeronTrianguloX, formulaDeHeronTrianguloY;

        System.out.println("Digite a medida do lado [ A ] do triângulo X: ");
        ladoAtrianguloX = scan.nextDouble();
        System.out.println("Digite a medida do lado [ B ] do triângulo X");
        ladoBtrianguloX = scan.nextDouble();
        System.out.println("Digite a medida do lado [ C ] do triângulo X");
        ladoCtrianguloX = scan.nextDouble();

        semiPerimetroTrianguloX = (ladoAtrianguloX + ladoBtrianguloX + ladoCtrianguloX) / 2.0;
        formulaDeHeronTrianguloX = Math.sqrt(semiPerimetroTrianguloX * (semiPerimetroTrianguloX - ladoAtrianguloX) * (semiPerimetroTrianguloX - ladoBtrianguloX) * (semiPerimetroTrianguloX - ladoCtrianguloX));
        trianguloX = formulaDeHeronTrianguloX;

        System.out.println("Digite a medida do lado [ A ] do triângulo Y ");
        ladoAtrianguloY = scan.nextDouble();
        System.out.println("Digite a medida do lado [ B ] do triângulo Y: ");
        ladoBtrianguloY = scan.nextDouble();
        System.out.println("Digite a medida do lado [ C ] do triângulo Y: ");
        ladoCtrianguloY = scan.nextDouble();


        semiPerimetroTrianguloY = (ladoAtrianguloY + ladoBtrianguloY + ladoCtrianguloY) / 2.0;
        formulaDeHeronTrianguloY = Math.sqrt(semiPerimetroTrianguloY * (semiPerimetroTrianguloY - ladoAtrianguloY) * (semiPerimetroTrianguloY - ladoBtrianguloY) * (semiPerimetroTrianguloY - ladoCtrianguloY));
        trianguloY = formulaDeHeronTrianguloY;

        scan.close();


        if(trianguloX > trianguloY){
            System.out.println("\n#######################################");
            System.out.printf("O Triângulo [ X ] tem a maior área! [ Área = %.4f ]\n", trianguloX);
        } else {
            System.out.println("\n#######################################");
            System.out.printf("O triângulo [ Y ] tem a maior área! [ Área = %.4f ]\n", trianguloY);
        }

        System.out.println("PROGRAMA FINALIZADO COM SUCESSO");
        System.out.println("#############################");

    }

}

