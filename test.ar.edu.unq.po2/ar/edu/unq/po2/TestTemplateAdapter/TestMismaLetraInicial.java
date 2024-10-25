package ar.edu.unq.po2.TestTemplateAdapter;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.templateAdapter.Filtro;
import ar.edu.unq.po2.templateAdapter.MismaLetra;
import ar.edu.unq.po2.templateAdapter.Pagina;

class TestMismaLetraInicial {

	@Test
	void testProbarFiltro() {
	    List<Pagina> links = Arrays.asList(mock(Pagina.class), mock(Pagina.class), mock(Pagina.class));	    
	    List<Pagina> paginas = Arrays.asList(new Pagina("xe", links), new Pagina("ye", links), new Pagina("xe", links));
		Pagina xe = new Pagina("xe", links);
	    
		MismaLetra x = new MismaLetra();
		
		assertEquals(2, x.getSimilarPages(xe, paginas).size());
	}

}
