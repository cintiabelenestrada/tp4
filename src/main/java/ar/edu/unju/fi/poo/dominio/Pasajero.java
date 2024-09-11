package ar.edu.unju.fi.poo.dominio;

public class Pasajero {
    private String nombre;
    private String apellido;
    private String dni;
    private String correoElectronico;
    private String password;

    // Constructor para pasajero principal
    public Pasajero(String nombre, String apellido, String dni, String correoElectronico, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correoElectronico = correoElectronico;
        this.password = password;
        // setPassword(password);
    }

    // Constructor para acompañante
    public Pasajero(String nombre, String apellido, String dni, String correoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correoElectronico = correoElectronico;
    }

    // Getters y setters

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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        // if (isValidPassword(password)) {
        //     this.password = password;
        // } else {
        //     throw new IllegalArgumentException("Contraseña no válida");
        // }
    }

    private boolean isValidPassword(String password) {
        if (password.length() < 8 || password.length() > 12) return false;
        if (!password.matches(".*[A-Z].*")) return false;
        if (!password.matches(".*\\d.*\\d.*")) return false;
        if (password.matches(".*(\\d)\\1.*")) return false;
        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) return false;
        return true;
    }
}