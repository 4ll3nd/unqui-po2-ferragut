package ar.edu.unq.po2.TemplateObserver;

import java.util.ArrayList;
import java.util.List;

public  class  AplicacionMovil implements Observer{

	private List<String> resultados = new ArrayList<String>();
	
	public void actualizar(Partido partido) {
		resultados.addFirst(partido.getResultado());
	}

	public List<String> getResultados() {
		return resultados;
	}	
}
