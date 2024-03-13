package AulasReforcoJava;
import java.util.Scanner;
import java.util.ArrayList;


/*
* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
* Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
* essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
* */

public class Aula0011_Exercicio02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> dentroValoresEstipulados = new ArrayList<>();
        ArrayList<Integer> foraValores = new ArrayList<>();

        System.out.println("Digite um Valor para começar: ");
        int value = sc.nextInt();
        System.out.println("Digite um valor inicial para Buscar: ");
        int valueInicial = sc.nextInt();
        System.out.println("Digite um valor final para buscar: ");
        int valueFinal = sc.nextInt();

        //--

        for(int i = 0; i <= value; i++){
            if (i >= valueInicial && i <= valueFinal){
                dentroValoresEstipulados.add(i);
            } else {
                foraValores.add(i);
            }
        }

        //--

        System.out.println("Os valores estipulados para busca são: ");
        System.out.println(dentroValoresEstipulados);
        System.out.println("---------");
        System.out.println("Os valores fora dos estipulados inicial " + valueInicial + " e final " + valueFinal + " são: ");
        System.out.println(foraValores);


        sc.close();



    }   //-- end main

} //-- end class
