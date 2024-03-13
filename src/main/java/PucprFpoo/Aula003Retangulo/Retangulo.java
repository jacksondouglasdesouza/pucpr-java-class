package PucprFpoo.Aula003Retangulo;

public class Retangulo {

    // ATRIBUTOS -----

    double altura;
    double comprimento;
    String cor;
    String tipo;

    //-- End Atributos



    // MÉTODOS -----

    double perimetro;
    double area;

    //-- CONSTRUTOR
    Retangulo(double alturaInicial, double comprimentoInicial){
        this.altura = alturaInicial;
        this.comprimento = comprimentoInicial;
    }

    //--  End Construtor


    double calcularPerimetro(){
        perimetro = (2 * altura) + (2 * comprimento);
        return perimetro;
    }
    //--
    double calcularArea(){
        area = altura * comprimento;
        return area;
    }

    //-- End Métodos



    public static void main(String[] args) {

        Retangulo retangulo_01 = new Retangulo(5.2, 12.5);

        // --- Descartada Após Criação do Construtor -> retangulo_01.altura = 5.2;
        // --- Descartada Após Criação do Construtor -> retangulo_01.comprimento = 12.5;
        retangulo_01.cor = "Amarelo";

        System.out.println("O cálculo do Perímetro Retângulo Amarelo é: " + retangulo_01.calcularPerimetro());
        System.out.println("O cálculo da Área Retângulo Amarelo é: " + retangulo_01.calcularArea());
        System.out.println(" ");

        //--

        Retangulo retangulo_02 = new Retangulo(6.0, 12.5);

        // --- Descartada Após Criação do Construtor -> retangulo_02.altura = 6.0;
        // --- Descartada Após Criação do Construtor -> retangulo_02.comprimento = 12.5;
        retangulo_02.cor = "Azul";

        System.out.println("O cálculo do Perímetro do Retângulo Azul é: " + retangulo_02.calcularPerimetro());
        System.out.println("O cálculo da Área  do Retângulo Azul é: " + retangulo_02.calcularArea());
        System.out.println(" ");

        //--

        Retangulo retangulo_03 = new Retangulo(8.2, 13.85);
        retangulo_03.cor = "Lilás";

        System.out.println("O cálculo do Perímetro do Retângulo Lilás é: " + retangulo_03.calcularPerimetro());
        System.out.println("O cálculo da Área  do Retângulo Lilás é: " + retangulo_03.calcularArea());
        System.out.println(" ");

        //--

        Retangulo retangulo_04 = new Retangulo(8.5, 6.83);

        retangulo_04.cor = "Branco";

        System.out.println("O cálculo do Perímetro do Retângulo Branco é: " + retangulo_04.calcularPerimetro());
        System.out.println("O cálculo da Área  do Retângulo Branco é: " + retangulo_04.calcularArea());
        System.out.println(" ");


    } //-- End Main


} //-- End Classe

