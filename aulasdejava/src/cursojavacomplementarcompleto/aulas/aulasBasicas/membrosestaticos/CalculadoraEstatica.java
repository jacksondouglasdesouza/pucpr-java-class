package cursojavacomplementarcompleto.aulas.aulasBasicas.membrosestaticos;

public class CalculadoraEstatica {

    public static final double PI = 3.141592653589793;

    public static double calcularCircuferencia(double raio){
        return PI * 2.0 * raio;
    }

    public static double calcularVolume(double raio){
        return 4.0 * PI * Math.pow(raio, 3) / 3.0;
    }

    public static String formatacaoResultado(double raio){

        double circuferencia = calcularCircuferencia(raio);
        double volume = calcularVolume(raio);

        return String.format(
                """
                        RESULTADO PARA O RAIO DE DIMENSSÕES: %.2f
                        Circunferência de: %.2f
                        Volume: %.2f
                        Valor de PI %.2f
                        """, raio, circuferencia, volume, PI
        );

    }

}
