package ar.edu.unq.po2.TestSolid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.solid.Banco;
import ar.edu.unq.po2.solid.Cliente;
import ar.edu.unq.po2.solid.Propiedad;
import ar.edu.unq.po2.solid.SolicitudHipotecaria;
import ar.edu.unq.po2.solid.SolicitudPersonal;
import static org.mockito.Mockito.*;

class TestBanco {
	
	private Banco banco;
	private Propiedad casa;
	@BeforeEach
	void setUp() {
		banco = new Banco();
		casa = new Propiedad("ok", 100.00);
	}
	
	@Test
	void testAgregarAUnCliente() {
		Cliente y = new Cliente("Alex", "Ferragut", 22, 87.00, casa);
		
		banco.agregarCliente(y);
		
		assertEquals(1, banco.getCantDeClientes());
	}
	
	@Test
	void testAgregarSolicitud() {
		Cliente y = new Cliente("Alex", "Ferragut", 22, 87.00, casa);
		SolicitudHipotecaria z = new SolicitudHipotecaria(y, 100.00, 5, casa);
		
		banco.agregarSolicitud(z);
		
		assertEquals(1, banco.getCantDeSolicitudes());
	}
	
	@Test
	void testMontoToal() {
		Banco x = new Banco();
		Propiedad casa = new Propiedad("ok", 50000);
		Cliente y = new Cliente("Alex", "Ferragut", 22, 1000, casa);
		SolicitudHipotecaria s1 = new SolicitudHipotecaria(y, 500, 5, casa);
		SolicitudPersonal s2 = new SolicitudPersonal(y, 1000000, 5);
		SolicitudHipotecaria s3 = new SolicitudHipotecaria(y, 500, 5, casa);
		
		x.agregarSolicitud(s1);
		x.agregarSolicitud(s2);
		x.agregarSolicitud(s3);
		
		assertEquals(1000, x.getMontoTotal());	
	}
}
