package ar.edu.unq.po2.encuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.TemplateObserver.AplicacionMovil;
import ar.edu.unq.po2.TemplateObserver.Partido;

class TestAplicacionMovil {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testAplicacionMovilEsNotificada() {
		Partido partido = mock(Partido.class);
		when(partido.getResultado()).thenReturn("2-1");
		AplicacionMovil aplicacion = new AplicacionMovil();
		
		aplicacion.actualizar(partido);
		assertEquals(1, aplicacion.getResultados().size());
		assertEquals("2-1", aplicacion.getResultados().get(0));
		
	}

}
