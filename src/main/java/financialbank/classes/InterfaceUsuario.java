package com.financialbank.classes;
import java.util.Scanner;

public class InterfaceUsuario {

    Scanner sc = new Scanner(System.in);

    public double entradaValorImovel(){
        System.out.println("Digite o Valor do Imóvel: ");
        return sc.nextDouble();
    }

    public double entradaTaxaJuros(){
        System.out.println("Digite a Taxa de Juros Aplicada: ");
        return sc.nextDouble();
    }

    public int entradaPrazoFinanciamento(){
        System.out.println("Digite o Prazo para Pagamento do Financiamento: ");
        return sc.nextInt();
    }


}
