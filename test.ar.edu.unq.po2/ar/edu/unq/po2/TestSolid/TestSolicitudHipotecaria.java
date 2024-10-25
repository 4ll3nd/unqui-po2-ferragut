package ar.edu.unq.po2.TestSolid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ar.edu.unq.po2.solid.Cliente;
import ar.edu.unq.po2.solid.Propiedad;
import ar.edu.unq.po2.solid.SolicitudHipotecaria;

class TestSolicitudHipotecaria {
	
	private Propiedad casa;
	private Cliente cliente;
	@BeforeEach
	void setUp() {
		casa = new Propiedad("ok", 100.00);
		cliente = new Cliente("Alex", "Ferragut", 22, 50, casa);
	}
	
	@Test
	void testInicializacion() {
		Cliente x = new Cliente("Alex", "Ferragut", 22, 87.00, casa);
		
		SolicitudHipotecaria y = new SolicitudHipotecaria(x, 100.00, 5, casa);
		
		assertEquals("Alex", y.getEmisor().getNombre());
		assertEquals(100.00, y.getMonto());
		assertEquals("ok", y.getPropiedad().getDireccion());
		assertEquals(5, y.getPlazo());
	}
	
	@Test void testCuotaNoSuperaSaldo() {

		Cliente x = new Cliente("Alex", "Ferragut", 22, 300, casa);
		
		SolicitudHipotecaria y = new SolicitudHipotecaria(x, 100, 5, casa);
		
		assertEquals(true, y.cuotaNoSuperaSueldo());
	}
	
	@Test void testCuotaSuperaSaldo() {
		
		SolicitudHipotecaria y = new SolicitudHipotecaria(cliente, 4000, 5, casa);
		
		assertEquals(false, y.cuotaNoSuperaSueldo());
	}
	@Test
	void testMontoEsMayorAValorFiscal() {
		SolicitudHipotecaria y = new SolicitudHipotecaria(cliente, 200, 5, casa);
		
		assertEquals(false, y.montoNoEsMayorAValorFiscal());
	}
	
	@Test
	void testMontoNoEsMayorAValorFiscal() {
		Propiedad casa = new Propiedad("ok", 1000.00);
		
		SolicitudHipotecaria y = new SolicitudHipotecaria(cliente, 50, 5, casa);
		
		assertEquals(true, y.montoNoEsMayorAValorFiscal());
	}
}
