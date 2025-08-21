package cursojavacomplementarcompleto.aulas.aulasBasicas;

import java.util.Scanner;

public class Class001_00 {

    public static void main(String[] args) {
        // ENTRADA DE DADOS EM JAVA SCANNER

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu primeiro nome: ");
        String entradaDados =  scan.next();

        scan.close();

        System.out.printf("Ótimo, seja bem vindo %s ", entradaDados);

    }

}
