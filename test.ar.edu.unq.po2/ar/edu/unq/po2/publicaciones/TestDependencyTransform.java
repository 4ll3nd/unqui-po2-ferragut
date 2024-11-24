package ar.edu.unq.po2.publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.TemplateObserver.PublicacionesObserver.Articulo;
import ar.edu.unq.po2.TemplateObserver.PublicacionesObserver.DependencyTransform;
import ar.edu.unq.po2.TemplateObserver.PublicacionesObserver.Investigador;

class TestDependencyTransform {
	
	List<String> palabrasClaves = new ArrayList<String>();
	Articulo gobstones;
	List<String> interes;
	Investigador alex;
	@BeforeEach
	void setUp() throws Exception {
		palabrasClaves.add("gobs");
		palabrasClaves.add("stone");
		gobstones = mock(Articulo.class);
		interes = Arrays.asList("Gobstones", "Walte Sun", "gobs", "stone");
		alex = mock(Investigador.class);
	}

	@Test
	void testNotificarASuInvestigador() {

		when(gobstones.getAutor()).thenReturn("Walte Sun");
		when(gobstones.getFiliacion()).thenReturn("Fox");
		when(gobstones.getLugarDePublicacion()).thenReturn("Korea");
		when(gobstones.getTipo()).thenReturn("Desarrollo");
		when(gobstones.getTitulo()).thenReturn("Gobstones");
		when(gobstones.getPalabrasClave()).thenReturn(palabrasClaves);
		
		DependencyTransform x = new DependencyTransform(alex, interes);
		
		x.update(gobstones);
		
		verify(alex).aviso(gobstones);
	}
	
	@Test
	void testNoNotificarASuInvestigador() {
		when(gobstones.getAutor()).thenReturn("1");
		when(gobstones.getFiliacion()).thenReturn("2");
		when(gobstones.getLugarDePublicacion()).thenReturn("3");
		when(gobstones.getTipo()).thenReturn("4");
		when(gobstones.getTitulo()).thenReturn("5");
		when(gobstones.getPalabrasClave()).thenReturn(palabrasClaves);
		
		DependencyTransform x = new DependencyTransform(alex, Arrays.asList("Panini", "Ivrea"));
		
		x.update(gobstones);
		
		verify(alex, never()).aviso(gobstones);
	}
}
