package ar.edu.unq.po2.testSueldoRecargado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.sueldoRecargado.Planta;

class testEmpleadoPlanta {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSueldo() {
		Planta empleado = new Planta(4);
		 
		assertEquals(3210, empleado.sueldo());
	}

}
