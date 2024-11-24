package ar.edu.unq.po2.JuegoPreguntasYRespuestas;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JuegoPreguntasYRespuestas.Jugador;
import JuegoPreguntasYRespuestas.SistemaJuego;

class TestJugador {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testJugadorEnviaRespuestaAlSistema() {
		SistemaJuego juego = mock(SistemaJuego.class);
		Jugador alex = new Jugador("Alex");
		
		alex.enviarRespuesta(juego, "¿cuento es 4 x 5?", "20");
		
		verify(juego).recibirRespuesta(alex, "¿cuento es 4 x 5?", "20");
	}
}
