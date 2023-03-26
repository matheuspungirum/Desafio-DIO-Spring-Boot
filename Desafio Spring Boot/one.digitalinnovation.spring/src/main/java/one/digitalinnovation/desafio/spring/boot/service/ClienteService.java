package one.digitalinnovation.desafio.spring.boot.service;

import one.digitalinnovation.desafio.spring.boot.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 *
 * Todo comentário foi retirado da vídeo aula do Desafio SpringBoot DIO
 * 
 * @author Matheus Pungirum
 */
public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
