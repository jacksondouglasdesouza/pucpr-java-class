package cursojavacomplementarcompleto.aulas.estoquecomorientacaoobjeto.entities;

/**
 * Representa um produto num estoque, com nome, preço e quantidade.
 * A classe oferece métodos para manipular a quantidade de itens em estoque
 * e para calcular o valor total.
 * @author Jackson Douglas de Souza || <a href="https://www.linkedin.com/in/jacksondouglasdsouza">LinkedIn</a><a href="https://github.com/jacksondouglasdesouza">Github</a>
 * @version 1.0
 * @since 2025-08-20
 */
public class Produto {

    // ATRIBUTOS //

    private String nome;
    private double preco;
    private int quantidade;

    // CONSTRUTOR //

    /**
     * Construtor da classe Produto.
     * * @param nome O nome inicial do produto.
     * @param preco O preço unitário do produto.
     * @param quantidade A quantidade inicial do produto em estoque.
     */
    public Produto(String nome, double preco, int quantidade) {
        this.nome =  nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    // MÉTODOS DA CLASSE //

    /**
     * Calcula o valor total do produto em estoque.
     * * @return O valor total (preço * quantidade).
     */
    public double TotalNoEstoque(){
        return preco * quantidade;

    } //

    /**
     * Adiciona uma quantidade de itens ao estoque do produto.
     * * @param quantidadeParaAdicionar A quantidade de itens a ser adicionada.
     */
    public void AdicionarProdutosNoEstoque(int quantidadeParaAdicionar){
        this.quantidade += quantidadeParaAdicionar;
    } //

    /**
     * Remove uma quantidade de itens do estoque do produto.
     * * @param quantidadeParaRemover A quantidade de itens a ser removida.
     */
    public   void RemoverProdutosDoEstoque(int quantidadeParaRemover){
        this.quantidade -= quantidadeParaRemover;

    } //

    /**
     * Retorna uma representação em String do objeto Produto, formatada para exibição.
     * * @return Uma string com todos os dados do produto.
     */
    public String toString() {
        return "DADOS DO PRODUTO: \n"
                + nome + "\n"
                + String.format("R$ %.2f", preco) + "\n"
                + String.format("Quantidade: %d", quantidade) + " Unidades\n"
                + String.format("Total em estoque R$%.2f", TotalNoEstoque());
    }


}
