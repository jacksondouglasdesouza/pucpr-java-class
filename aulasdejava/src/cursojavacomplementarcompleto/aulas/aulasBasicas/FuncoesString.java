package cursojavacomplementarcompleto.aulas.aulasBasicas;
import java.util.Scanner;
import java.util.Locale;

public class FuncoesString {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String letras;

        System.out.println("Digite letras em formatos variados, entre maiúsculas e minúsculas: ");
        letras = scan.nextLine();

        String letraslowerCase = letras.toLowerCase();
        String  letrasUppercase = letras.toUpperCase();
        String letrasTrim = letras.trim();
        String letrasSubString = letras.substring(2);
        String letrasSubStringLimite = letras.substring(2, 9);
        String letrasRepalce = letras.replace('J', '#');
        int letrasIndexOf = letras.indexOf("JJ"); // Primeira Ocorrência de JJ
        int letrasLastOf =  letras.lastIndexOf("JJ"); // Última Ocorrência de JJ

        System.out.println("# Letras Entrada: " + letras + "||||");
        System.out.println("# Letras Lower Case: " + letraslowerCase);
        System.out.println("# Letras Upper Case: " + letrasUppercase);
        System.out.println("# Letras Trim: " + letrasTrim + "|||| <<< o Trim vai eliminar o espaço a direita!");
        System.out.println("# Letras Substring: " + letrasSubString + " <<< Vai pegar da posição 2 para frente!");
        System.out.println("# Letras Substring Limite: " + letrasSubStringLimite + " <<< Vai pegar da posição 02 até 09!");
        System.out.println("# Letras Repalce: " + letrasRepalce + " <<< Vai trocar a [ entrada ] pela [ Escolha ]");
        System.out.println("# Letras IndexOF: " + letrasIndexOf + " <<< Vai pegar a posição da Primeira Ocorrência da Entrada!");
        System.out.println("# letra lastIndexOF: " + letrasLastOf + "<<< Vai pegar a posição da Última ocorrência da Entrada!");

        // FUNÇÃO SPLIT //

        String entradaString;

        System.out.println("Digite 5 palavras separadas por espaço: ");
        entradaString = scan.nextLine();
        String[] stringSplit = entradaString.split(" ");

        System.out.println("Palavras de Entrada: " + entradaString);
        System.out.println("Primeira palavra de entrada: [ " + stringSplit[0] + " ]");
        System.out.println("Segunda palavra de entrada: [ " + stringSplit[1] + " ]");
        System.out.println("Terceira Palavra de entrada: [ " + stringSplit[2] + " ]");
        System.out.println("Quarta Palavra de entrada: [ " + stringSplit[3] + " ]");
        System.out.println("Quinta Palavra de entrada: [ " + stringSplit[4] + " ]");


        scan.close();
    }
}
