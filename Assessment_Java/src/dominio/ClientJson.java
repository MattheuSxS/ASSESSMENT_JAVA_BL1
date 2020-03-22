package dominio;

public class ClientJson {

    private String primeiroNome;
    private String ultimoNome;
    private String cpf;
    private String email;

    public ClientJson(String oneName, String twoName, String cpf, String email){
        this.primeiroNome = oneName;
        this.ultimoNome = twoName;
        this.cpf = cpf;
        this.email = email;
    }

    public ClientJson(){

    }


    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
