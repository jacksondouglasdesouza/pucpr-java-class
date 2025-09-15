package cursojavacomplementarcompleto.aulas.aulasBasicas;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TiposReferencia {
    public static void main(String[] args) {

        int p; // Vai da erro de compilação pois não foi inicializada
        // System.out.println(p);

        // Garbege Collector
        // String s = null; // Declarando uma variável do tipo String e inicializando com null
        // System.out.println(s);

        ArrayList<String> carros = new ArrayList<String>();

        carros.add("Carro - 001");
        carros.add("Carro - 002");
        carros.add("Carro - 003");
        carros.add("Carro - 004");
        carros.add("Carro - 005");
        System.out.println(carros.size());

        carros.add("Carro - 006");
        carros.add("Carro - 007");
        carros.add("Carro - 008");

        System.out.println(carros.size());

        for(String carro: carros){
            System.out.println(carro);
        }
    }
}
