package ar.edu.unq.po2.templateAdapter;

import java.util.List;

public class Pagina implements WikipediaPage{

	private String nombre;
	private List<Pagina> links;

	public Pagina(String nombre, List<Pagina> links) {
		this.nombre = nombre;
		this.links = links;
	}

	@Override
	public String getTittle() {
		return nombre;
	}

	@Override
	public List<Pagina> getLinks() {
		return links;
	}

}
