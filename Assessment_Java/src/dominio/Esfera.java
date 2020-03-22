package dominio;

public class Esfera {

    private double raio;
    private final double PI = 3.14159;

    public Esfera(int raio){
        this.raio = raio;
    }

    public double Calculo_Volume(){
        System.out.print("Volume da esfera: ");
        return (4.0 / 3) * PI * raio * raio * raio;
    }

    public double Calculo_Area(){
        System.out.print("Área da esfera: ");
        return (4 * PI) * (raio * raio);
    }
}
