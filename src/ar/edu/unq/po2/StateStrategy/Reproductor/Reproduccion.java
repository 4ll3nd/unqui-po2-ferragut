package ar.edu.unq.po2.StateStrategy.Reproductor;

public class Reproduccion extends ReproductorEstado {

	@Override
	public void play(Song x, Reproductor y) {
		System.out.print("Error");
	}

	@Override
	public void stop(Song x, Reproductor y) {
		x.stop();
		y.setEstado(new SeleccionDeCanciones());
	}

	@Override
	public void pause(Song x, Reproductor y) {
		x.pause();
		y.setEstado(new Pausa());
	}
}
