package ar.edu.unq.po2.encuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.TemplateObserver.Partido;
import ar.edu.unq.po2.TemplateObserver.Servidor;

class TestServidor {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testServidorEsNotificado() {
		Servidor servidor = new Servidor();
		
		servidor.actualizar(mock(Partido.class));
		
		assertEquals(1, servidor.getPartidos().size());
	}

}
