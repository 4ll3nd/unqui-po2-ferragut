package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestProductoCooperativa {

	@Test
	void testInicializacion() {
		ProductoCooperativa x = new ProductoCooperativa(300, "x");
		
		assertEquals(270, x.getPrecio());
		assertEquals("x", x.getNombre());
	}

}
