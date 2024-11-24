package ar.edu.unq.po2.encuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.TemplateObserver.Aplicacion;
import ar.edu.unq.po2.TemplateObserver.Partido;
import ar.edu.unq.po2.TemplateObserver.SecretarioDeNotificacion;
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
		SecretarioDeNotificacion secretario = mock(SecretarioDeNotificacion.class);
		aplicacion.suscribir(secretario);
		
		assertEquals(1, aplicacion.getInteresados().size());
	}
	
	@Test
	void seAñadeUnPartidoYSeNotificaALosSecretarios() {
		SecretarioDeNotificacion secretario = mock(SecretarioDeNotificacion.class);
		aplicacion.suscribir(secretario);
		Partido partido = mock(Partido.class);
		aplicacion.añadirPartido(partido);
		
		verify(secretario).notificarSiEsDeInteres(partido);;
	}
}
