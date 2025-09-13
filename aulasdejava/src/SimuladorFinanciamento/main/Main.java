package SimuladorFinanciamento.main;
import SimuladorFinanciamento.modelo.Financiamento;
import SimuladorFinanciamento.util.InterfaceUsuario;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        List<Financiamento> financiamentos = new ArrayList<>();

        for (int i = 1; i <= 4; i++){
            System.out.println("\n--- Dados do Financiamento " + i + " ---");
            double valorImovel = interfaceUsuario.pedirValorImovel();
            int prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
            double taxaJuros = interfaceUsuario.pedirTaxaDeJuros();

            Financiamento fin = new Financiamento(valorImovel, prazoFinanciamento, taxaJuros);
            financiamentos.add(fin);

            fin.mostrarDadosFinanciamento();
        }

        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        for(Financiamento f: financiamentos){
            totalImoveis += f.getValorImovel();
            totalFinanciamentos += f.calcularTotalPagamento();
        }

        System.out.println("\n\n#------------------------------------------#");
        System.out.println("|              RESULTADO FINAL             |");
        System.out.println("#------------------------------------------#");
        System.out.printf("| %-30s | R$ %,10.2f |\n", "Total de todos os imóveis:", totalImoveis);
        System.out.printf("| %-30s | R$ %,10.2f |\n", "Total de todos os financiamentos:", totalFinanciamentos);
        System.out.println("#------------------------------------------#");
    }
}

