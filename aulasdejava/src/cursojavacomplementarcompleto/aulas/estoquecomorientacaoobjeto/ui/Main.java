package cursojavacomplementarcompleto.aulas.estoquecomorientacaoobjeto.ui;
import cursojavacomplementarcompleto.aulas.estoquecomorientacaoobjeto.entities.Produto;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        // NOVO PRODUTO - ID 0001 //

        System.out.println("Digite o nome do produto: ");
        String nome = scan.nextLine();
        System.out.println("Digite a quantidade do produto: ");
        int quantidade = scan.nextInt();
        System.out.println("Digite o valor do produto: ");
        double valor = scan.nextDouble();

        Produto produtoId0001 = new Produto(nome, valor, quantidade);

        System.out.println("\n");
        System.out.println("ID 001: " + produtoId0001);

        System.out.println("VAMOS ADICIONAR MAIS PRODUTOS AO ESTOQUE?");
        System.out.println("Digite a quantidade do produto para adicionar ao estoque: ");
        int adicionarId001 = scan.nextInt();

        produtoId0001.AdicionarProdutosNoEstoque(adicionarId001);

        System.out.println("\n");
        System.out.println("#" + produtoId0001);

        System.out.println("VAMOS REMOVER PRODUTOS DO ESTOQUE?");
        System.out.println("Digite a quantidade para retirar do estoque: ");
        int retirarId001 = scan.nextInt();

        produtoId0001.RemoverProdutosDoEstoque(retirarId001);

        System.out.println("\n");
        System.out.println("#" + produtoId0001);


        // NOVO PRODUTO - ID 0002 //


        System.out.println("\n--- Cadastro do Produto 2 ---");
        scan.nextLine(); //  Evita pular a entrada do Próximo produtoName.

        System.out.println("\n");
        System.out.println("Digite o nome do produto: ");
        String nomeId0002 = scan.nextLine();
        System.out.println("Digite a quantidade do produto: ");
        int quantidadeId0002 = scan.nextInt();
        System.out.println("Digite o valor do produto: ");
        double precoId0002 = scan.nextDouble();

        Produto produtoId0002 = new Produto(nomeId0002, precoId0002, quantidadeId0002);

        System.out.println("\n");
        System.out.println("----- POSIÇÃO ATUAL NO ESTOQUE -----\n");
        System.out.println("ID 001: " + produtoId0001 + "\n####################################");
        System.out.println("\nID 002: " + produtoId0002 + "\n####################################");


        System.out.println("\n");
        System.out.println("VAMOS ADICIONAR MAIS PRODUTOS AO ESTOQUE?");
        System.out.println("Digite a quantidade do produto para adicionar ao estoque: ");
        int adicionarId002 = scan.nextInt();

        produtoId0002.AdicionarProdutosNoEstoque(adicionarId002);

        System.out.println("\n");
        System.out.println("----- POSIÇÃO ATUAL NO ESTOQUE -----\n");
        System.out.println("ID 001: " + produtoId0001 + "\n####################################");
        System.out.println("\nID 002: " + produtoId0002 + "\n####################################");

        System.out.println("\n");
        System.out.println("VAMOS RETIRAR PRODUTOS DO ESTOQUE?");
        System.out.println("Digite a quantidade para retirar do estoque: ");
        int retirarId002 = scan.nextInt();

        produtoId0002.RemoverProdutosDoEstoque(retirarId002);

        System.out.println("\n");
        System.out.println("----- POSIÇÃO ATUAL NO ESTOQUE -----\n");
        System.out.println("ID 001: " + produtoId0001 + "\n####################################");
        System.out.println("\nID 002: " + produtoId0002 + "\n####################################");


        scan.close();

    }
}
