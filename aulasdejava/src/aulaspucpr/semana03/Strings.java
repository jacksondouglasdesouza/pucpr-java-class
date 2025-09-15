package aulaspucpr.semana03;

public class Strings {
    public static void main(String[] args) {
        char character = 'a'; // char é um tipo primitivo para receber um character
        String string = "abcdefghijklmnopqrstuvwxyz"; // String é uma classe para receber uma sequência de characters.

        String nome01 = new String(string);
        String nome02 = "abcdefghijklmnopqrstuvwxyz";
        String nome03 = string;

        System.out.println(nome01);
        System.out.println(nome02);
        System.out.println(nome03);

        String concatenacaoDeStrings = nome01.concat(nome02);
        System.out.println(concatenacaoDeStrings);
        String concatenacaoDeStrings2 = nome01 + nome02 + " mais alguma coisa";
        System.out.println(concatenacaoDeStrings2);
        String frase = "O rato roeu a roupa do rei de Roma";
        String outraFrase = "O rato roeu a roupa do rei de Romaria";
        String outraFrase2 = frase.toUpperCase(); // Converte todos os caracteres para maiúsculo
        String vazia = "";

        // CharAt
        System.out.println(frase.charAt(5)); // Retorna o character na posição 5 da String frase

        //equals(Object anObject) - Compara se duas strings são exatamente iguais (case-sensitive).
        boolean iguais = frase.equals(outraFrase);
        System.out.println(iguais); // false

        //equalsIgnoreCase(String anotherString) - Compara duas strings ignorando maiúsculas e minúsculas.
        boolean iguaisIgnoreCase = frase.equalsIgnoreCase(outraFrase2);
        System.out.println(iguaisIgnoreCase); // true porque ignora o case sensitive

        //indexOf(int ch) - Retorna o índice da primeira ocorrência de um caractere.
        int indiceDoR = frase.indexOf('r'); // 2
        System.out.println(indiceDoR);

        //indexOf(String str) - Retorna o índice da primeira ocorrência de uma substring.
        int indiceDaRoupa = frase.indexOf("roupa"); // 14
        System.out.println(indiceDaRoupa);

        //isEmpty() - Retorna true se a string estiver vazia (comprimento 0).
        boolean vaziaCheck = vazia.isEmpty(); // true
        System.out.println(vaziaCheck);

        //length() - Retorna o número de caracteres na string.
        int tamanhoDaFrase = frase.length(); // 34
        System.out.println(tamanhoDaFrase);

        //replace(char oldChar, char newChar) - Substitui todas as ocorrências de um caractere por outro.
        String novaFrase = frase.replace('r', '#'); // "O l##ato ##oeu a ##oupa do ##ei de Roma"
        System.out.println(novaFrase);

        //substring(int beginIndex) - Extrai uma parte da string a partir de um índice.
        String subFrase = frase.substring(10); // "u a roupa do rei de Roma"
        System.out.println(subFrase);

        //toLowerCase() - Converte a string para minúsculas.
        String fraseMinuscula = frase.toLowerCase(); // "o rato roeu a roupa do rei de roma"
        System.out.println(fraseMinuscula);

        //toUpperCase() - Converte a string para maiúsculas.
        String fraseMaiuscula = frase.toUpperCase(); // "O RATO ROEU A ROUPA DO REI DE ROMA"
        System.out.println(fraseMaiuscula);

        // --- Exemplos com valueOf --- //

        int numero = 123;
        String numeroString = String.valueOf(numero); // Converte o int para String
        System.out.println(numeroString +"\t"+numero); // "123"

    }
}
