package ar.edu.unju.fi.poo.manager;

import ar.edu.unju.fi.poo.dominio.Reserva;
import ar.edu.unju.fi.poo.dominio.EstadoReserva;
import java.util.ArrayList;
import java.util.List;

public class ReservaManager {

    private List<Reserva> reservas;

    public ReservaManager() {
        reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void eliminarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    public Reserva buscarReserva(String codigoReserva) {
        for (Reserva reserva : reservas) {
            if (reserva.getCodigoReserva().equals(codigoReserva)) {
                return reserva;
            }
        }
        return null;
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }

    public void cancelarReserva(String codigoReserva) {
        Reserva reserva = buscarReserva(codigoReserva);
        if (reserva != null) {
            reserva.setEstado(EstadoReserva.CANCELADA);
        }
    }

    public List<Reserva> obtenerReservasPorClase(String clase) {
        List<Reserva> reservasPorClase = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.getClase().equals(clase)) {
                reservasPorClase.add(reserva);
            }
        }
        return reservasPorClase;
    }
}
