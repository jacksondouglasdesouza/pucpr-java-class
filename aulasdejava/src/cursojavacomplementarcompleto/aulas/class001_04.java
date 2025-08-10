package cursojavacomplementarcompleto.aulas;

import java.util.Locale;
import java.util.Scanner;

public class class001_04 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        // RECEBENDO VÁRIOS TIPOS DE DADOS NO SCANNER EM SEQUÊNCIA

        int value01, value02, value03, value04, value05;
        String nomeUsuario;

        System.out.println("Digite o seu nome, em seguida digite 5 números inteiros para somar: ");
        nomeUsuario = scan.nextLine();
        // ENTRADA INTEIROS
        value01 = scan.nextInt();
        value02 = scan.nextInt();
        value03 = scan.nextInt();
        value04 = scan.nextInt();
        value05 = scan.nextInt();

        scan.close();

        int soma = value01 + value02 + value03 + value04 + value05;

        System.out.println("Obrigado " + nomeUsuario);
        System.out.println("A soma dos números digitados é: " + soma);


    }

}
