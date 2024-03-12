package logica;

import jakarta.persistence.*;
import java.io.Serializable;


@Entity(name = "Usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Column(name="dni", nullable=false, length=70)
    private String dni;

    @Column(name="nombre", nullable=false, length=150)
    private String nombre;
    
    @Column(name="apellido", nullable=false, length=150)
    private String apellido;

    @Column(name="telefono", nullable=false, length=45)
    private String telefono;

    public Usuario() {
    
    }

    public Usuario(String dni, String nombre, String apellido, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + '}';
    }

   
    
    
    
    
}
