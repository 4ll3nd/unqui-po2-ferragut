package ar.edu.unq.po2.Composite;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.TemplateObserver.Parcela;
import ar.edu.unq.po2.TemplateObserver.Porciones;
import ar.edu.unq.po2.TemplateObserver.Trigo;
import ar.edu.unq.po2.TemplateObserver.Soja;
class TestPorciones {

	@Test
	void testGananciasTotales() {
		Parcela soja = mock(Soja.class);
		Parcela trigo = mock(Soja.class);
		
		List<Parcela> parcelas2= Arrays.asList(soja,trigo,soja,soja);
		Parcela porcion2 = new Porciones(parcelas2);
		List<Parcela> parcelas = Arrays.asList(soja,trigo,soja,soja, porcion2);
		Parcela porcion = new Porciones(parcelas);
		
		when(trigo.gananciasAnuales()).thenReturn(300d);
		when(soja.gananciasAnuales()).thenReturn(500d);
		
		assertEquals(3600d, porcion.gananciasAnuales());
	}
}
