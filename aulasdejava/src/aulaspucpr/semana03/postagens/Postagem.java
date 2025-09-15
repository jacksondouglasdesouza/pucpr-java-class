package aulaspucpr.semana03.postagens;

public class Postagem{
    // Atributos
    private int curtidas;

    // Construtor
    public Postagem() {
        this.curtidas = 0;
    }

    // Getters e Setters
    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        if( !this.validarNumeroCurtidas(curtidas)){
            this.curtidas = 0;
        } else {
            this.curtidas = curtidas;
        }
    }

    // Métodos
    public void mostrarCurtidas(){
        System.out.println("Curtidas: " + curtidas);
    }

    public void adicionarCurtida(){
        curtidas += 1;
    }

    boolean validarNumeroCurtidas(int curtidas){
        if(curtidas < 0){
            System.out.println("Número de curtidas inválido! Não pode ser negativo.");
            return false;
        }
        return true;
    }

    @Override
    public  String toString(){
        return "Postagem com " + this.curtidas + " curtidas.";
    }

}//
