package ar.edu.unju.fi.poo.manager;

import ar.edu.unju.fi.poo.dominio.Ciudad;
import ar.edu.unju.fi.poo.dominio.EstadoReserva;
import ar.edu.unju.fi.poo.dominio.Pasajero;
import ar.edu.unju.fi.poo.dominio.Reserva;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ReservaManagerTest {

    private ReservaManager reservaManager;

    @BeforeEach
    public void setUp() {
        reservaManager = new ReservaManager();
    }

    @Test
    public void testAgregarReservaSinAcompanante() {
        Pasajero pasajeroPrincipal = new Pasajero("Juan", "Perez", "12345678", "juan.perez@example.com", "Passw09rd!");
        Reserva reserva = new Reserva("123", Ciudad.JUJUY, Ciudad.CORDOBA, new Date(), new Date(), "Economy", EstadoReserva.RESERVADA, pasajeroPrincipal, null);
        reservaManager.agregarReserva(reserva);
        assertEquals(1, reservaManager.listarReservas().size());
        assertEquals(reserva, reservaManager.listarReservas().get(0));
    }

    @Test
    public void testAgregarReservaConAcompanante() {
        Pasajero pasajeroPrincipal = new Pasajero("Carlos", "Gomez", "87654321", "carlos.gomez@example.com", "Passw0rd!");
        Pasajero acompanante = new Pasajero("Ana", "Lopez", "87654322", "ana.lopez@example.com");
        Reserva reserva = new Reserva("456", Ciudad.BUENOS_AIRES, Ciudad.ROSARIO, new Date(), new Date(), "Business", EstadoReserva.RESERVADA, pasajeroPrincipal, acompanante);
        reservaManager.agregarReserva(reserva);
        assertEquals(1, reservaManager.listarReservas().size());
        assertEquals(reserva, reservaManager.listarReservas().get(0));
    }

    @Test
    public void testEliminarReserva() {
        Pasajero pasajeroPrincipal = new Pasajero("Juan", "Perez", "12345678", "juan.perez@example.com", "Passw0rd!");
        Reserva reserva = new Reserva("123", Ciudad.JUJUY, Ciudad.CORDOBA, new Date(), new Date(), "Economy", EstadoReserva.RESERVADA, pasajeroPrincipal, null);
        reservaManager.agregarReserva(reserva);
        reservaManager.eliminarReserva(reserva);
        assertEquals(0, reservaManager.listarReservas().size());
    }

    @Test
    public void testBuscarReserva() {
        Pasajero pasajeroPrincipal = new Pasajero("Juan", "Perez", "12345678", "juan.perez@example.com", "Passw0rd!");
        Reserva reserva = new Reserva("123", Ciudad.JUJUY, Ciudad.CORDOBA, new Date(), new Date(), "Economy", EstadoReserva.RESERVADA, pasajeroPrincipal, null);
        reservaManager.agregarReserva(reserva);
        Reserva foundReserva = reservaManager.buscarReserva("123");
        assertNotNull(foundReserva);
        assertEquals("123", foundReserva.getCodigoReserva());
    }

    @Test
    public void testListarReservas() {
        Pasajero pasajeroPrincipal1 = new Pasajero("Juan", "Perez", "12345678", "juan.perez@example.com", "Passw0rd!");
        Pasajero pasajeroPrincipal2 = new Pasajero("Carlos", "Gomez", "87654321", "carlos.gomez@example.com", "Passw0rd!");
        Pasajero acompanante2 = new Pasajero("Ana", "Lopez", "87654322", "ana.lopez@example.com");
        Reserva reserva1 = new Reserva("123", Ciudad.JUJUY, Ciudad.CORDOBA, new Date(), new Date(), "Economy", EstadoReserva.RESERVADA, pasajeroPrincipal1, null);
        Reserva reserva2 = new Reserva("456", Ciudad.BUENOS_AIRES, Ciudad.ROSARIO, new Date(), new Date(), "Business", EstadoReserva.RESERVADA, pasajeroPrincipal2, acompanante2);
        reservaManager.agregarReserva(reserva1);
        reservaManager.agregarReserva(reserva2);
        List<Reserva> reservas = reservaManager.listarReservas();
        assertEquals(2, reservas.size());
        assertTrue(reservas.contains(reserva1));
        assertTrue(reservas.contains(reserva2));
    }

    @Test
    public void testObtenerReservasPorClase() {
        Pasajero pasajeroPrincipal1 = new Pasajero("Juan", "Perez", "12345678", "juan.perez@example.com", "Passw0rd!");
        Pasajero pasajeroPrincipal2 = new Pasajero("Carlos", "Gomez", "87654321", "carlos.gomez@example.com", "Passw0rd!");
        Pasajero acompanante2 = new Pasajero("Ana", "Lopez", "87654322", "ana.lopez@example.com");
        Reserva reserva1 = new Reserva("123", Ciudad.JUJUY, Ciudad.CORDOBA, new Date(), new Date(), "Economy", EstadoReserva.RESERVADA, pasajeroPrincipal1, null);
        Reserva reserva2 = new Reserva("456", Ciudad.BUENOS_AIRES, Ciudad.ROSARIO, new Date(), new Date(), "Business", EstadoReserva.RESERVADA, pasajeroPrincipal2, acompanante2);
        reservaManager.agregarReserva(reserva1);
        reservaManager.agregarReserva(reserva2);
        List<Reserva> economyReservas = reservaManager.obtenerReservasPorClase("Economy");
        assertEquals(1, economyReservas.size());
        assertTrue(economyReservas.contains(reserva1));
    }

    @Test
    public void testCancelarReserva() {
            Pasajero pasajeroPrincipal = new Pasajero("Juan", "Perez", "12345678", "juan.perez@example.com", "Passw0rd!");
            Reserva reserva = new Reserva("123", Ciudad.JUJUY, Ciudad.CORDOBA, new Date(), new Date(), "Economy", EstadoReserva.RESERVADA, pasajeroPrincipal, null);
            reservaManager.agregarReserva(reserva);
            
            System.out.println("Estado antes de cancelar: " + reserva.getEstado());
            
            reservaManager.cancelarReserva("123");
            
            System.out.println("Estado después de cancelar: " + reserva.getEstado());
            
            assertEquals(EstadoReserva.CANCELADA, reserva.getEstado());
    }
}