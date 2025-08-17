package cursojavacomplementarcompleto.aulas;
import java.util.Scanner;
import java.util.Locale;

public class estruturaSwitchCase {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // SWITCH CASE //

        // Usa-se à estrutura ao ter opções de fluxo a serem tratadas com base no valor
        // de uma variável, ao invés de várias estruturas IF-ELSE encadeadas.

        int diaSemana;

        System.out.println("\n###ESCOLHA UM DIA DA SEMANA ###\n");
        System.out.println("1 - Para Segunda Feira;");
        System.out.println("2 - Para Terça Feira;");
        System.out.println("3 - Para Quarta Feira;");
        System.out.println("4 - Para Quinta Feira;");
        System.out.println("5 - Para Sexta Feira;");
        System.out.println("6 - Para Sábado;");
        System.out.println("7 - Para Domingo;");
        System.out.println(" ###############################\n");
        System.out.println("Digite o dia de semana: ");
        diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Você escolheu segunda feira. ");
                break;
                case 2:
                    System.out.println("Você escolheu terça feira. ");
                    break;
                    case 3:
                        System.out.println("Você escolheu quarta feira. ");
                        break;
                        case 4:
                            System.out.println("Você escolheu quinta feira. ");
                            break;
                            case 5:
                                System.out.println("Você escolheu sexta feira. ");
                                break;
                                case 6:
                                    System.out.println("Você escolheu sábado. ");
                                    break;
                                    case 7:
                                        System.out.println("Você escolheu domingo. ");
                                        break;
                                        default:
                                            System.out.println("Você deve escolher entre 1 a 7.");
                                            break;
        } // --

        System.out.println("Programa finalizado com sucesso!");

        scan.close();
    }
}
