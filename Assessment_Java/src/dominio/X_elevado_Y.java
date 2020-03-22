package dominio;

public class X_elevado_Y {

    private int x;
    private int y;
    private double result;


    public X_elevado_Y(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void CalculoElevado(){

        try {

            result = Math.pow(this.x, this.y);

            if (this.x == 0 & this.y == 0 ) {
                throw new NumberZeroException();

            } else {
                System.out.print(x+" elevado a "+y+" é igual a "+result);
            }


        } catch (NumberZeroException e){

            System.out.print(e.getMessage());
        }

    }
}
