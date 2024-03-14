package Aulas.Aula002;
import java.util.Objects;
import java.util.Scanner;

public class PortacaoPhytonJava {
        static float calcular_preco(String tipo) {
            if (Objects.equals(tipo, "estudante")) {
                return 10;
            } else if(Objects.equals(tipo, "comum")) {
                return 20;
            } else {
                System.out.println("Tipo de ingresso inválido!");
                return 0;
            }
        }

        public static void main(String[] args) {
            int capacidade_maxima = 100;
            int ingressos_vendidos = 0;
            Scanner sc = new Scanner(System.in);

            while (ingressos_vendidos < capacidade_maxima) {
                System.out.printf("Já foram vendidos %d ingressos.\n", ingressos_vendidos);
                int ingressos_disponiveis = capacidade_maxima - ingressos_vendidos;
                System.out.printf("Ainda temos %d ingressos disponíveis.\n", ingressos_disponiveis);
                System.out.println("Quantos ingressos você deseja comprar? ");
                int quantidade = sc.nextInt();
                sc.nextLine();

                if (quantidade > ingressos_disponiveis) {
                    System.out.println("Desculpe, não temos essa quantidade de ingressos disponíveis.");
                    continue;
                }

                System.out.println("Qual o tipo de ingresso? (comum ou estudante) ");
                String tipo = sc.nextLine();

                float total_a_pagar = 0;
                for (int i = 0; i < quantidade; i++) {
                    total_a_pagar += calcular_preco(tipo);
                }

                if (total_a_pagar > 0) {
                    System.out.printf("O total a pagar é de R$%.2f\n", total_a_pagar);
                    System.out.println("Deseja confirmar a compra? (sim | nao) ");
                    String confirmacao = sc.nextLine();

                    if (Objects.equals(confirmacao, "sim")) {
                        ingressos_vendidos += quantidade;
                        System.out.println("Compra efetuada com sucesso!");
                    } else {
                        System.out.println("Compra cancelada.");
                    }
                } else {
                    System.out.println("Erro ao processar a compra.");
                }
            }

            System.out.println("Todos os ingressos foram vendidos! Obrigado!");
        }
}



// CÓDIGO PYTHON PORTADO PARA JAVA

/* ----------------------------------------------------------------------------------------------- ***
*   def calcular_preco(tipo):
  if tipo == 'estudante':
        return 10
    elif tipo == 'comum':
        return 20
    else:
        print("Tipo de ingresso invÃ¡lido!")
        return 0


capacidade_maxima = 100
ingressos_vendidos = 0

while ingressos_vendidos < capacidade_maxima:
    print(f"JÃ¡ foram vendidos {ingressos_vendidos} ingressos.")
    ingressos_disponiveis = capacidade_maxima - ingressos_vendidos
    print(f"Ainda temos {ingressos_disponiveis} ingressos disponÃ­veis.")

    quantidade = int(input("Quantos ingressos vocÃª deseja comprar? "))

    if quantidade > ingressos_disponiveis:
        print("Desculpe, nÃ£o temos essa quantidade de ingressos disponÃ­veis.")
        continue

    tipo = input("Qual o tipo de ingresso? (comum/estudante) ")

    total_a_pagar = 0
    for _ in range(quantidade):
        total_a_pagar += calcular_preco(tipo)

    if total_a_pagar > 0:
        print(f"O total a pagar Ã©: R${total_a_pagar}")
        confirmacao = input("Deseja confirmar a compra? (sim/nao) ")

        if confirmacao == 'sim':
            ingressos_vendidos += quantidade
            print("Compra efetuada com sucesso!")
        else:
            print("Compra cancelada.")
    else:
        print("Erro ao processar a compra.")

print("Todos os ingressos foram vendidos! Obrigado!")
*----------------------------------------------------------------------------------------------- ***/