package ar.edu.unq.po2.TestEnums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.EnumStreams.LesionDermatologica;

class TestLesionDermatologica {
	private LesionDermatologica rojo;
	private LesionDermatologica amarillo;
	private LesionDermatologica gris;
	private LesionDermatologica miel;
	@BeforeEach 
	void setUp() {
	 rojo = LesionDermatologica.Rojo;
	 amarillo = LesionDermatologica.Amarillo;
	 gris = LesionDermatologica.Gris;
	 miel = LesionDermatologica.Miel;
	}
	@Test
	void testNivelDeRiesgo() {
		
		
		assertEquals(100, rojo.getNivelDeRiesgo());
		assertEquals(20, amarillo.getNivelDeRiesgo());
		assertEquals(50, gris.getNivelDeRiesgo());
		assertEquals(80, miel.getNivelDeRiesgo());
	}
	
	@Test
	void testEvolucionDeLesion() {
		assertEquals(LesionDermatologica.Gris, amarillo.getEvolucionDeLesion());
		assertEquals(LesionDermatologica.Amarillo, rojo.getEvolucionDeLesion());
		assertEquals(LesionDermatologica.Miel, gris.getEvolucionDeLesion());
		assertEquals(LesionDermatologica.Rojo, miel.getEvolucionDeLesion());
	}
	
}
