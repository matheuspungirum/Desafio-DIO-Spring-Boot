package one.digitalinnovation.desafio.facade;

import one.digitalinnovation.desafio.subsistema.cep.CepAPI;
import one.digitalinnovation.desafio.subsistema.crm.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepAPI.getCep().recuperarCidade(cep);
        String estado = CepAPI.getCep().recuperarEstado(cep);
        
        CrmService.gravarCliente(nome, cep, cidade, estado);


    }
}
