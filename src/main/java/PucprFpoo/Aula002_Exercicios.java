package PucprFpoo;
import java.util.Scanner;

public class Aula002_Exercicios {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        * 1. Crie um algoritmo em Java que solicita três números decimais ao usuário.
        * Em seguida, a média destes números é calculada e mostrada na tela para o usuário.
        * */

        /*

        System.out.println("Digite o primero número: ");
        float numero01 = sc.nextFloat();
        System.out.println("Digite o segundo número: ");
        float numero02 = sc.nextFloat();
        System.out.println("Digite o terceiro número: ");
        float numero03 = sc.nextFloat();

        float media = (numero01 + numero02 + numero03) / 3;

        System.out.println("A média Aritimética é de: " + media);

        */

        //--

        /*
        * 2. Crie um algoritmo em Java que verifica se um número inteiro é positivo, negativo ou zero.
        * */

        //--

        /*
        System.out.println("Digite um número inteiro: ");
        int numeroDigitado = sc.nextInt();
        */

        //--

        /*

        if(numeroDigitado > 0){
            System.out.println("O número digitado é positivo!");
        } else if (numeroDigitado < 0) {
            System.out.println("O número digitado é negativo!");
        } else {
            System.out.println("O número digitado é Nulo!");
        }

        */

        //--

        /*
        * Crie um algoritmo em Java que mostre na tela todos os múltiplos de 3 entre
        * os números 0 e 30 usando a estrutura “do while”.
        * */

        /*
        int i = 0;
        while (i <= 30){
            if(i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }

        */

        //--


        /*
        System.out.println("Digite um Número inteiro: ");
        int numeroInteiro = sc.nextInt();

        for(int i = 0; i <= numeroInteiro; i++){
            System.out.println(numeroInteiro * i);
        }

        */

        /*


        System.out.println("Digite um ano: ");
        int ano = sc.nextInt();

        // Verifica se o ano é bissexto ou não
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

         */



        /*
        * Crie um algoritmo em Java que solicita um número
        *  inteiro ao usuário. Em seguida, deve-se verificar
        *  se o número digitado é ou não é um número primo.*/


        /*
        System.out.println("Digite um Número: ");
        int numero = sc.nextInt();

        boolean ehPrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo && numero > 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

         */

        //--

        /**
         * Crie um algoritmo em Java que peça ao usuário a temperatura em graus
         * Celsius e converta-a para graus Fahrenheit. Além disso, o programa deve
         * imprimir se está frio (abaixo de 32°F),
         * moderado (entre 32°F e 80°F) ou
         * quente (acima de 80°F).
         */


        /*

        System.out.println("Digite aqui a temperatura local: ");
        float temperaturaCelsius = sc.nextFloat();

        double fahrenheit = ((temperaturaCelsius * 9) / 5) + 32;

        if(fahrenheit < 32){
            System.out.println("Esta Frio!");
        } else if (fahrenheit <= 80) {
            System.out.println("A temperatura está moderada!");
        } else if (fahrenheit > 80) {
            System.out.println("O clima esta quente!");
        };

        System.out.println(fahrenheit);


         */

        /*
        *Desenvolva um algoritmo
        *em Java que peça ao usuário um número inteiro n e gere um
        *padrão de asteriscos. Por exemplo, se n for 5, o padrão seria assim:
         *
         **
         ***
         ****
         *****
        */

        /*
        // Solicita ao usuário um número inteiro n
        System.out.print("Digite um número inteiro n: ");
        int n = sc.nextInt();

        // Loop externo para iterar de 1 até n
        for (int linha = 1; linha <= n; linha++) {

            // Loop interno para imprimir asteriscos na linha atual
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print("*");
            }

            // Quebra de linha após imprimir os asteriscos da linha atual
            System.out.println();
        }

         */



        // Solicita ao usuário que insira um número inteiro entre 1 e 1000
        System.out.print("Digite um número inteiro entre 1 e 1000: ");
        int numero = sc.nextInt();

        // Verifica se o número está dentro do intervalo permitido
        if (numero < 1 || numero > 1000) {
            System.out.println("Número fora do intervalo permitido.");
            return;
        }

        // Converte o número inteiro em um número romano
        String numeroRomano = converterParaRomano(numero);

        // Exibe o número romano correspondente
        System.out.println("Número romano equivalente: " + numeroRomano);

        sc.close();
    } //-- Fim Main

    // Método para converter um número inteiro em um número romano
    public static String converterParaRomano(int numero) {
        // Arrays de símbolos romanos e seus valores correspondentes
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder resultado = new StringBuilder();

        // Loop para iterar sobre os valores romanos e seus equivalentes
        for (int i = 0; i < valores.length; i++) {
            // Enquanto o número for maior ou igual ao valor romano atual
            while (numero >= valores[i]) {
                // Adiciona o símbolo romano correspondente ao resultado
                resultado.append(simbolos[i]);
                // Subtrai o valor romano atual do número
                numero -= valores[i];
            }
        }

        return resultado.toString();

    } //-- Fim do Método

}
