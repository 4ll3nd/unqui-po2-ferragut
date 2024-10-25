package ar.edu.yunq.po2.TestStateStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.StateStrategy.encriptadorNaive.EncriptadorNaive;
import ar.edu.unq.po2.StateStrategy.encriptadorNaive.EncriptarANumero;
import ar.edu.unq.po2.StateStrategy.encriptadorNaive.EncriptarPorVocal;

class TestEncriptadorNaive {
	EncriptarPorVocal porVocal;
	EncriptarANumero aNumero;
	EncriptadorNaive encriptador;
	
	@BeforeEach 
	void setUp() {
		porVocal = new EncriptarPorVocal();
		aNumero =new EncriptarANumero();
		encriptador = new EncriptadorNaive(porVocal);
	}
	
	@Test
	void testInicializacion() {	
		assertEquals(porVocal, encriptador.getEstrategiaDeEncriptado());
	}
	
	@Test
	void testCambioDeEstrategia() {
		encriptador.setEstrategiaDeEncriptado(aNumero);
		
		assertEquals(aNumero, encriptador.getEstrategiaDeEncriptado());
	}
	
	@Test
	void testEncriptarPorVocal() {
		encriptador.encriptar("Hola");
		assertEquals("Hule", encriptador.getStringEncriptado());
	}
	
	@Test
	void testEncriptarANumero() {
		encriptador.setEstrategiaDeEncriptado(aNumero);
		encriptador.encriptar("Hola");
		assertEquals("Hule", encriptador.getStringEncriptado());
	}
	
}
