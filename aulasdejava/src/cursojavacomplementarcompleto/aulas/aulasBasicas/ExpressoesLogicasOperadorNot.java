package cursojavacomplementarcompleto.aulas.aulasBasicas;

import java.util.Locale;
import java.util.Scanner;

public class ExpressoesLogicasOperadorNot {

    public static void main(String[] args) {
        // EXPRESSÕES LÓGICAS  // OPERADOR NOT - SEMPRE INVERTE A CONDIÇÃO  //
        // Verificação de Bolsa com Expressões Lógicas — Ensinando o operador ! //

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // OPERADOR   --- SIGNIFICA //
        //    &&      ---    E     //  < Para && as duas ou N... condições devem ser verdadeiras;
        //    ||      ---    ou     //  < Entre N... condições devem ser verdadeiras pelo menos uma;
        //    !       ---    NOT     //  < É a negação da condição Se verdade for, Negativo Será;


        System.out.print("ALUNO APTO A GANHAR BOLSA DE ESTUDO? : \n");
        System.out.println("USE [false = Desaprovado | true = Aprovado]");

        boolean alunoMatriculado, aluno70porcentoFrencia, alunoCadastradoCadUnico, alunoGanhaAte1Salario;

        System.out.printf("O aluno está devidamente matriculado? \n");
        alunoMatriculado = scan.nextBoolean();

        System.out.printf("O aluno tem no mínimo 70%% de frequência no semestre letivo \n");
        aluno70porcentoFrencia = scan.nextBoolean();

        System.out.printf("O aluno tem cadastro no Cad único válido?\n");
        alunoCadastradoCadUnico = scan.nextBoolean();

        System.out.println("O aluno tem renda de até no máximo 1 salário mínimo? ");
        alunoGanhaAte1Salario = scan.nextBoolean();

        //--

        if (!alunoMatriculado || !aluno70porcentoFrencia || !alunoCadastradoCadUnico || !alunoGanhaAte1Salario) {
            System.out.println("BOLSA NEGADO - ALUNO NÃO APTO PARA RECEBER BOLSA DE ESTUDOS NO SEMESTRE LETIVO.");
        } else if(alunoMatriculado && aluno70porcentoFrencia && alunoCadastradoCadUnico &&  alunoGanhaAte1Salario) {
            System.out.println("BOLSA APROVADA - ALUNO ESTÁ APTO PARA RECEBER BOLSA DE ESTUDOS NO SEMESTRE LETIVO.");
        } else {
            System.out.println("Algo de errado nos dados do aluno. Tente novamente!");
        }

    }

}
