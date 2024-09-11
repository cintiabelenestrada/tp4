package ar.edu.unju.fi.poo.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase Reserva
 * 
 * @author Estrada Cintia Belén
 * @version 1.0
 */

public class Reserva {
    private String codigoReserva;
    private Ciudad origen;
    private Ciudad destino;
    private Date fechaSalida;
    private Date fechaRegreso;
    private String clase;
    private EstadoReserva estado;
    private Pasajero pasajeroPrincipal;
    private Pasajero acompanante;
    private static List<Reserva> reservas = new ArrayList<>();

    // Constructor
    public Reserva(String codigoReserva, Ciudad origen, Ciudad destino, Date fechaSalida, Date fechaRegreso,
                   String clase, EstadoReserva estado, Pasajero pasajeroPrincipal, Pasajero acompanante) {
        this.codigoReserva = codigoReserva;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaRegreso = fechaRegreso;
        this.clase = clase;
        this.estado = estado;
        this.pasajeroPrincipal = pasajeroPrincipal;
        this.acompanante = acompanante;
        reservas.add(this);
    }

    // Métodos para registrar reservas y cancelar
    public static Reserva registrarReserva(String codigoReserva, Ciudad origen, Ciudad destino, Date fechaSalida, Date fechaRegreso,
                                           String clase, EstadoReserva estado, Pasajero pasajeroPrincipal, Pasajero acompanante) {
        return new Reserva(codigoReserva, origen, destino, fechaSalida, fechaRegreso, clase, estado, pasajeroPrincipal, acompanante);
    }

    public void cancelarReserva() {
        this.estado = EstadoReserva.CANCELADA;
    }

    public static List<Reserva> obtenerReservasPorClase(String clase) {
        List<Reserva> resultado = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.clase.equals(clase)) {
                resultado.add(reserva);
            }
        }
        return resultado;
    }

    // Getters y setters
    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
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

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public EstadoReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoReserva estado) {
        this.estado = estado;
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

    public static List<Reserva> getReservas() {
        return reservas;
    }

    public static void setReservas(List<Reserva> reservas) {
        Reserva.reservas = reservas;
    }

}