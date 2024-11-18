package ar.edu.unq.po2.testSueldoRecargado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.sueldoRecargado.Temporario;

class TestEmpleadoTemporario {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSueldo() {
		Temporario empleado = new Temporario(10, 5, false);
		
		assertEquals(1020.0, empleado.sueldo());
	}

}
