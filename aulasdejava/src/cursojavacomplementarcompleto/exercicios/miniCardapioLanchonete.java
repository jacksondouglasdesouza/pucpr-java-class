package cursojavacomplementarcompleto.exercicios;
import java.util.Locale;
import java.util.Scanner;

public class miniCardapioLanchonete {

    public static void main(String[] args) {

        //Com base na tabela abaixo, escreva um programa que leia o código de um item
        // e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int idProduto, quantidadeProduto;
        double totalPagar, precoProduto = 0.00;

        System.out.println("=== CARDÁPIO ===");
        System.out.printf("%-6s %-20s %s%n", "CÓD", "ESPECIFICAÇÃO", "PREÇO");
        System.out.println("-----------------------------------------");
        System.out.printf("%-6d %-20s R$ %.2f%n", 1, "Cachorro Quente", 4.00);
        System.out.printf("%-6d %-20s R$ %.2f%n", 2, "X-Salada", 4.50);
        System.out.printf("%-6d %-20s R$ %.2f%n", 3, "X-Bacon", 5.00);
        System.out.printf("%-6d %-20s R$ %.2f%n", 4, "Torrada simples", 2.00);
        System.out.printf("%-6d %-20s R$ %.2f%n", 5, "Refrigerante", 1.50);

        System.out.println("Digite o código de seu produto: ");
        idProduto = scan.nextInt();

        if(idProduto <= 0 || idProduto > 5){
            System.out.println("O produto deve ter ID entre 1 e 5");
            scan.close();
            return;
        } //

        System.out.println("Escolha a quantidade desejada deste item:  ");
        quantidadeProduto = scan.nextInt();

        if(idProduto == 1){
            precoProduto = 4.00;
        } else if(idProduto == 2){
            precoProduto = 4.50;
        } else  if(idProduto == 3){
            precoProduto = 5.00;
        } else if(idProduto == 4){
            precoProduto = 2.00;
        }  else if(idProduto == 5){
            precoProduto = 1.50;
        }

        totalPagar = precoProduto * quantidadeProduto;

        System.out.printf("O valor de sua conta é R$ %.2f", totalPagar);

       scan.close();
    }
}
