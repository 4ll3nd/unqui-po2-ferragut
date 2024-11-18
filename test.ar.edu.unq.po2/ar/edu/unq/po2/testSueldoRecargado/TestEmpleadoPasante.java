package ar.edu.unq.po2.testSueldoRecargado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.sueldoRecargado.Pasante;

class TestEmpleadoPasante {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		Pasante empleado = new Pasante(20);
		
		assertEquals(696.0, empleado.sueldo());
	}

}
