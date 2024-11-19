package ar.edu.unq.po2.encuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.TemplateObserver.Aplicacion;
import ar.edu.unq.po2.TemplateObserver.Partido;
import ar.edu.unq.po2.TemplateObserver.Servidor;

class TestAplicacion {
	Aplicacion aplicacion;
	@BeforeEach
	void setUp() throws Exception {
		aplicacion = new Aplicacion();
	}

	@Test
	void testAplicacionAñadeUnPartido() {
		Partido partido = mock(Partido.class);
		
		aplicacion.añadirPartido(partido);
		
		assertEquals(1, aplicacion.getPartidos().size());
	}
	@Test
	void testApliacionAñadeUnNuevoInteresado() {
		Servidor servidor = mock(Servidor.class);
		aplicacion.suscribir(servidor, "Futbol");
		
		assertEquals(1, aplicacion.getInteresados());
	}
	
}
