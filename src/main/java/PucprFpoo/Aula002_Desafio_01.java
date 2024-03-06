package PucprFpoo;

import java.util.Scanner;
import java.util.Random;

public class Aula002_Desafio_01 {

    /*
    * 10. Crie um algoritmo em Java contendo
    *  a lógica do jogo da forca. O programa deve escolher aleatoriamente uma
    * palavra de uma lista de palavras e o usuário deve adivinhar a palavra,
    * uma letra de cada vez. O usuário tem um número fixo de tentativas
    * para adivinhar a palavra.
    * */

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Lista de palavras
        String[] palavras = {"gato", "cachorro", "elefante", "girafa", "leão", "tigre"};

        // Escolha aleatória de uma palavra da lista
        Random random = new Random();
        String palavraEscolhida = palavras[random.nextInt(palavras.length)];

        // Número de tentativas permitidas
        int tentativasMaximas = 6;
        int tentativas = 0;

        // Palavra oculta (substitui as letras pelacentuais)
        StringBuilder palavraOculta = new StringBuilder();
        for (int i = 0; i < palavraEscolhida.length(); i++) {
            palavraOculta.append("_ ");
        }

        // Instruções para o usuário
        System.out.println("Bem-vindo ao jogo da forca!");
        System.out.println("Adivinhe a palavra, uma letra de cada vez.");
        System.out.println("A palavra tem " + palavraEscolhida.length() + " letras.");

        // Loop principal do jogo
        while (tentativas < tentativasMaximas) {
            System.out.println("\nPalavra: " + palavraOculta);
            System.out.println("Tentativas restantes: " + (tentativasMaximas - tentativas));

            // Solicita ao usuário uma letra
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().charAt(0);

            // Verifica se a letra está presente na palavra
            boolean letraEncontrada = false;
            for (int i = 0; i < palavraEscolhida.length(); i++) {
                if (palavraEscolhida.charAt(i) == letra) {
                    palavraOculta.setCharAt(i * 2, letra);
                    letraEncontrada = true;
                }
            }

            // Verifica se o usuário ganhou
            if (palavraOculta.indexOf("_") == -1) {
                System.out.println("\nParabéns, você ganhou! A palavra era: " + palavraEscolhida);
                break;
            }

            // Se a letra não foi encontrada, incrementa o número de tentativas
            if (!letraEncontrada) {
                tentativas++;
                System.out.println("Letra não encontrada. Tente novamente.");
            }
        }

        // Verifica se o usuário perdeu
        if (tentativas == tentativasMaximas) {
            System.out.println("\nVocê perdeu! A palavra correta era: " + palavraEscolhida);
        }

        scanner.close();
    }

} //-- End Classe




