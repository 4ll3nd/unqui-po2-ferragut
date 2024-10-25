package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestHoraExtra {

	@Test
	void testInicializacion() {
		HoraExtra h = new HoraExtra(20, 5);
		
		assertEquals(20, h.getValor());
		assertEquals(5, h.getCantDeHoras());
	}
	
	@Test
	void testMontoPara() {
		HoraExtra h = new HoraExtra(20, 5);
		
		assertEquals(100, h.montoPorHoras());
	}
	
}	
