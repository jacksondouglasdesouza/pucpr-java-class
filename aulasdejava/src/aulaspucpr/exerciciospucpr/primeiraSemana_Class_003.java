package aulaspucpr.exerciciospucpr;

public class primeiraSemana_Class_003 {

    public static void main(String[] args) {

        // 3. Crie um algoritmo em Java que mostre na tela todos os múltiplos de 3 entre os números 0 e 30 usando a estrutura “do while”.

        int numero = 0;
        int indiceMultiplos = 0;

        while (numero <= 30){
            if (numero % 3 == 0){
                indiceMultiplos += 1;
                System.out.println(indiceMultiplos + "º Número Múltiplo de 3: " + numero);
            }
            //--
            numero++;
        }

    }

}
