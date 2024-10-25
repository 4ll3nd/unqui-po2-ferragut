package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrabajador {

	@Test
	void testInicializacion() {
		Trabajador t = new Trabajador();
		t.recibirRecibo(new Ingreso("Enero", 100.00, 5));
		t.recibirRecibo(new Ingreso("Febrero", 100.00, 5));
		t.recibirRecibo(new Ingreso("Marzo", 100.00, 5));
		
		assertEquals(3, t.cantidadDeRecibos());
	}
	
	@Test
	void testTotalPercibido() {
		Trabajador t = new Trabajador();
		t.recibirRecibo(new Ingreso("Enero", 100.00, 5));
		t.recibirRecibo(new Ingreso("Febrero", 100.00, 5));
		t.recibirRecibo(new Ingreso("Marzo", 100.00, 5));
		
		assertEquals(600.00, t.getTotalPercibido());
	}
	
	@Test
	void testMontoImponible() {
		Trabajador t = new Trabajador();
		t.recibirRecibo(new Ingreso("Enero", 100.00, 5));
		t.recibirRecibo(new Ingreso("Febrero", 100.00, 5));
		t.recibirRecibo(new Ingreso("Marzo", 100.00, 5));
		
		assertEquals(300, t.getMontoImponible());
	}
	
	@Test
	void testImpuestoAPagar() {
		Trabajador t = new Trabajador();
		t.recibirRecibo(new Ingreso("Enero", 100.00, 5));
		t.recibirRecibo(new Ingreso("Febrero", 100.00, 5));
		t.recibirRecibo(new Ingreso("Marzo", 100.00, 5));
		
		assertEquals(60.00, t.getImpuestosAPagar());
	}
 	
	@Test
	void testUnAñoDeImpuestos() {
		Trabajador t = new Trabajador();
		t.recibirRecibo(new Ingreso("Enero", 100.00, 5));
		t.recibirRecibo(new Ingreso("Febrero", 100.00, 5));
		t.recibirRecibo(new Ingreso("Marzo", 100.00, 5));
		t.recibirRecibo(new Ingreso("Abril", 100.00, 5));
		t.recibirRecibo(new Ingreso("Mayo", 100.00, 5));
		t.recibirRecibo(new Ingreso("Junio", 100.00, 5));
		t.recibirRecibo(new Ingreso("Julio", 100.00, 5));
		t.recibirRecibo(new Ingreso("Agosto", 100.00, 5));
		t.recibirRecibo(new Ingreso("Septiembre", 100.00, 5));
		t.recibirRecibo(new Ingreso("Octubre", 100.00, 5));
		t.recibirRecibo(new Ingreso("Noviembre", 100.00, 5));
		t.recibirRecibo(new Ingreso("Diciembre", 100.00, 5));
		
		assertEquals(240, t.getImpuestosAPagar());		
	}
	
}
