package cursojavacomplementarcompleto.aulas;
import java.util.Locale;

public class expressoesComparativas {

    public static void main(String[] args) {

        // OPERADOES CE COMPARAÇÃO

        Locale.setDefault(Locale.US);

        // OPERADOR -- SIGNIFICADO //
        //    >     --  Maior que //
        //    <     --  Menor que //
        //    >=     --  Maior ou Igual que //
        //    <=     --  Menor ou Igual que //
        //    ==     --  Igual á //
        //    !=     --   Fiferente de//

        //--

        System.out.printf("Exemplos: \n");

        int x = 5;

        boolean result =  x > 0;
        boolean result2 =  x == 3;
        boolean result3 = 10 <= x + 30;
        boolean result4 = 10 <= x - 30;
        boolean result5 = x != 2;
        boolean result6 = x != 5;


        System.out.printf("VALOR DE X: %d\n", x);
        System.out.printf("Resultado X > 0? %b\n", result);
        System.out.printf("Resulttado X = 3? %b\n",  result2);
        System.out.printf("Resultado 10 <= x + 30 ? %b\n",  result3 );
        System.out.printf("Resultado 10 <= x - 30? %b\n", result4 );
        System.out.printf("Resultado X é diferente de 2? %b\n", result5 );
        System.out.printf("Resultado X é diferente de 5: %b\n", result6);

    }
}
