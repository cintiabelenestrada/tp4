package ar.edu.unju.fi.poo.dominio;

import java.util.Date;

/**
 * Clase Reserva
 * 
 * @author Estrada Cintia Belén
 * @version 1.0
 */
public class Reserva {
    private String codigoReserva;
    private String clase;
    private String estado;
    private Vuelo vuelo;
    private Pasajero pasajeroPrincipal;
    private Pasajero acompanante;

    // Constructor
    public Reserva(String codigoReserva, String clase, String estado, Vuelo vuelo, Pasajero pasajeroPrincipal,
            Pasajero acompanante) {
        this.codigoReserva = codigoReserva;
        this.clase = clase;
        this.estado = estado;
        this.vuelo = vuelo;
        this.pasajeroPrincipal = pasajeroPrincipal;
        this.acompanante = acompanante;
    }

    public Reserva(String generarCodigoReserva, String origen, String destino, Date fechaSalida, Date fechaRegreso,
            String clase2, Pasajero pasajero, Pasajero acompanante2) {
    }

    // Getters and Setters
    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pasajero getPasajeroPrincipal() {
        return pasajeroPrincipal;
    }

    public void setPasajeroPrincipal(Pasajero pasajeroPrincipal) {
        this.pasajeroPrincipal = pasajeroPrincipal;
    }

    public Pasajero getAcompanante() {
        return acompanante;
    }

    public void setAcompanante(Pasajero acompanante) {
        this.acompanante = acompanante;
    }

}
