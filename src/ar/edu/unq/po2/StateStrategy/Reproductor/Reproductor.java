package ar.edu.unq.po2.StateStrategy.Reproductor;

import java.util.List;

public class Reproductor {

	private ReproductorEstado estado;
	private List<Song> canciones;
	
	public Reproductor(List<Song> canciones) {
		this.estado = new SeleccionDeCanciones();
		this.canciones = canciones;
	}
	
	/***PRECONDICION: no usar un indice mayor a la longitud
	 * de la lista de canciones*/
	public Song seleccionarCancion(int x) {
		return this.getCanciones().get(x);
	}
	
	public ReproductorEstado getEstado() {
		return estado;
	}
	
	public void setEstado(ReproductorEstado x) {
		this.estado = x;
	}

	public List<Song> getCanciones() {
		return canciones;
	}
	
	public void play(Song cancion) {
		this.getEstado().play(cancion, this);
	}
	
	public void stop(Song cancion) {
		this.getEstado().stop(cancion, this);
	}
	
	public void pause(Song cancion) {
		this.getEstado().pause(cancion, this);
	}
}
