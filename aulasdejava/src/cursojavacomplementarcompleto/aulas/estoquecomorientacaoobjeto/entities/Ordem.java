package cursojavacomplementarcompleto.aulas.estoquecomorientacaoobjeto.entities;

import java.util.Date;

public class Ordem {

    private Date data;
    private Produto produto;

    public Ordem() {
    }

    public Ordem(Date data, Produto produto) {
        this.data = data;
        this.produto = produto;
        this.produto.sobrenomeProduto = produto.sobrenomeProduto; // Acesso ao atributo default (pacote) para teste
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
