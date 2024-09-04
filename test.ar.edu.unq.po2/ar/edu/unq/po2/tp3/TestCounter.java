package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

public class TestCounter {
private Counter counter;

/*
Crea un escenario de test básico, que consiste en un contador
con 10 enteros
*
@throws Exception
*/
@BeforeEach
public void setUp() throws Exception {
//Se crea el contador
counter = new Counter();
//Se agregan los numeros. Un solo par y nueve impares
counter.añadirNumero(1);
counter.añadirNumero(3);
counter.añadirNumero(5);
counter.añadirNumero(7);
counter.añadirNumero(9);
counter.añadirNumero(1);
counter.añadirNumero(1);
counter.añadirNumero(1);
counter.añadirNumero(1);
counter.añadirNumero(4);
}

/*
Verifica la cantidad de pares
*/
@Test
public void testContarPares() {
// Getting the even occurrences
int amount = counter.contarPares();
// I check the amount is the expected one
assertEquals(1, amount);
}

@Test
public void testContarImpares() {
//gettin the ood occurrences
int amount = counter.contarImpares();
assertEquals(amount, 9);
}

@Test
public void testContarMultiplos() {
//gettin 20 multiplo of a number
assertEquals(counter.contarMultiplos(10), 20);
}

@Test
public void testElQueTieneMasDigitosPares() {
assertEquals(counter.elQueTieneMasDigitosPares(counter.getNumeros()), 4);
}

}