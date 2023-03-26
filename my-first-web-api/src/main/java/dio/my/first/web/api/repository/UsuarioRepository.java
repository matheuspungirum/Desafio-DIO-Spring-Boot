package dio.my.first.web.api.repository;

import dio.my.first.web.api.handler.BusinessException;
import dio.my.first.web.api.handler.CampoObrigatorioException;
import dio.my.first.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import javax.naming.CannotProceedException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        if (usuario.getLogin()==null)
            throw new CampoObrigatorioException("login");

        if (usuario.getPassword()==null)
            throw new BusinessException("password");

        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("matheus","password"));
        usuarios.add(new Usuario("igor","masterpass"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("matheus","password");
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o usernamae: %s para localizar um usuário", username));
        return new Usuario("matheus","password");
    }
}

