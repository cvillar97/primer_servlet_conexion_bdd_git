package persistence;

import java.util.List;
import logica.Usuario;
import persistence.exceptions.NonexistentEntityException;


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

    // DELETE
    public void deleteUser(int id) {
        try {
            uJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            throw new RuntimeException(e);
        }
    }

}
