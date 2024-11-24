package ar.edu.unq.po2.TemplateObserver.PublicacionesObserver;

import java.util.ArrayList;
import java.util.List;

import JuegoPreguntasYRespuestas.Jugador;

public class Sistema {
	private List<Articulo> articulos = new ArrayList<Articulo>();
	private List<Interesado> interesados = new ArrayList<Interesado>();
	
	public void suscribirse(Interesado interesado) {
		this.interesados.add(interesado);
	}
	
	public List<Articulo> getArticulos() {
		return articulos;
	}
	
	public void desuscribir(Interesado interesado) {
		this.interesados.remove(interesado)
	}
	
	public void añadirArticulo(Articulo articulo) {
		this.articulos.add(articulo);
		this.notificar(articulo);
	}
	
	public List<Interesado> getInteresados() {
		return interesados;
	}
	
	public void notificar(Articulo articulo) {
		for(Interesado i: this.getInteresados()) {
			i.update(articulo);
		}
	}
	
} 
