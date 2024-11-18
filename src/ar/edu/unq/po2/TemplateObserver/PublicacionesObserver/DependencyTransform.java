package ar.edu.unq.po2.TemplateObserver.PublicacionesObserver;

import java.util.List;

public class DependencyTransform {
	private Investigador investigador;
	private List<String> intereses;

	public DependencyTransform(Investigador x) {
		this.investigador = x;
		this.intereses = x.getIntereses();
	}

	public Investigador getInvestigador() {
		return investigador;
	}

	public List<String> getIntereses() {
		return intereses;
	}
	
	public boolean cumpleIntereses(Articulo x) {
		return this.getIntereses().stream().anyMatch(p -> this.tieneAlgunaPropiedadEnComun(x, p));
	}
	
	private boolean tieneAlgunaPropiedadEnComun(Articulo x, String p) {
		return x.getAutor() == p || x.getTitulo() == p || x.getFiliacion() == p ||
				x.getTipo() == p || x.getPalabrasClave().stream().anyMatch(clave -> clave == p);
	}

	public void notificarInvestigador() {
		investigador.aviso();
	}
	
}
