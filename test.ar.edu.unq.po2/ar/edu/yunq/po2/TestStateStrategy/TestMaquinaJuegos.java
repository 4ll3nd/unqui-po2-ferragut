package ar.edu.yunq.po2.TestStateStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.StateStrategy.maquinaDeJuegos.Apagado;
import ar.edu.unq.po2.StateStrategy.maquinaDeJuegos.ConDosFichas;
import ar.edu.unq.po2.StateStrategy.maquinaDeJuegos.ConUnaFicha;
import ar.edu.unq.po2.StateStrategy.maquinaDeJuegos.Encendido;
import ar.edu.unq.po2.StateStrategy.maquinaDeJuegos.Maquina;
import ar.edu.unq.po2.StateStrategy.maquinaDeJuegos.SinFichas;

class TestMaquinaJuegos {
	Apagado apagado;
	Encendido encendido;
	ConUnaFicha unaFicha;
	ConDosFichas dosFichas;
	SinFichas sinFicha;
	Maquina arcade;
	
	@BeforeEach 
	void setUp() {
		apagado = new Apagado();
		encendido = new Encendido();
		unaFicha = new ConUnaFicha();
		dosFichas = new ConDosFichas();
		arcade =  new Maquina();
		sinFicha = new SinFichas();
}

	@Test
	void testMensajeDeInicioEstandoApagada() {
		assertEquals("", arcade.getEstado().botonInicio());
	}
	
	@Test
	void testMensajeDeInicioEstandoSinfichas() {
		assertEquals("", arcade.botonInicio());
	}
	
	@Test
	void testMensajeDeInicioEstandoPrendida() {
		arcade.encender();
		assertEquals("¡Ingresar Fichas!", arcade.getEstado().botonInicio());
	}
	
	@Test
	void testMensajeDeInicioEstandoConUnaFicha() {
		arcade.ingresarFicha(unaFicha);
		assertEquals("Jugador Uno, Listo", arcade.botonInicio());
	}
	
	@Test
	void testMensajeDeInicioEstandoConDosFichas() {
		arcade.ingresarFicha(dosFichas);
		assertEquals("Jugador Dos, Listo", arcade.botonInicio());
	}
	
	@Test
	void testTerminarJuegoConUnaFicha() {
		arcade.ingresarFicha(unaFicha);
		arcade.terminarJuego();
		
		assertEquals("", arcade.botonInicio());
	}
	
}
