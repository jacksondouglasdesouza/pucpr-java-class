package cursojavacomplementarcompleto.aulas.conversaomoedascomoop.entities;

public class ConvensorDeMoedas {

    public static double totalPagarSemImposto(double quantidade, double valorDollar) {
        return quantidade * valorDollar;
    }

    public static double totalPagarComImposto(double quantidade, double valorDollar) {
        double totalSemImposto = totalPagarSemImposto(quantidade, valorDollar);
        return totalSemImposto * 1.06;
    }

}
