package cursojavacomplementarcompleto.exercicios;
import java.util.Scanner;
import java.util.Locale;

public class encontrarQuadrante {

    public static void main(String[] args) {

        /*
            Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
            de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
            ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
            Se o ponto estiver na origem, escreva a mensagem “Origem”.
            Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”
        */

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double eixoX, eixoY;

        System.out.println("Digite o eixo X: ");
        eixoX = scan.nextDouble();

        System.out.println("Digite o eixo Y: ");
        eixoY = scan.nextDouble();

        if(eixoX == 0 && eixoY == 0){
            System.out.println("O ponto está na Origem.");
        } else if(eixoX == 0 || eixoY == 0){
            System.out.println("O ponto está sobre o “Eixo X” ou “Eixo Y”");
        } else if(eixoX > 0 && eixoY > 0){
            System.out.println("O ponto está no 1º Quadrante.");
        } else if(eixoX < 0 && eixoY > 0){
            System.out.println("O ponto está no 2º Quadrante.");
        } else if(eixoX < 0 && eixoY < 0){
            System.out.println("O ponto está no 3º Quadrante.");
        } else{
            System.out.println("O ponto está no 4º Quadrante.");
        }

        scan.close();
    }
}
