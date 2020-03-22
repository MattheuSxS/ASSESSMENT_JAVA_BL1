package dominio;

public class NumberZeroException extends Exception{

    public NumberZeroException(){
        super("A variáveis X e Y contém zeros!!");
    }

    public NumberZeroException(String message){
        super(message);
    }

}
