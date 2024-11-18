package ar.edu.unq.po2.Composite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.TemplateObserver.Parcela;
import ar.edu.unq.po2.TemplateObserver.Soja;
class TestSoja {

	@Test
	void testGananciaAnual() {
		Parcela soja = new Soja();
		
		assertEquals(500d, soja.gananciasAnuales());
	}

}
