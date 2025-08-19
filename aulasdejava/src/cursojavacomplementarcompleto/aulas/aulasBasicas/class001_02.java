package cursojavacomplementarcompleto.aulas.aulasBasicas;
import java.util.Scanner;
import java.util.Locale;

public class class001_02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // CAPTAR SOMENTE UM CARACTER CHAR

        // ----

        char entradaChar;

        System.out.println("Você é do sexo Masculino ou Feminino? ");
        entradaChar = scan.next().charAt(0);


        System.out.println("Obrigado. Agora siga o passo abaixo: ");

        double variavelDouble_01, variavelDouble_02;

        System.out.println("Sexo do Usuário: " + entradaChar);
        System.out.println("Digite um número com casa decimal: ");
        variavelDouble_01 = scan.nextDouble();

        System.out.println("Digite outro número com casa decimal: ");
        variavelDouble_02 = scan.nextDouble();

        scan.close();

        double somaVariaveis = variavelDouble_01 + variavelDouble_02;

        System.out.println("Muito bem a soma dos números digitados é: " + somaVariaveis);


    }

}
