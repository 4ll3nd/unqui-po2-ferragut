package ar.edu.unq.po2.publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.TemplateObserver.PublicacionesObserver.Articulo;
import ar.edu.unq.po2.TemplateObserver.PublicacionesObserver.Interesado;
import ar.edu.unq.po2.TemplateObserver.PublicacionesObserver.Sistema;

class TestSistema {
	
	Articulo gobs;
	Sistema sistema;
	
	@BeforeEach
	void setUp() throws Exception {
		gobs = mock(Articulo.class);
		sistema = new Sistema();
	}

	@Test
	void testSeAgregaUnArticulo() {
		sistema.añadirArticulo(gobs);
		
		assertEquals(1, sistema.getArticulos().size());
		
	}
	
	@Test
	void testSeAgregaUnPartidoYSeNotificaALosObservers() {
		Interesado interesado = mock(Interesado.class);
		sistema.suscribirse(interesado);
		sistema.añadirArticulo(gobs);
		
		verify(interesado).update(gobs);
	}

}
