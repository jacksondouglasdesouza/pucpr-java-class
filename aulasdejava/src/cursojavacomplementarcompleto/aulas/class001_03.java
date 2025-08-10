package cursojavacomplementarcompleto.aulas;

import java.util.Scanner;
import java.util.Locale;


public class class001_03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        // RECEBENDO VÁRIOS TIPOS DE DADOS NO SCANNER

        int entradaInt;
        double entradaDouble;
        String entradaString;
        char entradaChar;

        System.out.println("Digite o seu nome: ");
        entradaString = scan.next();

        System.out.println("Digite sua idade: ");
        entradaInt = scan.nextInt();

        System.out.println("Digite sua Altura: ");
        entradaDouble = scan.nextDouble();

        System.out.println("Você é do sexo, Masculino ou Feminino? ");
        entradaChar = scan.next().charAt(0);

        scan.close();

        System.out.println("Obrigado, pode conferir se seus dados estão corretos? ");
        System.out.println("Seu nome é: " + entradaString);
        System.out.println("Sua idade é: " + entradaInt);
        System.out.println("Sua altura é: " + entradaDouble);
        System.out.println("Seu sexo é: " + entradaChar);

    }
}

