package aulaspucpr.semana03.usuarios;
import aulaspucpr.semana03.postagens.Postagem;
import java.util.ArrayList;
import java.util.List;

public class  Usuario{
    // Atributos
    private String nome;
    private List<Postagem> listaPostagens;

    // Construtor

    public Usuario() {

    }
    public Usuario(String nome) {
        this.nome = nome;
        this.listaPostagens = new ArrayList<Postagem>();
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public List<Postagem> getListaPostagens() {
        return listaPostagens;
    }

    public void setListaPostagens(List<Postagem> listaPostagens) {
        this.listaPostagens = listaPostagens;
    }

    // Métodos
    public void criaPostagem(){
       listaPostagens.add(new Postagem());
    }

    public void curtirPostagem(Postagem postagemAleatoria){
        System.out.println("Usuario curtio a postagem!");
        postagemAleatoria.adicionarCurtida();
        postagemAleatoria.mostrarCurtidas();
    }

    public void mostrarPostagem(){
        if(listaPostagens.isEmpty()){
            System.out.println("Nenhuma postagem criada!");
            return;
        }
        for(Postagem postagem: listaPostagens){
            System.out.println(postagem);
        }
    }

}//
