package ar.edu.unq.po2.TestTemplateAdapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.templateAdapter.Pagina;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class TestPagina {

	@Test
	void testInicializacion() {
	    List<Pagina> links = Arrays.asList(mock(Pagina.class), mock(Pagina.class), mock(Pagina.class));	    
		Pagina x = new Pagina("x", links);
		
		assertEquals("x", x.getTittle());
		assertEquals(links, x.getLinks());
	}

}
