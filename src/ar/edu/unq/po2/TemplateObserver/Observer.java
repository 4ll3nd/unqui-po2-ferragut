package ar.edu.unq.po2.TemplateObserver;

public interface Observer {
	public abstract void actualizar(Partido partido);
	public abstract void suscribirse(String aspecto); 
}