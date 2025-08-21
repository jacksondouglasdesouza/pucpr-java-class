package cursojavacomplementarcompleto.aulas.aulasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class ExpressoesLogicasExpressoesOu {
    public static void main(String[] args) {
        // EXPRESSÕES LÓGICAS  // OPERADOR ||  //

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // OPERADOR   --- SIGNIFICA //
        //    &&      ---    E     //  < Para && as duas ou N... condições devem ser verdadeiras;
        //    ||      ---    ou     //  < Entre N... condições devem ser verdadeiras pelo menos uma;
        //    !       ---    NOT     //  < É a negação da condição Se verdade for, Negativo Será;


        System.out.print("PERMITIDO ESTACIONAR EM VAGA ESPECIAL? : \n");
        System.out.println("USE [false = Desaprovado | true = Aprovado]");

        boolean usuarioIdoso, usuarioDeficiencia, usuarioGestante;

        System.out.printf("O usuário enquadra - se nos termos de pessoa idosa? \n");
        usuarioIdoso = scan.nextBoolean();

        System.out.printf("O usuário enquadra - se nos termos de pessoa com deficiência\n");
        usuarioDeficiencia = scan.nextBoolean();

        System.out.printf("O usuário enquadra - se nos termos de pessoa gestante?\n");
        usuarioGestante = scan.nextBoolean();

        if (usuarioIdoso || usuarioDeficiencia ||  usuarioGestante) {
            System.out.println("Acesso liberado - Cliente pode usar o estacionamento especial.");
        } else {
            System.out.println("Acesso Negado - Cliente não pode usar o estacionamento especial!");
        }

    }


}



