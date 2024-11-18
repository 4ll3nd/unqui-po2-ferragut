package ar.edu.unq.po2.TemplateObserver.PublicacionesObserver;

import java.util.List;

public class Articulo {
	
	String titulo;
	String autor; 
	String filiacion;
	String tipo;
	String lugarDePublicacion;
	List<String> palabrasClave;
	
	public Articulo(String titulo, String autor, String filiacion, String tipo, String lugarDePublicacion, List<String> palabrasClave) {
		this.titulo = titulo;
		this.autor = autor;
		this.filiacion = filiacion;
		this.tipo = tipo;
		this.lugarDePublicacion = lugarDePublicacion;
		this.palabrasClave = palabrasClave;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getFiliacion() {
		return filiacion;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String lugarDePublicacion() {
		return lugarDePublicacion;
	}
	
	public List<String> getPalabrasClave() {
		return palabrasClave;
	}
}
