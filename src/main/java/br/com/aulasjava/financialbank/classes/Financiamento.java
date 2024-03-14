package com.financialbank.classes;

public class Financiamento {

    //*****     ATRIBUTOS DA CLASSE FINANCIAMENTO     ***** //

    double valorImovel;
    double taxaJuros;
    int prazoFinanciamento;


    //*****     END ATRIBUTOS DA CLASSE FINANCIAMENTO     ***** //




    //*****     MÉTODOS DA CLASSE FINANCIAMENTO     ***** //

    public double CalcularPagamentoMensal(){
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJuros / 12));
    }

    public double CalcularTotalPagamento(){
        return this.CalcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }


    //-- CONSTRUTOR DE FINANCIAMENTO
    public Financiamento(double valorImovel, double taxaJuros, int prazoFinanciamento){
        this.valorImovel = valorImovel;
        this.taxaJuros = taxaJuros;
        this.prazoFinanciamento = prazoFinanciamento;
    } //-- END CONSTRUTOR


    //***** END MÉTODOS DA CLASSE FINANCIAMENTO ***** //


}
