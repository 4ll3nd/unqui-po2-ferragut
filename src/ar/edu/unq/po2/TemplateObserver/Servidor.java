package ar.edu.unq.po2.TemplateObserver;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements Observer{
	
	private List<Partido> partidos = new ArrayList<Partido>();
	private SecretarioDeNotificacion secretario;

	public Servidor(){
		secretario = new SecretarioDeNotificacion(this, new Aplicacion() );
	} 
	
	public SecretarioDeNotificacion getSecretario() {
		return secretario;
	}
	
	public void suscribirse(String deporte) {
		this.getSecretario().setInteres(deporte);
	}
	
	public void actualizar(Partido partido) {
		this.partidos.add(partido);	
	}

	public List<Partido> getPartidos() {
		return partidos;
	}
}
