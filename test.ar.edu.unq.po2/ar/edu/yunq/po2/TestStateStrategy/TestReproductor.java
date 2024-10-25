package ar.edu.yunq.po2.TestStateStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.StateStrategy.Reproductor.Pausa;
import ar.edu.unq.po2.StateStrategy.Reproductor.Reproduccion;
import ar.edu.unq.po2.StateStrategy.Reproductor.Reproductor;
import ar.edu.unq.po2.StateStrategy.Reproductor.Song;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class TestReproductor {
	
	Reproductor reproductor;
	@BeforeEach
	void setUp() {
		List<Song> canciones = Arrays.asList(mock(Song.class), mock(Song.class), mock(Song.class));
		reproductor = new Reproductor(canciones);
	}
	
	@Test
	void testPlayEnSeleccionDeCanciones() {	
		reproductor.play(reproductor.seleccionarCancion(0));
		
		verify(reproductor.seleccionarCancion(0)).play();
		/**COMO VERIFICO EL CAMBIO DE ESTADO?*/
	}
	
	@Test
	void testPauseEnReproduccion() {
		reproductor.setEstado(new Reproduccion());
		reproductor.pause(reproductor.seleccionarCancion(0));
		
		verify(reproductor.seleccionarCancion(0)).pause();
	}
	
	@Test
	void testPauseEnPausa() {
		reproductor.setEstado(new Pausa());
		reproductor.pause(reproductor.seleccionarCancion(0));
		
		verify(reproductor.seleccionarCancion(0)).pause();
	}
	
	@Test
	void testStopEnPausa() {
		reproductor.setEstado(new Pausa());
		reproductor.stop(reproductor.seleccionarCancion(0));
		
		verify(reproductor.seleccionarCancion(0)).stop();
	}
	
	@Test
	void testStopEnReproduccion() {
		reproductor.setEstado(new Reproduccion());
		reproductor.stop(reproductor.seleccionarCancion(0));
		
		verify(reproductor.seleccionarCancion(0)).stop();
	}
}
