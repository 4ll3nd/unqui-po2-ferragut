package ar.edu.unq.po2.JuegoPreguntasYRespuestas;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import JuegoPreguntasYRespuestas.Jugador;
import JuegoPreguntasYRespuestas.Pregunta;
import JuegoPreguntasYRespuestas.SistemaJuego;

class TestSistemaJuego {
	
	Pregunta uno;
	Pregunta dos;
	Jugador alex;
	SistemaJuego juego;
	
	@BeforeEach
	void setUp() throws Exception {
		uno = mock(Pregunta.class);
		dos = mock(Pregunta.class);
		alex = mock(Jugador.class);
		juego = new SistemaJuego(Arrays.asList(uno,dos));
	}
	
	@Test
	void JuegoVerificaSiLaRespuestaEsCorrectaYNotificaAlJugador() {
		juego.agregarJugador(alex);
		when(uno.getEnunciado()).thenReturn("Uno");
		when(uno.getRespuesta()).thenReturn("A");
		when(dos.getEnunciado()).thenReturn("dos");
		when(dos.getRespuesta()).thenReturn("C");
		when(alex.getNombre()).thenReturn("Alex");
		juego.agregarJugador(mock(Jugador.class));
		juego.agregarJugador(mock(Jugador.class));
		juego.agregarJugador(mock(Jugador.class));
		juego.agregarJugador(mock(Jugador.class));
		
		juego.recibirRespuesta(alex, "Uno", "A");
		
		verify(alex).avisoDeRespuestaCorrecta();
	}
	
	@Test
	void JuegoVerificaSiLaRespuestaEsIncorrectaCorrectaYNotificaAlJugador() {
		juego.agregarJugador(alex);
		when(uno.getEnunciado()).thenReturn("uno");
		when(uno.getRespuesta()).thenReturn("A");
		when(dos.getEnunciado()).thenReturn("dos");
		when(dos.getRespuesta()).thenReturn("C");
		when(alex.getNombre()).thenReturn("Alex");
		juego.agregarJugador(mock(Jugador.class));
		juego.agregarJugador(mock(Jugador.class));
		juego.agregarJugador(mock(Jugador.class));
		juego.agregarJugador(mock(Jugador.class));
		
		juego.recibirRespuesta(alex, "uno", "B");
		
		verify(alex).avisoDeRespuestaIncorrecta();
	}
	
}
