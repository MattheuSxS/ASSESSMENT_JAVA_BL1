package dominio;

public class Fatorial {

    private int resp = 1;

    public Fatorial(int number){
    }

    public Fatorial(){

    }

    public int Calculo(int number){
        int count;
        for (count = number; count > 1; count -= 1) {
            System.out.println("iteracao " + count);
            System.out.println("------------------");
            resp = resp * count;
            System.out.println("Multiplicador  = " + resp);
        }
        return resp;
    }

}
