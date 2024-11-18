package ar.edu.unq.po2.Composite;

import static org.junit.jupiter.api.Assertions.*;
import ar.edu.unq.po2.TemplateObserver.Parcela;
import ar.edu.unq.po2.TemplateObserver.Trigo;
import org.junit.jupiter.api.Test;
class TestTrigo {

	@Test
	void testGananciaAnual() {
		Parcela trigo = new Trigo();
		
		assertEquals(300d, trigo.gananciasAnuales());
	}

}
