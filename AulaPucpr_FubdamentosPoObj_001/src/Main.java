import java.util.Objects;
import java.util.Scanner;

public class Main {

    /*
    static float calcular_preco(String tipo){
        if (Objects.equals(tipo, "estudante")){
            return 10;
        } else if (Objects.equals(tipo, "normal")){
            return 20;
        } else {
            return 0;
        }
    }

     */

    static float calcular_preco(String tipo){
        if ("estudante".equalsIgnoreCase(tipo)){
            return 10;
        } else if ("normal".equalsIgnoreCase(tipo)){
            return 20;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        /*
        System.out.println("Hello World");

        int a = 15;
        int b = 15;

        System.out.println(a + b);

        if (a + b == 30){
            System.out.println("Ok");
        } else  {
            System.out.println("Not Ok");
        }



         */
        // ---

        int capacidade_maxima = 100;
        int ingressos_vendidos = 0;
        Scanner scan = new Scanner(System.in);

        // --

        while (ingressos_vendidos < capacidade_maxima){
            System.out.printf("Já foram vendidos %d.\n", ingressos_vendidos);
            int ingressos_disponiveis = capacidade_maxima - ingressos_vendidos;

            System.out.printf("Ainda temos disponíveis %d ingressos\n", ingressos_disponiveis);

            System.out.println("Quantos Ingressos Você deseja Comprar?");

            int quantidade = scan.nextInt();
            scan.nextLine();

            if(quantidade > ingressos_disponiveis){
                System.out.println("Não temos esta quantidade de ingressos disponíveis!");
                continue;
            }

            // --

            System.out.println("Qual tipo de Ingresso deseja? [normal / estudante]");
            String tipo = scan.nextLine();

            float total_a_pagar = 0;

            for (int i = 0; i < quantidade; i++) {
                total_a_pagar += calcular_preco(tipo);
            }

            if (total_a_pagar > 0){
                System.out.printf("O total a pagar é R$%.2f \n", total_a_pagar);
                System.out.println("Deseja conformar a compra? [sim / não]");

                String confirmacao =  scan.nextLine();

                // --
                /*
                if(Objects.equals(confirmacao, "sim")){
                    ingressos_vendidos += quantidade;
                    System.out.println("Compra efetuada com Sucesso!");
                } else {
                    System.out.println("Compra Cancelada!");
                }

                 */

                if ("sim".equalsIgnoreCase(confirmacao)) {
                    ingressos_vendidos += quantidade;
                    System.out.println("Compra efetuada com Sucesso!");
                } else {
                    System.out.println("Compra Cancelada!");
                }


            } else {
                System.out.println("Erro de Processamento");
            }
        }
        System.out.println("[ INGRESSOS ESGOTADOS ]!");
    }
}