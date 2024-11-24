package ar.edu.unq.po2.TemplateObserver;

import java.util.List;

public abstract class SecretarioDeNotificacion implements Observer{
	
	private List<Observer> observer;
	
	public  List<Observer> getObservers() {
		return observer;
	}
	
	public void actualizar(Partido partido) {
		this.notificar(partido);
	}
	
	public abstract boolean  esDeInteres(Partido partido);
	
	public boolean esSecretarioDeDeporte() {
		return false;
	}
	
	public boolean esSecretarioDeEquipo() {
		return false;
	}	
	
	public boolean esSecretarioDeTodo() {
		return false;
	}	
	
	public void notificar(Partido partido) {
		if(this.esDeInteres(partido) ) {
			this.getObservers().stream().forEach(o->o.actualizar(partido));
		}
	}

	public abstract boolean  sonMismosIntereses(List<String> deportes);
}
