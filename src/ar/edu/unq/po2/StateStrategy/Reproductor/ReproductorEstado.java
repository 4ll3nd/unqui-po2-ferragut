package ar.edu.unq.po2.StateStrategy.Reproductor;

public abstract class ReproductorEstado {
	public abstract void play(Song x, Reproductor y);
	public abstract void stop(Song x, Reproductor y);
	public abstract void pause(Song x, Reproductor y);
}
