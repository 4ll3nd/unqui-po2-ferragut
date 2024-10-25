package ar.edu.unq.po2.TestTemplateAdapter;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.templateAdapter.LinkEnComun;
import ar.edu.unq.po2.templateAdapter.Pagina;

class TestLinksEnComun {

	@Test
	void testProbarFiltro() {
	    List<Pagina> links = Arrays.asList(mock(Pagina.class), mock(Pagina.class), mock(Pagina.class));
	    List<Pagina> otros = Arrays.asList(new Pagina("3", links), new Pagina("4", links));
	    List<Pagina> paginas = Arrays.asList(new Pagina("xe", links), new Pagina("ye", links), new Pagina("xe", links));
		Pagina xe = new Pagina("xe", otros);
	    
		LinkEnComun x = new LinkEnComun();
		
		assertEquals(0, x.getSimilarPages(xe, paginas).size());
	}

}
