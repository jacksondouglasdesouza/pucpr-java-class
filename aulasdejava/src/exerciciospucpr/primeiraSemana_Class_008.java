package exerciciospucpr;
import java.util.Scanner;

public class primeiraSemana_Class_008 {

    public static void main(String[] args) {

        //8. Desenvolva um algoritmo em Java que peça ao usuário um número inteiro n e gere um padrão de asteriscos.
        // Por exemplo, se n for 5, o padrão seria assim:
        //*
        //**
        //***
        //****
        //*****

        Scanner scan = new Scanner(System.in);

        int numeroN;

        System.out.println("Digite um número inteiro: ");
        numeroN = scan.nextInt();
        scan.close();

        //--

        for(int i = 1; i <= numeroN; i++){

            for (int j = 1; j <= i; j++){
                System.out.print("*");
            } //

            System.out.println();
        } //


    }
}
