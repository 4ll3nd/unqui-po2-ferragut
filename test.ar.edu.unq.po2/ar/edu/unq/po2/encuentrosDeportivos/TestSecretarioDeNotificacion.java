package ar.edu.unq.po2.encuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.TemplateObserver.Aplicacion;
import ar.edu.unq.po2.TemplateObserver.AplicacionMovil;
import ar.edu.unq.po2.TemplateObserver.Partido;
import ar.edu.unq.po2.TemplateObserver.SecretarioDeNotificacion;
import ar.edu.unq.po2.TemplateObserver.Servidor;

class TestSecretarioDeNotificacion {
	
	Partido partido;
	Aplicacion aplicacion;
	
	@BeforeEach
	void setUp() throws Exception {
		partido = mock(Partido.class);
		aplicacion = mock(Aplicacion.class);
	}

	@Test
	void testSeNotificaAUnServidor() {
		Servidor servidor = mock(Servidor.class);
		when(partido.getDeporte()).thenReturn("Futbol");
		SecretarioDeNotificacion x = new SecretarioDeNotificacion(servidor, aplicacion);
		x.setInteres("Futbol");
		
		x.notificarSiEsDeInteres(partido);
		
		verify(servidor).actualizar(partido);
	}
	
	@Test
	void testSeNotificaAUnaAppMovil() {
		AplicacionMovil app = mock(AplicacionMovil.class);
		when(partido.getDeporte()).thenReturn("Voley");
		SecretarioDeNotificacion x = new SecretarioDeNotificacion(app, aplicacion);
		x.setInteres("Voley");
		
		x.notificarSiEsDeInteres(partido);
		verify(app).actualizar(partido);
	}
	@Test
	void testNoSeNotificaAlgoQueNoSeTieneInteres() {
		AplicacionMovil app = mock(AplicacionMovil.class);
		when(partido.getDeporte()).thenReturn("Voley");
		SecretarioDeNotificacion x = new SecretarioDeNotificacion(app, aplicacion);
		x.setInteres("Futbol");
		
		x.notificarSiEsDeInteres(partido);
		verify(app, never()).actualizar(partido);;
	}
}
