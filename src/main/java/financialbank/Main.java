package com.financialbank;
import com.financialbank.classes.Financiamento;
import com.financialbank.classes.InterfaceUsuario;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //-- ENTRADA DE DADOS USUÁRIO --//

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        double ValorImovel = interfaceUsuario.entradaValorImovel();
        double TaxaJuros = interfaceUsuario.entradaTaxaJuros();
        int PrazoFinanciamento = interfaceUsuario.entradaPrazoFinanciamento();

        //-- FINANCIAMENTO --//

        Financiamento Id00001032024 = new Financiamento(ValorImovel, TaxaJuros, PrazoFinanciamento);

        System.out.println("O valor do Financiamento é de: " + Id00001032024);


    }


}