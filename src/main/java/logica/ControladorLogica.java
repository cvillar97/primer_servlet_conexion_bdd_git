
package logica;

import java.util.List;
import persistence.ControladorPersistencia;


public class ControladorLogica {

    public ControladorLogica() {
    
    }
    
    
    
    ControladorPersistencia cPersist = new ControladorPersistencia();
    
    // CREATE
    public void createUser (Usuario user) {
        cPersist.createUser(user);
    }
    
    // READ
    public List<Usuario> getUsers() {
        return cPersist.getUsers();
    }
    
}
