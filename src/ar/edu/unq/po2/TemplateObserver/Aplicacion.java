package ar.edu.unq.po2.TemplateObserver;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {

	private List<Partido> partidos = new ArrayList<Partido>();
	private List<SecretarioDeNotificacion> secretarios = new ArrayList<SecretarioDeNotificacion>();

	public void suscribirDeporte(List<String> deportes,  Observer observer) {		
		if(this.haySecretarioConDeportes(deportes)) {
			this.secretarioCon(deportes).getObservers().addFirst(observer);
		} else {
			this.secretarios.add(new SecretarioDeporte(observer, deportes));
		}
	}
	
	public void suscribirEquipo(List<String> equipo, Observer observer) {
		if(this.haySecretarioConEquipo(equipo)) {
			this.secretarioCon(equipo).getObservers().addFirst(observer);
		} else {
			this.secretarios.add(new SecretarioEquipo(observer, equipo));
		}
	}
	
	public boolean haySecretarioConEquipo(List<String> equipo) {
		List<SecretarioDeNotificacion> se = this.secretarios.stream().filter(c->c.esSecretarioDeEquipo()).toList();
		return  se.stream().anyMatch(d->d.sonMismosIntereses(equipo));
	}

	/**
	 * PRECONDICION: EL SECRETARIO ESTA EN LA LISTA DE INTERESADOS
	 * */
	public SecretarioDeNotificacion  secretarioCon(List<String> deportes) {
		return this.getObservers().stream().filter(s->s.sonMismosIntereses(deportes)).toList().getFirst();
	}

	public boolean haySecretarioConDeportes(List<String> deportes) {
		List<SecretarioDeNotificacion> ds = this.secretarios.stream().filter(c->c.esSecretarioDeDeporte()).toList();
		return  ds.stream().anyMatch(d->d.sonMismosIntereses(deportes));
	}

	public void desuscribir(SecretarioDeNotificacion secretario) {
		this.secretarios.remove(secretario);
	}
	
	public void notificar(Partido partido) {
		for(SecretarioDeNotificacion x : this.getObservers()) {
			x.actualizar(partido);
		}
	}
	
	public void añadirPartido(Partido partido) {
		this.partidos .addFirst(partido);
		this.notificar(partido);
	}
	
	public List<Partido> getPartidos() {
		return partidos;
	}

	public List<SecretarioDeNotificacion> getObservers() {
		return secretarios;
	}
}
