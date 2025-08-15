package aulaspucpr.semana02.aulagravada;

public class Retangulo {

    double altura;
    double comprimento;

    // METODO CONSTRUTOR

    Retangulo(double altura, double comprimento) {
        this.altura = altura;
        this.comprimento = comprimento;
    }

    /*  ADICIONANDO VALORES PADRÕES NO CONSTRUTOR
        Retangulo(double altura) {
        this.altura = altura;
        this.comprimento = 10.00;
    }
     */

    double calcularPerimetro(){
        return (2 * altura) + (2 * comprimento);
    }

    double calcularArea(){
        return altura * comprimento;
    }

    // --

    public static void main(String[] args) {
        //--

        System.out.println("Bem vindo ao universo dos Retângulos!");

        /*

        Retangulo retanguloId001 = new Retangulo();

        retanguloId001.altura = 5.20;
        retanguloId001.comprimento = 12.50;
        System.out.println("Perímetro --> " + retanguloId001.calcularPerimetro());
        System.out.println("Área --> " + retanguloId001.calcularArea());

        System.out.println(" \n ");

        Retangulo retanguloId002 = new Retangulo();
        retanguloId002.comprimento = 5.20;
        System.out.println("Area --> " + retanguloId002.calcularArea());

        // Vai calcular o perímetro mesmo sem entrada de dados da altura em Rentângulo Id02.
        System.out.println("Perímetro --> " + retanguloId002.calcularPerimetro());

        */

        // INICIANDO NOVOS OBJETOS COM O METODO CONSTRUTOR //

        Retangulo retanguloId003 = new Retangulo(14.5, 13.85);
        Retangulo retanguloId004 = new Retangulo(24.89, 33.87);

        System.out.println("\n Área e Perímetro do Retângulo ID 03 \n ");
        System.out.println("Área ---> \n" + retanguloId003.calcularArea());
        System.out.println("Perímetro ---> \n" + retanguloId003.calcularPerimetro());

        System.out.println("\n Área e Perímetro do Retângulo ID 04 \n ");
        System.out.println("Área ---> \n" + retanguloId004.calcularArea());
        System.out.println("Perímetro ---> \n" + retanguloId004.calcularPerimetro());

    }

}
