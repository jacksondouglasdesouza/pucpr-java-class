package AulasReforcoJava;

import java.util.Locale;

public class Aula0001 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("_____");
        System.out.println("Expressões Aritiméticas: ");

        int soma =  2 + 2 + 3;
        int subtracao = 50 - 3 - 4;
        float multiplicacao = 357 * 36;
        float divisao = 600 / 23;
        int modulo =  14 % 3;
        double quebrado = 1.0 / 3.0;
        double x =  10.35784;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.printf("%.9f \n", quebrado);



        System.out.println("Ordem de Procedência Matemática");

        float ordem_01 = 2 * 6 / 3;
        float ordem_02 = 3 + 2 * 4;
        float ordem_03 = (3 + 2) * 4;
        float ordem_04 = 60 / (3 + 2) * 4;
        float ordem_05 = 60 / ((3 + 2) * 4);

        System.out.println(ordem_01);
        System.out.println(ordem_02);
        System.out.println(ordem_03);
        System.out.println(ordem_04);
        System.out.println(ordem_05);

        System.out.println("O print ln Faz uma quebra de linha");
        System.out.println("Olha - print ln");
        System.out.println("***********************************");
        System.out.print("O Print sem ln, não quebra a alinha!");
        System.out.print("  <--------------- OLHA como não quebrou a linha!");

        //--

        int y = 32;

        System.out.println("\n" + y);

        System.out.printf("%.2f \n", x);
        System.out.printf("%.4f \n", x);

        //-- Impressã de Valores interpolados com o print"F"

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e tem uma renda de R$%.2f mensal ", nome, idade, renda);

        //--  EXERCÍCIO

        /*
        * Dados os valores formate as saidas com seus devidos valores
        *
        * */

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'f';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        //--
        System.out.println("\n---");
        System.out.println("************************************************************");
        System.out.println("Products:");
        System.out.printf("%s, which price is $%.2f", product1, price1);
        System.out.println("\n---");
        System.out.printf("%s, which price is $%.2f", product2, price2);
        System.out.println("\n---");
        //--

        System.out.printf("Record: %d years old, code %d and gender: %c", age, code, gender);
        System.out.println("\n---");
        //--

        System.out.printf("Measue with eight decimal places: %.8f", measure);
        //--
        System.out.println("\n---");
        System.out.printf("Rouded( three decimal places): %.3f", measure);
        System.out.println("\n---");






    }
}
