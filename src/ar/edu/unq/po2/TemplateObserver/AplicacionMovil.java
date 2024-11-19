package ar.edu.unq.po2.TemplateObserver;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMovil implements Observer{

	private List<String> resultados = new ArrayList<String>();
	private SecretarioDeNotificacion secretario;

	public AplicacionMovil() {
		secretario = new SecretarioDeNotificacion(this, new Aplicacion());
	}
	
	public SecretarioDeNotificacion getSecretario() {
		return secretario;
	}
	
	public void actualizar(Partido partido) {
		resultados.addFirst(partido.getResultado());
	}

	public List<String> getResultados() {
		return resultados;
	}	
	
	public void suscribirse(String partido) {
		this.getSecretario().setInteres(partido);
	}
}
