package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.MultiOperador;

class TestMultiOperador {
private MultiOperador multiOperador = new MultiOperador(); 

@BeforeEach 
public void setUp() throws Exception {
	//instance of a new multiOperador
	//add five number to the multiOperador
	multiOperador.addNewNumber(1);
	multiOperador.addNewNumber(3);
	multiOperador.addNewNumber(5);
	multiOperador.addNewNumber(7);
	multiOperador.addNewNumber(9);
	}

	@Test
	void testSum() {
		int amount = multiOperador.sum();
		assertEquals(amount, 25);
	}
	
	@Test
	void testProduct() {
		int amount = multiOperador.product();
		assertEquals(amount, 945);
	}
	
	@Test
	public void testSubstration() {
		int amount = multiOperador.substraction();
		assertEquals(amount, -25);
	}
	
}
