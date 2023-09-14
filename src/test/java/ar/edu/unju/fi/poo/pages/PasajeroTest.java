package ar.edu.unju.fi.poo.pages;

import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.poo.dominio.Pasajero;

import static org.junit.jupiter.api.Assertions.*;

public class PasajeroTest {

    @Test
    public void testConstructorYGetters() {
        // Crear un objeto Pasajero, con valores específicos utilizando el constructor.
        Pasajero pasajero = new Pasajero(123456789, "Juan", "Perez", "123-456-7890", "juan@example.com");

        // Este método prueba que el constructor y los getters de la clase Pasajero
        // funcionan correctamente.
        assertEquals(123456789, pasajero.getDni());
        assertEquals("Juan", pasajero.getNombre());
        assertEquals("Perez", pasajero.getApellido());
        assertEquals("123-456-7890", pasajero.getTelefono());
        assertEquals("juan@example.com", pasajero.getCorreo());
        // Se utilizan afirmaciones assertEquals para verificar que los valores del
        // pasajero coinciden con los valores esperados.
    }

    @Test
    // El método testSetters prueba los métodos setters de la clase Pasajero para
    // asegurarnos de que pueden establecer los valores correctamente.
    public void testSetters() {
        // Crear un objeto Pasajero, con valores iniciales (valores por defecto).
        Pasajero pasajero = new Pasajero(0, "", "", "", "");

        // Se utilizan los métodos setters para establecer nuevos valores.
        pasajero.setDni(987654321);
        pasajero.setNombre("María");
        pasajero.setApellido("López");
        pasajero.setTelefono("987-654-3210");
        pasajero.setCorreo("maria@example.com");

        // Comprobar que los valores se han establecido correctamente
        assertEquals(987654321, pasajero.getDni());
        assertEquals("María", pasajero.getNombre());
        assertEquals("López", pasajero.getApellido());
        assertEquals("987-654-3210", pasajero.getTelefono());
        assertEquals("maria@example.com", pasajero.getCorreo());
    }
}