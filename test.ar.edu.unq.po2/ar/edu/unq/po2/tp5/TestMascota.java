package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMascota {

	@Test
	void testInicializacion() {
		Mascota x = new Mascota("Connie", "Gato Silvestre");
		
		assertEquals("Connie", x.getNombre());
		assertEquals("Gato Silvestre", x.getRaza());
	}

}
