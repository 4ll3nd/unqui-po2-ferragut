package ar.edu.unq.po2.TestEnums;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.EnumStreams.ActividadSemanal;
import ar.edu.unq.po2.EnumStreams.Deporte;
import ar.edu.unq.po2.EnumStreams.DiaDeLaSemana;

class TestActividadSemanal {
	
	private ActividadSemanal futbol;
	private ActividadSemanal basket;
	private ActividadSemanal running;
	private ActividadSemanal jabalina;
	
	@BeforeEach
	void setUp() {
		futbol = new ActividadSemanal(DiaDeLaSemana.Lunes, 12, 3 ,Deporte.Futbol);
		basket = new ActividadSemanal(DiaDeLaSemana.Lunes, 12, 3 ,Deporte.Basket);
		running = new ActividadSemanal(DiaDeLaSemana.Lunes, 12, 3 ,Deporte.Running);
		jabalina = new ActividadSemanal(DiaDeLaSemana.Lunes, 12, 3 ,Deporte.Jabalina);
}
	
	private List<ActividadSemanal> todasLasActividadesDeFutbol(List<ActividadSemanal> actividades) {
		return actividades.stream().filter(a -> a.getDeporte() == Deporte.Futbol).toList();
	}
	
	@Test
	void testTodasLasActividadesDeFutbol() {
		List<ActividadSemanal> actividades =  Arrays.asList(futbol, futbol, basket, running);
		assertEquals(2, this.todasLasActividadesDeFutbol(actividades).size());
	}
	
	@Test
	void testActividadesDeComplejidad() {
		List<ActividadSemanal> actividades =  Arrays.asList(futbol, futbol, basket, running);
		
		assertEquals(1, this.todasLasActividadesDeComplejidad(1 , actividades).size());
	}

	private List<ActividadSemanal> todasLasActividadesDeComplejidad(int i, List<ActividadSemanal> actividades) {
		return actividades.stream().filter(a -> a.getDeporte().getComplejidad() == i).toList();
	}
}
