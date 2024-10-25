package ar.edu.yunq.po2.TestStateStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.StateStrategy.Reproductor.Reproductor;
import ar.edu.unq.po2.StateStrategy.Reproductor.ReproductorEstado;
import ar.edu.unq.po2.StateStrategy.Reproductor.SeleccionDeCanciones;
import ar.edu.unq.po2.StateStrategy.Reproductor.Song;

import static org.mockito.Mockito.*;
class TestSeleccionDeCanciones {
	
	Song cancion;
	Reproductor reproductor;
	ReproductorEstado seleccion;
	
	@BeforeEach
	void sepup() {
		seleccion = new SeleccionDeCanciones();
		cancion = mock(Song.class);
		reproductor = mock(Reproductor.class);
	}
	
	@Test
	void testPlay() {
		seleccion.play(cancion, reproductor);
		
		verify(cancion).play();
		//verify(y).setEstado(seleccion.siguienteEstado());
		/**como testeo el cambio del estado del reproductor?
		 * en este caso falla porque son diferentes instancias
		 * de sigueinteEstado()
		 * como testeo los system.out.print? 
		 */
	}
	
}
