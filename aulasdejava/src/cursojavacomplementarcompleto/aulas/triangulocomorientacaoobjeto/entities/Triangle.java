package cursojavacomplementarcompleto.aulas.triangulocomorientacaoobjeto.entities;

public class Triangle {

    // ATRIBUTOS //
    public double a;
    public double b;
    public double c;

    // CONSTRUTOR //
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // MÉTODOS //

    public double calcularArea(){
        double semiPerimetro = (a + b + c) / 2.0;
        double formulaDeHeron = Math.sqrt(semiPerimetro * (semiPerimetro - a) * (semiPerimetro - b) * (semiPerimetro - c));
        return formulaDeHeron;

    }

}
