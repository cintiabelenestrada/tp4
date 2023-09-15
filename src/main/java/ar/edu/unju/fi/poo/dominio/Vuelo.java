package ar.edu.unju.fi.poo.dominio;

import java.util.Date;

/**
 * Clase Vuelo
 * 
 * @author Estrada Cintia Belén
 * @version 1.0
 */
public class Vuelo {
    private String numeroVuelo;
    private String origen;
    private String destino;
    private Date fechaSalida;
    private Date fechaRegreso;

    // Constructor
    public Vuelo(String numeroVuelo, String origen, String destino, Date fechaSalida, Date fechaRegreso) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
    }

    // Getters and Setters
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(Date fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

}