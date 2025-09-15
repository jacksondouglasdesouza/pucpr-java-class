package aulaspucpr.semana03;
import aulaspucpr.semana03.postagens.Postagem;
import aulaspucpr.semana03.usuarios.Usuario;
import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Usuario primeiroUsuario = new Usuario("João");
        primeiroUsuario.criaPostagem();
        System.out.println("Postagens de " + primeiroUsuario.getNome() + ":");
        primeiroUsuario.mostrarPostagem();

        System.out.println("\n-----------------------------------\n");

        System.out.println("Deseja curti a primeira postagem do João? (s/n)");
        String resposta = scan.next();

        if(resposta.equalsIgnoreCase("s")){
            if (!primeiroUsuario.getListaPostagens().isEmpty()) {
                Postagem postParaCurtir = primeiroUsuario.getListaPostagens().getFirst();
                primeiroUsuario.curtirPostagem(postParaCurtir);
            } else {
                System.out.println("Não há postagens para curtir!");
            }
        }

        System.out.println("\nObrigado por usar o sistema!");
        scan.close();

    }
}
