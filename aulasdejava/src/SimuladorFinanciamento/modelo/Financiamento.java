package SimuladorFinanciamento.modelo;

public class Financiamento {

    // Atributos
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    // Construtor da classe
    public  Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    // Métodos getters
    public double getValorImovel(){
        return this.valorImovel;
    }

    public int getPrazoFinanciamento(){
        return this.prazoFinanciamento;
    }

    public double getTaxaJurosAnual(){
        return this.taxaJurosAnual;
    }

    // Métodos Setters - Não achei necessário,
    // pois o enunciado global do projeto reforça a ideia de que
    // o “design” do projeto é criar objetos de financiamento "imutáveis"
    // Professor por favor me corrija se eu estiver errado;
    // que implementarei na entrega seguinte.

    // Métodos da Classe
    public double calcularPagamentoMensal(){
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    public double calcularTotalPagamento(){
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }

    public void mostrarDadosFinanciamento(){
        System.out.println("#------------------------------------------#");
        System.out.println("|           DADOS DO FINANCIAMENTO         |");
        System.out.println("#------------------------------------------#");
        System.out.printf("| %-30s | R$ %,10.2f |\n", "Valor do imóvel:", this.getValorImovel());
        System.out.printf("| %-30s | R$ %,10.2f |\n", "Valor total do financiamento:", this.calcularTotalPagamento());
        System.out.println("#------------------------------------------#");
    }

}
