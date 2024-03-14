package br.com.aulasjava.PucprFpoo.Aula02;

/*
* Crie um algoritmo em Java que calcule a distância de Levenshtein entre duas Strings.
* A distância de Levenshtein é a quantidade mínima de edições de um único caractere
*  (inserções, exclusões ou substituições) necessárias para mudar uma palavra para outra.
* */

public class Aula002_Desafio_02 {

    public static void main(String[] args) {
        String palavra1 = "casa";
        String palavra2 = "casinha";

        int distancia = calcularDistanciaLevenshtein(palavra1, palavra2);
        System.out.println("A distância de Levenshtein entre \"" + palavra1 + "\" e \"" + palavra2 + "\" é: " + distancia);
    }

    public static int calcularDistanciaLevenshtein(String palavra1, String palavra2) {
        int m = palavra1.length();
        int n = palavra2.length();

        // Criar uma matriz para armazenar as sub-distâncias calculadas
        int[][] dp = new int[m + 1][n + 1];

        // Preencher a primeira linha e a primeira coluna
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        // Preencher o restante da matriz
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (palavra1.charAt(i - 1) == palavra2.charAt(j - 1)) {
                    // Se os caracteres são iguais, não há necessidade de editar
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // Se os caracteres são diferentes, escolher a menor sub-distância
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }

        // O valor na posição dp[m][n] é a distância de Levenshtein
        return dp[m][n];
    }


} //-- End Classe




