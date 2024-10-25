package ar.edu.unq.po2.TestSolid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.solid.Propiedad;

class TestPropiedad {

	@Test
	void testInicializacion() {
		Propiedad x = new Propiedad("ok", 100.00);
		
		assertEquals("ok", x.getDireccion());
		assertEquals(100.00, x.getValorFiscal());
	}

}
