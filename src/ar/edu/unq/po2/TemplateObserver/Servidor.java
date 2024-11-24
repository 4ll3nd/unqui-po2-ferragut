package ar.edu.unq.po2.TemplateObserver;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements Observer{
	
	private List<Partido> partidos = new ArrayList<Partido>();
	
	public void actualizar(Partido partido) {
		this.partidos.add(partido);	
	}

	public List<Partido> getPartidos() {
		return partidos;
	}
}
