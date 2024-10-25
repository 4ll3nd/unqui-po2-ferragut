package ar.edu.unq.po2.TestSolid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.solid.Banco;
import ar.edu.unq.po2.solid.Cliente;
import ar.edu.unq.po2.solid.Propiedad;
import ar.edu.unq.po2.solid.SolicitudPersonal;

class TestSolicitudPersonal {
	
	private Banco banco;
	private Propiedad casa;
	private Cliente cliente;
	private Cliente clienteConSueldoBajo;
	private SolicitudPersonal solicitudPersonal;
	@BeforeEach
	void setUp() {
		banco = new Banco();
		casa = new Propiedad("ok", 100.00);
		cliente = new Cliente("Alex", "Ferragut", 22, 87.00, casa);
		clienteConSueldoBajo = new Cliente("das", "dasd", 22, 50, casa);
		solicitudPersonal = new SolicitudPersonal(cliente, 100.00, 5);
	}
	
	@Test
	void testInicializacion() {
		
		assertEquals("Alex", solicitudPersonal.getEmisor().getNombre());
		assertEquals(100.00, solicitudPersonal.getMonto());
		assertEquals(5, solicitudPersonal.getPlazo());
	}
	@Test
	void testCuotaNoSuperaASueldo() {
		Cliente x = new Cliente("Alex", "Ferragut", 22, 3000, casa);
		
		SolicitudPersonal y = new SolicitudPersonal(x, 100.00, 5);
		
		assertEquals(true, y.cuotaNoSuperaSueldo());
	}
	@Test
	void testTieneIngresosAceptables() {
		Cliente clienteConSueldoAlto = new Cliente("Alex", "Ferragut", 22, 3000, casa);
		
		SolicitudPersonal y = new SolicitudPersonal(clienteConSueldoAlto, 100.00, 5);
		
		assertEquals(true, y.tieneIngresosAceptables());
	}
	@Test
	void testCuotaSuperaASueldo() {		
		SolicitudPersonal y = new SolicitudPersonal(clienteConSueldoBajo, 100.00, 5);
		
		assertEquals(false, y.cuotaNoSuperaSueldo());
	}
	
	@Test
	void testNoTieneIngresosAceptables() {	
		SolicitudPersonal y = new SolicitudPersonal(clienteConSueldoBajo, 100.00, 5);
		
		assertEquals(false, y.tieneIngresosAceptables());
	}
}
