package ar.edu.unq.po2.TestSolid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.solid.Banco;
import ar.edu.unq.po2.solid.Cliente;
import ar.edu.unq.po2.solid.Propiedad;
import ar.edu.unq.po2.solid.SolicitudHipotecaria;

class TestCliente {

	@Test
	void testInicializacion() {
		Propiedad casa = new Propiedad("ok", 100.00);
		Cliente x = new Cliente("Alex", "Ferragut", 22, 87.00, casa);
		
		assertEquals(22, x.getEdad());
		assertEquals(87.00, x.getSueldoNetoMensual());
		assertEquals("ok", x.getPropiedad().getDireccion());
		assertEquals("Alex", x.getNombre());
		assertEquals("Ferragut", x.getApellido());
	}
	
	@Test
	void testClienteRealizaUnaSolicitud() {
		Propiedad casa = new Propiedad("ok", 100.00);
		Cliente x = new Cliente("Alex", "Ferragut", 22, 87.00, casa);
		Banco y = new Banco();
		y.agregarCliente(x);
		
		x.realizarSolicitud(new Banco(), new SolicitudHipotecaria(x, 100.00, 5, casa));
		
		assertEquals(1, y.getCantDeClientes());
		assertEquals(1, y.getCantDeSolicitudes());
	}
}
