package ar.edu.unq.po2.TemplateObserver;

import java.util.ArrayList;
import java.util.List;

public class SecretarioEquipo extends SecretarioDeNotificacion {

	private List<String> interes;	
	private List<Observer> observers = new ArrayList<Observer>();
	
	public SecretarioEquipo(Observer x, List<String> interes) {
		this.interes = interes;
		this.observers.addFirst(x);
	}
	
	public List<String> getInteres() {
		return interes;
	}

	@Override
	public boolean esDeInteres(Partido partido) {
		boolean sonLosMismoContrincantes = false;;
		for(String c : partido.getContricantes()) {
			sonLosMismoContrincantes = this.interes.stream().allMatch(c1->c1.equalsIgnoreCase(c));
		}
		return sonLosMismoContrincantes;
	}
	
	public boolean esSecretarioEquipo() {
		return true;
	}
	
	@Override
	public boolean  sonMismosIntereses(List<String> equipo) {
		boolean sonIguales = false;
		for(String  in : this.interes) {
			sonIguales = equipo.stream().allMatch(d->d.equals(in));
		}
		return sonIguales;
	}
}
