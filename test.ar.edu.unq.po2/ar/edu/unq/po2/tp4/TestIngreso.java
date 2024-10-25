package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestIngreso {

	@Test
	void testInicializacion() {
		Ingreso ingreso = new Ingreso("Enero", 100.00, 5);

		HoraExtra y = ingreso.getHoraExtra();
		
		Impuesto x = ingreso.getImpuesto();
		
		assertEquals("Enero", ingreso.getMesDePercepcion());
		assertEquals(100.00, ingreso.getMontoPercibido());
		assertEquals(5, ingreso.getHorasExtrasTrabajadas());
		assertEquals(5, y.getCantDeHoras());
		assertEquals(0.2, x.getPorcentaje());
	}
	
	@Test
	void testValorDeHorasExtras() {
		Ingreso ingreso = new Ingreso("Enero", 100.00, 5);
		
		assertEquals(100, ingreso.valorDeHorasExtras());
	}
	
	@Test
	void valorDeImpuesto() {
		Ingreso ingreso = new Ingreso("Enero", 100.00, 5);
		
		assertEquals(20,0, ingreso.valorDeImpuesto());
	}
	
}
