package one.digitalinnovation.desafio.subsistema.cep;

public class CepAPI {
    private static CepAPI cep = new CepAPI();

    private CepAPI(){
        super();
    }
    public static CepAPI getCep(){
        return cep;
    }
    public String recuperarCidade(String cep){
        return "Belo Horizonte";
    }
    public String recuperarEstado (String cep){
        return "Minas Gerais";
    }
}
