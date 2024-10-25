package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestPersona {

	@Test
	void testInicializacion() {
		LocalDate fechaDeNacimiento = LocalDate.of(2002, 6, 3);
		Persona x = new Persona("Alex", fechaDeNacimiento);
		
		assertEquals("Alex", x.getNombre());
		assertEquals(22, x.getEdad());
	}
	
	@Test
	void testComprobarQueAnimalesYPersonasEntiendeGetNombre() {
		Persona alex    = new Persona("Alex", LocalDate.of(2002, 6, 3));
		Persona yamila  = new Persona("Alex", LocalDate.of(2000, 2, 5));
		Mascota connie  = new Mascota("Connie", "Gato Silvestre");
		Mascota blackie = new Mascota("Blackie","Dobberman");
		List <Identidad> seres = new ArrayList<Identidad>();
		seres.add(blackie);
		seres.add(yamila);
		seres.add(connie);
		seres.add(blackie);
		
		List <String> listaDeNombres = new ArrayList<String>();
				
		for (Identidad ser: seres) {
			listaDeNombres.add(ser.getNombre());
		}
		assertEquals(4, listaDeNombres.size());
	}

}
