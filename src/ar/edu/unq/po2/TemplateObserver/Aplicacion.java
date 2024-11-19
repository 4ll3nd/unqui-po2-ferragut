package ar.edu.unq.po2.TemplateObserver;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {

	private List<Partido> partidos = new ArrayList<Partido>();
	private List<SecretarioDeNotificacion> secretarios;

	public void suscribir(SecretarioDeNotificacion secretario) {		
		secretarios.addFirst(secretario);
	}
	
	public void desuscribir(SecretarioDeNotificacion secretario) {
		this.secretarios.remove(secretario);
	}
	
	public void notificar() {
		for(SecretarioDeNotificacion x : this.getInteresados()) {
			x.notificarSiEsDeInteres(this.getPartidos().getFirst());
		}
	}
	
	public void añadirPartido(Partido partido) {
		this.partidos .addFirst(partido);
		this.notificar();
	}
	
	public List<Partido> getPartidos() {
		return partidos;
	}

	public List<SecretarioDeNotificacion> getInteresados() {
		return secretarios;
	}
	
}
