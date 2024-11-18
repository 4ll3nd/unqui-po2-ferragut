package ar.edu.unq.po2.TemplateObserver.PublicacionesObserver;

import java.util.List;

public class Investigador {
	private List<String> intereses;

	public Investigador(List<String> intereses) {
		this.intereses = intereses;
	}
	
	public List<String> getIntereses() {
		return intereses;
	}
	
	public void aviso() {
		System.out.print("Hay un postulado de su interes!");
	}
	
}
