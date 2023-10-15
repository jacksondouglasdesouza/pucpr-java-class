package Aula001;


import java.util.Scanner;

public class Aula001 {
    // Methodo Multiplicar
    public static int multiplicar(int a, int b){
        int x;
        x = a * b;
        return x;
    }

    //Main
    public static void main(String[] args) {


        int x = 5;
        int y = 5;

        System.out.println("Calculadora");
        int z = multiplicar(x, y);
        System.out.println("Z = " + z);

        int i = multiplicar(10, 3);

        System.out.println("i = " + i);
        System.out.println("Nova Multiplicação: 22 * 2 = " + multiplicar(22, 2));



        // ---


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println("O número digitado é positivo");
        } else if (numero < 0) {
            System.out.println("O número digitado é negativo");
        } else {
            System.out.println("O número é zero");
        }



        // ---

        System.out.println("linha1\tcoluna1\nlinha2\tcoluna2");

        // ---

        //SOME O QUE SE PEDE:


        int x1 = 3 + 4 - 8 / 4 * 3 - 5;
            x = 3 + 4 - 2 * 3 - 5;
            x = 3 + 4 - 6 - 5;
            x = 7 - 6 - 5;
            x = 1 - 5;
            x = -4;
        //--
        System.out.println(x1);

        int y1 = 3 + (4 - 8) / 4 * (3 - 5);
            y = 3 + (-4) / 4 * (-2);
            y = 3 + (-1) * (-2);
            y = 3 + 2;
            y = 5;
        //--

        System.out.println(y1);

        // ENCONTRE O BOOLEANO CORRETO

        boolean p = (8 > 4) && !((7 >= 10) || (5 != 2));

                p = true && !(false || true);
                p = true && !(true);
                p = true && false;
                p = false;
        //--


        System.out.println(p);

        //--

        boolean g = (8 > 4) && !(7 >= 10) || (5 != 2);
                g = true && !false || true;
                g = true && true || true;
                g = true && true;
                g = true;

        System.out.println(g);



        //---

        //Variáveis com os diferentes tipos de dados



        String nome = "Jackson Douglas";
        int idade = 37;
        double altura = 1.92;

        System.out.println("EXEMPLO 001:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Nome: " + nome + ", Altura:  " + altura + " m");

        //---


        System.out.println("-------------------------------");
        System.out.println("APPEND");
        System.out.println("-------------------------------\n");

        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Nome: ").append(nome).append("\n");
        mensagem.append("Idade: ").append(idade).append("\n");
        mensagem.append("Altura: ").append(altura).append("\n");
        mensagem.append("Nome: ").append(nome).append(", Altura: ").append(altura).append(" m\n");

        System.out.println(mensagem);

        //--

        System.out.println("-------------------------------\n");

        //PRINT SEM O LN - OUTRAS FORMATAÇÕES PARA TRABALHAR COM CONCATENAÇÃO DE STRING COM VARIÁVEIS
        // System.out.print("-------------")

        System.out.print("EXEMPLO 002:" + "\n");
        System.out.print("Nome: " + nome + "\n");
        System.out.print("Idade: " + idade + "\n");
        System.out.print("Altura: " + altura + "\n");
        System.out.print("Nome: " + nome + ", Altura:  " + altura + " m\n");

        // --

        // System.out.printf("-------------")

        System.out.println("-------------------------------\n");

        System.out.printf("EXEMPLO 003:\n");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Idade:   %d\n", idade);
        System.out.printf("Altura: %.2f\n", altura);
        System.out.printf("Nome: %s, Altura:  %.2f\n", nome, altura, " m");

        //--

        // System.out.format"-------------")

        System.out.println("-------------------------------\n");

        System.out.format("EXEMPLO 004\n");
        System.out.format("Nome: %s\n", nome);
        System.out.format("Idade:   %d\n", idade);
        System.out.format("Altura: %.2f\n", altura);
        System.out.format("Nome: %s, Altura:  %.2f\n", nome, altura, " m");

        System.out.println("-------------------------------\n");


        //--

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome02 = entradaDados.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade02 = entradaDados.nextInt();
        System.out.println("Digite a sua altura: ");
        float altura02 = entradaDados.nextFloat();

        System.out.println("Seu nome: " + nome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Sua altura: " + altura);


        //--


    }// End class Main

}// End class calc
