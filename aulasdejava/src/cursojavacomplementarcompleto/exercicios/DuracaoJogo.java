package cursojavacomplementarcompleto.exercicios;
import java.util.Scanner;
import java.util.Locale;

public class DuracaoJogo {

    public static void main(String[] args) {

        //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double horaIncial, horaFinal, duracaoJogo;

        System.out.println("Digite a hora inicial do jogo: ");
        horaIncial = scan.nextDouble();

        System.out.println("Digite a hora final do jogo: ");
        horaFinal = scan.nextDouble();

        if(horaFinal > horaIncial){
            duracaoJogo = horaFinal - horaIncial;
        } else {
            duracaoJogo = ( 24.0 - horaIncial) +  horaFinal;
        }

        System.out.printf("O jogo durou %.2f horas.\n", duracaoJogo);

        scan.close();

    }
}
