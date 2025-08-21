package cursojavacomplementarcompleto.aulas.aulasBasicas;

import java.util.Scanner;
import java.util.Locale;

public class EstruturaCondicionalIfElse {

    public static void main(String[] args) {
        // ESTRUTURA CONDICIONAL IF ELSE

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double horario;

        System.out.println("Digite o valor da hora atual: ");
        horario = scan.nextDouble();

        if(horario >= 0){
            //
            if( horario < 12 ){
                System.out.println("Bom dia Amigão!");
                System.out.printf("Horário digitado: %.2f horas\n", horario);
            } else if( horario <= 18 ){
                System.out.println("Boa tarde Amigão!");
                System.out.printf("Horário digitado: %.2f horas\n", horario);
            } else if( horario <= 24 ){
                System.out.println("Boa noite Amigão!");
                System.out.printf("Horário digitado: %.2f horas\n", horario);

            } else {
                System.out.println("Horário Inválido, tente novamente!");
            } //

        } else {
            System.out.println("Valor inválido! Digite um horário entre 0 e 24.");
        }

        scan.close();

    }

}
