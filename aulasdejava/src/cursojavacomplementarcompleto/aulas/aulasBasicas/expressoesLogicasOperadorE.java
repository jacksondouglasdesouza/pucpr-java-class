package cursojavacomplementarcompleto.aulas.aulasBasicas;

import  java.util.Locale;
import java.util.Scanner;

public class expressoesLogicasOperadorE {

    public static void main(String[] args) {
        // EXPRESSÕES LÓGICAS  // OPERADOR && //

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // OPERADOR   --- SIGNIFICA //
        //    &&      ---    E     //  < Para && as duas ou N... condições devem ser verdadeiras;
        //    ||      ---    ou     //  < Entre N... condições devem ser verdadeiras pelo menos uma;
        //    !       ---    NOT     //  < É a negação da condição Se verdade for, Negativo Será;


        System.out.print("APROVADO - CARTEIRA DE HABILITAÇÃO: \n");

        boolean exPsicotecnico, exLegislacao, exDirecao;

        System.out.printf("Você foi aprovado no exame psicotécnico? [false = Desaprovado | true = Aprovado]\n");
        exPsicotecnico = scan.nextBoolean();

        System.out.printf("Você foi aprovado no exame de legislação? [false = Desaprovado | true = Aprovado] \n");
        exLegislacao = scan.nextBoolean();

        System.out.printf("Você foi aprovado no exame de direção? [false = Desaprovado | true = Aprovado] \n");
        exDirecao = scan.nextBoolean();

        if (exPsicotecnico && exLegislacao && exDirecao == true){
            System.out.println(" Parabéns você foi aprovado e receberá sua carteira de habilitação em breve");
        } else {
            System.out.println("Você não foi aprovado, não está apto para dirigir!");
        }

    }
}
