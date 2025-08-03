package cursojavacomplementarcompleto;

import java.util.Locale;

public class class001_05 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Locale.setDefault(Locale.US);


        System.out.println("Meu curso de JAVA.");

        int a = 15;
        int bi = 25;
        int c = a + bi;

        System.out.printf("SOMA: %d \n", c);

        if(c == 40 && a == 15){
            System.out.println("VOCÊ ESTA CERTO!");
        } else {
            System.out.println("VOCÊ NÃO ESTÁ CERTO!");
        }

        System.out.print("AQUI NÃO PULA A LINHA! >>> "); // PRINT SOMENTE NÃO QUEBRA A LINHA!
        System.out.println("Programa sendo finalizado com sucesso");

        System.out.println("*************************");

        double y = 35.758;
        double w = 389.789;

        System.out.printf("SOMA de Y com W: %f\n", y + w);
        System.out.printf("SOMA com 2 casas decimais: %.2f\n", y + w);
        System.out.printf("SOMA com 4 casas decimais: %.4f\n", y + w);

        System.out.println("*************************");

        String nomeCliente = "Maria";
        int idadeCliente = 31;
        double rendaClilente = 4500.75;
        String cidadeCliente = "Amazonas";

        System.out.printf("[ %s ] tem [ %d ] anos, ela é do [ %s ], tem um ótimo cargo na empresa e atuamente ganha [ R$%.2f ] reais brasileiros.\n\n", nomeCliente, idadeCliente, cidadeCliente, rendaClilente);
        System.out.println("*************************");

        // PARA ESTE EXERCÍCIO, VOICÊ DEVE INICAR AS SEGUINTES VARIÁVEIS:
        // PRODUCT1, PRODUCT2, AGE, CODE, GENDER, PRICE1, PRICE2, MEASURE.
        // EM SEGUIDA, USE OS VALORES PARA MOSTRAR O RESULTADO NA TELA, USANDO CONCATENAÇÃO.

        String product1 = "Computer";
        String product2 = "Office Desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 21100.75;
        double price2 = 650.50;
        double measure = 53.234567000;

        System.out.println("[ PRODUCTS: ]");
        System.out.printf("%s, which price is $ %.2f\n", product1, price1);
        System.out.printf("%s, which price is $ %.2f\n", product2, price2);
        System.out.println(" ");

        System.out.printf("Record: %d years old, code %d and gender: %c\n\n", age, code, gender);

        System.out.printf("Measue with eight decimal places: %f\n", measure);
        System.out.printf("Rouded (three decimal places): %.3f\n", measure);
        System.out.printf("US decimal point: %.3f\n", measure);

        System.out.println(" ");

        int aX, yX;
        double wX, PI;

        aX = 5;
        yX = 2 * aX;
        PI = 3.14159;
        wX = 2 * 35.535 + PI;

        System.out.printf("aX vale: %d\n", aX);
        System.out.printf("yX vale: %d\n", yX);
        System.out.printf("wX vale: %.2f\n", wX);

        System.out.println("  ");

        // DADO OS DADOS DO TRAPEZIO, CALCULE SUA ÁREA:
        // H = 5 | BaseMaior(B) = 8 | baseMenor(b) = 6;

        double B, b, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;

        System.out.printf("A área do Trapézio é: %.2f\n", area);

        // APLIQUE O CASTING NA DIVISÃO ENTRE OS NUMEROS INT 5 / 2;

        double castingResultado;
        int castingA = 5;
        int castingB = 2;

        castingResultado = (double) castingA / castingB;

        System.out.printf("Casting Result: %f\n", castingResultado);

        System.out.println("  ");
        System.out.println("  ");

        double aConvercao;
        int bRecebeA;

        aConvercao = 5.35;
        bRecebeA = (int) aConvercao;

        System.out.printf("O valor recebido em CASTING em b é: %d", bRecebeA);





    }

}
