package cursojavacomplementarcompleto.aulas.aulasBasicas;
import java.util.Locale;
import java.util.Scanner;

public class operadoresBitwise {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        long bin01 = 89;
        long bin02 = 60;
        int idMaskProtocol = 0b100000;

        System.out.print(" --> " + (bin01 & bin02) + "\n");
        System.out.print(" --> " + (bin01 | bin02) + "\n");
        System.out.print(" --> " + (bin01 ^ bin02) + "\n");

        System.out.println("Insira o endereço de sua máscara: ");
        String valueMascaraBinaria = scan.nextLine();

        int value = Integer.parseInt(valueMascaraBinaria, 2);

        String binarioMascaraBinaria = "0b" + Integer.toBinaryString(value);

        if ((value & idMaskProtocol) != 0){
            System.out.println(Integer.toBinaryString(value) + " & " + Integer.toBinaryString(idMaskProtocol) + "?");
            System.out.println("6th bit is true!");
        } else{
            System.out.println(Integer.toBinaryString(value) + " & " + Integer.toBinaryString(idMaskProtocol) + "?");
            System.out.println("6th bit is false!");
        } //

        scan.close();

    }
}
