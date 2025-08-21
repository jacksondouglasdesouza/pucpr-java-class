package cursojavacomplementarcompleto.aulas.aulasBasicas;
import java.util.Scanner;
import java.util.Locale;

public class ExpressaoTernaria {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // EXPRESSÃO COM OPERADORES TERNÁRIOS //

        double valueTerra;

        System.out.println("Digite o valor do terra: ");
        valueTerra = scan.nextDouble();


        if (valueTerra >= 150000){
            System.out.println("Não tenho proposta para está terra!");
        } else {
            System.out.println("Posso considerar fazer uma oferta no seu terreno!");
        }

        // CONTRA PROPOSTA COM OPERADOR TERNÁRIO //

        char agendarReuniao;

        System.out.println("Você aceita agendar uma reunião para falar sobre o andamento da compra? [S / N]");
        agendarReuniao = scan.next().charAt(0);

        String mensagem = (agendarReuniao == 'S') ? "Agendaremos a sua reunião, obrigado!" : "Não agendaremos Obrigado!";

        System.out.println("Feedback: " + mensagem);
        System.out.println("PROGRAMA FINALIZADO.");

        scan.close();


    }
}
