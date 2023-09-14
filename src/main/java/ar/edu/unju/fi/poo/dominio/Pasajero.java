package ar.edu.unju.fi.poo.dominio;

/**
 * Clase Pasajero: Clase padre de cual se usara para crear la clase
 * Reserva
 * 
 * @author Estrada Cintia Belén
 * @version 1.0
 */
public class Pasajero {
    private Integer dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;

    // Constructor
    public Pasajero(Integer dni, String nombre, String apellido, String telefono, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Getters y Setters
    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
