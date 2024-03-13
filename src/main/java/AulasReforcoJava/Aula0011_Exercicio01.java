package AulasReforcoJava;
import java.util.Scanner;
import java.util.ArrayList;


/*
*
* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
* X, se for o caso.
* **/



public class Aula0011_Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um Valor: ");
        int value = sc.nextInt();

        ArrayList<Integer> listaPar = new ArrayList<>();
        ArrayList<Integer> listaImpar = new ArrayList<>();

        //--

        for(int i = 0; i <= value; i++){
            if (i % 2 == 0){
                listaPar.add(i);
            } else {
                listaImpar.add(i);
            }
        }

        System.out.println("Esses foram os valores Impares dentro do valor " + value + " digitado!");
        System.out.println(listaImpar);

        sc.close();


    } //-- end main


} //-- end class
