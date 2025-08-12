package cursojavacomplementarcompleto.exercicios;
import java.util.Scanner;
import java.util.Locale;

public class quadranteComAsteristico {

    /*
     * Faça um programa que leia as coordenadas inteiras de um ponto (x, y) no plano cartesiano,
     * onde x e y variam de -5 a 5.
     *
     * O programa deve imprimir no console uma grade 11x11 que representa o plano cartesiano,
     * com:
     * - O eixo X representado por traços '-' na linha do meio;
     * - O eixo Y representado por barras verticais '|' na coluna do meio;
     * - A origem (0,0) marcada com o caractere '+';
     * - O ponto informado pelo usuário marcado com um asterisco '*'.
     *
     * Se o ponto estiver fora do intervalo de -5 a 5 em qualquer coordenada, o programa deve
     * avisar que o ponto não será mostrado no plano.
     */


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a coordenada x (inteiro entre -5 e 5): ");
        int x = scan.nextInt();

        System.out.println("Digite a coordenada y (inteiro entre -5 e 5): ");
        int y = scan.nextInt();

        // Criar uma matriz 11x11 para representar o plano de -5 a 5 em x e y
        // Linha 0 representa y=5 (topo), linha 10 representa y=-5 (base)
        // Coluna 0 representa x=-5 (esquerda), coluna 10 representa x=5 (direita)
        char[][] plano = new char[11][11];

        // Preencher o plano com espaços
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                plano[i][j] = ' ';
            }
        }

        // Desenhar os eixos
        // Eixo Y: coluna 5
        for (int i = 0; i < 11; i++) {
            plano[i][5] = '|';
        }
        // Eixo X: linha 5
        for (int j = 0; j < 11; j++) {
            plano[5][j] = '-';
        }
        // Origem (0,0) é a interseção dos eixos, colocar '+'
        plano[5][5] = '+';

        // Calcular posição do ponto na matriz
        // x varia de -5 a 5 → coluna = x + 5
        // y varia de -5 a 5 → linha = 5 - y (porque linha 0 é topo, y=5)
        int linhaPonto = 5 - y;
        int colunaPonto = x + 5;

        // Verificar se o ponto está dentro dos limites da matriz
        if (linhaPonto >= 0 && linhaPonto < 11 && colunaPonto >= 0 && colunaPonto < 11) {
            plano[linhaPonto][colunaPonto] = '*';
        } else {
            System.out.println("Ponto fora dos limites (-5 a 5). Não será mostrado no plano.");
        }

        // Imprimir a matriz (plano cartesiano)
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(plano[i][j]);
            }
            System.out.println();
        }

    }
}


