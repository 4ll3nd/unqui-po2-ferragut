package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestImpuesto {

	@Test
	void testInicializacion() {
		Impuesto x = new Impuesto();
		
		assertEquals(0.2, x.getPorcentaje()); 
	}
    
	@Test
	void testRetencionPara() {
		Impuesto x = new Impuesto();
		
		assertEquals(2.0, x.retencionPara(10));
	}
}
