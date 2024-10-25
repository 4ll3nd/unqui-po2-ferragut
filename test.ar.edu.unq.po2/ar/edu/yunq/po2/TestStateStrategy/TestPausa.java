package ar.edu.yunq.po2.TestStateStrategy;

import static org.junit.jupiter.api.Assertions.*;
import ar.edu.unq.po2.StateStrategy.Reproductor.ReproductorEstado;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.StateStrategy.Reproductor.Pausa;
import ar.edu.unq.po2.StateStrategy.Reproductor.Reproductor;
import ar.edu.unq.po2.StateStrategy.Reproductor.Song;

import static org.mockito.Mockito.*;
class TestPausa {

	@Test
	void testPausa() {
		ReproductorEstado pausa = new Pausa();
		Reproductor reproductor = mock(Reproductor.class);
		Song cancion = mock(Song.class);
		
		pausa.pause(cancion, reproductor);
		
		verify(cancion).pause();
	}
	
	@Test
	void testStop() {
		ReproductorEstado pausa = new Pausa();
		Reproductor reproductor = mock(Reproductor.class);
		Song cancion = mock(Song.class);
		
		pausa.stop(cancion, reproductor);
		
		verify(cancion).stop();
	}
	
}
