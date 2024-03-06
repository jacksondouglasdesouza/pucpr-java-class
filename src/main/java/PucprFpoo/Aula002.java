package PucprFpoo;

public class Aula002 {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 50};

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Laço for com valor: " + numeros[i]);
        }
        System.out.println("\n");

        //--

        for(int numero : numeros){
            System.out.println("Valores da lista: " + numero);
        }

        System.out.println("\n");

        //--

        String[] estudantes = new String[] {
                "Douglas", "Maria", "José"
        };

        for(int j = 0; j < estudantes.length; j++){
            System.out.println("Estudante: " + estudantes[j]);
        }

        System.out.println("\n");

        //--

        for(String listaEstudante: estudantes){
            System.out.println("Nome estudante: " + listaEstudante);
        }

        System.out.println("\n");

        // CRIANDO UMA MATRIZ

        int[][] matriz = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        //--

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.println("Elemento: " + matriz[i][j]);
            }
        }

        //--





    }
    //--
}
