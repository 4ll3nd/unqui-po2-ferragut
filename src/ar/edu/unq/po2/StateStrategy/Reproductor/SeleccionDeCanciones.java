package ar.edu.unq.po2.StateStrategy.Reproductor;

public class SeleccionDeCanciones extends ReproductorEstado {

	@Override
	public void play(Song x, Reproductor y) {
		x.play();
		y.setEstado(new Reproduccion());
	}

	@Override
	public void stop(Song x, Reproductor y) {
		System.out.print("Error");
	}

	@Override
	public void pause(Song x, Reproductor x) {
		System.out.print("Error");
	}
}
