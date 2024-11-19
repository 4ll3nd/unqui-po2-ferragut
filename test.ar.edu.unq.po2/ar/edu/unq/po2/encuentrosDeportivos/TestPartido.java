package ar.edu.unq.po2.encuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.TemplateObserver.Partido;

class TestPartido {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testInicialiazacion() {
		List<String> contricantes = Arrays.asList("Alex", "juan");
		Partido p = new Partido("2-1", contricantes, "voleyPlaya");
		
		assertEquals("2-1", p.getResultado());
		assertEquals(contricantes, p.getContricantes());
		assertEquals("voleyPlaya", p.getDeporte());
		
	}

}
