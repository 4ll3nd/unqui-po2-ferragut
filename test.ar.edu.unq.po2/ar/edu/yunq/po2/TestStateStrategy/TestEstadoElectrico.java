package ar.edu.yunq.po2.TestStateStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.StateStrategy.maquinaDeJuegos.Apagado;
import ar.edu.unq.po2.StateStrategy.maquinaDeJuegos.Encendido;

class TestEstadoElectrico {

	@Test
	void testCartelIngresarFichas() {
		Encendido encendido = new Encendido();
		
		assertEquals("¡Ingresar Fichas!", encendido.botonInicio());
	}
	
	@Test
	void testPresionarInicioEstadoApagada() {
		Apagado apagado = new Apagado();
		
		assertEquals("", apagado.botonInicio());
	}

}
