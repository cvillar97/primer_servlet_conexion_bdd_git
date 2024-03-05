package persistence;

import java.util.List;
import logica.Usuario;


public class ControladorPersistencia {

    public ControladorPersistencia() {
    
    }
    
    UsuarioJpaController uJpa = new UsuarioJpaController();
    
    // CREATE
    public void createUser(Usuario user) {
        uJpa.create(user);
    }
    
    // READ
    public List<Usuario> getUsers() {
        return  uJpa.findUsuarioEntities();
    }

}
