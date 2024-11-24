package ar.edu.unq.po2.TemplateObserver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class SecretarioDeporte extends SecretarioDeNotificacion {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private List<String> interes;

	public SecretarioDeporte(Observer x, List<String> interes) {
		this.observers.add(x);
		this.interes = interes;
	}
	
	public List<Observer> getObserver() {
		return observers;
	}
	
	public List<String> getInteres() {
		return interes;
	}
	
	@Override
	public void actualizar(Partido partido) {
		this.notificar(partido);
	}
	
	@Override
	public boolean esDeInteres(Partido partido) {
		return this.interes.stream().anyMatch(d->d.equals(partido.getDeporte()));
	}
	
	public boolean esSecretarioDeDeporte() {
		return true;
	}

	@Override
	public boolean  sonMismosIntereses(List<String> deportes) {
		boolean sonIguales = false;
		for(String  in : this.interes) {
			sonIguales = deportes.stream().allMatch(d->d.equals(in));
		}
		return sonIguales;
	}
}