package cursojavacomplementarcompleto.aulas;
import java.util.Locale;
import java.util.Scanner;

public class funcoes {

    public static int comparaNumeroMaior(int x, int y, int z){
        int auxiliar;

        if(x > y && x > z){
            auxiliar = x;
        } else if(y > z){
            auxiliar = y;
        } else {
            auxiliar = z;
        }

        return auxiliar;

    } //


    public static void imprimeResultadoMaior(int value){
        System.out.println("O Maior valor é: " + value);
    }

    // -- END FUNÇÕES -- //


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int x, y, z;

        System.out.println("Digite Três números: ");
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();

        int armazenaMaiorNumero = comparaNumeroMaior(x, y, z);
        imprimeResultadoMaior(armazenaMaiorNumero);

        scan.close();

    }
}
