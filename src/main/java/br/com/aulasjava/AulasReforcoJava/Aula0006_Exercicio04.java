package br.com.aulasjava.AulasReforcoJava;
import java.util.Scanner;

public class Aula0006_Exercicio04 {

    /*
     * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
     * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
     * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Hora Inicial do Jogo: ");
        double horaInicial = sc.nextDouble();

        System.out.println("Digite a Hora Final do Jogo: ");
        double horaFinal = sc.nextDouble();

        //--


        double horaTotal;

        if (horaInicial < horaFinal){
            horaTotal = horaFinal - horaInicial;
        } else {
            horaTotal = 24 - horaInicial + horaFinal;
        }

        System.out.println("Foram " + horaTotal + " de Jogo");


        //--

        sc.close();


    }
}


