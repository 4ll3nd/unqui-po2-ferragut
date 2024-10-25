package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestProductoTradicional {

	@Test
	void testInicializacion() {
		ProductoTradicional x = new ProductoTradicional(300, "x");
		
		assertEquals(300, x.getPrecio());
		assertEquals("x", x.getNombre());
	}

}
