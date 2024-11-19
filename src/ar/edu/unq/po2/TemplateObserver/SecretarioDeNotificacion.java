package ar.edu.unq.po2.TemplateObserver;

public class SecretarioDeNotificacion {
	
	private String interes;
	private Observer observer;
	private Aplicacion aplicacion;

	public SecretarioDeNotificacion(Observer x, Aplicacion y) {
		this.observer = x;
		this.aplicacion = y;
	}
	
	public void setInteres(String x) {
		interes = x;
		this.getAplicacion().suscribir(this);
	}
	
	public Aplicacion getAplicacion() {
		return aplicacion;
	}
	
	public  Observer getObserver() {
		return observer;
	}
	
	public String getInteres() {
		return interes;
	}
	
	public boolean esDeInteres(Partido partido) {
		return partido.getDeporte().equalsIgnoreCase(interes);
	}
	
	public void notificarSiEsDeInteres(Partido partido) {
		if(this.esDeInteres(partido) ) {
			this.getObserver().actualizar(partido);
		}
	}
}
