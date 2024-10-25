package ar.edu.yunq.po2.TestStateStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.StateStrategy.Reproductor.ReproductorEstado;
import ar.edu.unq.po2.StateStrategy.Reproductor.Reproduccion;
import ar.edu.unq.po2.StateStrategy.Reproductor.Reproductor;
import ar.edu.unq.po2.StateStrategy.Reproductor.Song;

import static org.mockito.Mockito.*;

class TestReproduccion {
	ReproductorEstado reproduccion;
	Song cancion;
	Reproductor reproductor;
	@BeforeEach
	void sepUp() {
		reproduccion = new Reproduccion();
		cancion = mock(Song.class);
		reproductor = mock(Reproductor.class);
	}
	
	@Test
	void testPause() {
		reproduccion.pause(cancion, reproductor);
		
		verify(cancion).pause();	
	}
	
	@Test
	void testStop() {	
		reproduccion.stop(cancion, reproductor);
		
		verify(cancion).stop();
	}
}
