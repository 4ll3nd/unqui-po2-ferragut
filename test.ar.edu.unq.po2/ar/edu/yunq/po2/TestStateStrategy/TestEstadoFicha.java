package ar.edu.yunq.po2.TestStateStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.StateStrategy.maquinaDeJuegos.ConDosFichas;
import ar.edu.unq.po2.StateStrategy.maquinaDeJuegos.ConUnaFicha;
import ar.edu.unq.po2.StateStrategy.maquinaDeJuegos.SinFichas;

class TestEstadoFicha {

	@Test
	void testAvisoInicioUnJugador() {
		ConUnaFicha ficha = new ConUnaFicha();
		
		assertEquals("Jugador Uno, Listo", ficha.botonInicio());
	}
	
	@Test
	void testAvisoInicioDosJugadores() {
		ConDosFichas dosFichas = new ConDosFichas();
		
		assertEquals("Jugador Dos, Listo", dosFichas.botonInicio());
	}
	
	@Test
	void testInicioSinFichas() {
		SinFichas sinFichas = new SinFichas();
		
		assertEquals("", sinFichas.botonInicio());
	}
	
}
