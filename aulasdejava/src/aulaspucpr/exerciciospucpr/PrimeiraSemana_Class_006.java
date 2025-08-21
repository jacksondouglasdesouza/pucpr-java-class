package aulaspucpr.exerciciospucpr;
import java.util.Scanner;

public class PrimeiraSemana_Class_006 {
    public static void main(String[] args) {

        //6. Crie um algoritmo em Java que solicita um número inteiro ao usuário.
        // Em seguida, deve-se verificar se o número digitado é ou não é um número primo.

        Scanner scan = new Scanner(System.in);
        int entradaDados;

        System.out.print("Digite um número inteiro: ");
        entradaDados = scan.nextInt();
        scan.close();

        //--

        boolean numeroPrimo = true;

        if(entradaDados <= 1){
            numeroPrimo = false;
        } else{
            for(int i = 2; i <= Math.sqrt(entradaDados); i++){
                if (entradaDados % i == 0){
                    numeroPrimo = false;
                    break;
                }//
            //
            }
        }//


        //--

        if(numeroPrimo){
            System.out.println("O Número digitado é Primo.");
        } else {
            System.out.print("O número digitado não é primo.");
        }//


    }

}
