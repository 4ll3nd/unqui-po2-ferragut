package ar.edu.unq.po2.StateStrategy.maquinaDeJuegos;

public class ConDosFichas extends Estado {

	@Override
	public String botonInicio() {
		return this.avisoInicioParaDosJugadores();
	}

	private String avisoInicioParaDosJugadores() {
		return "Jugador Dos, Listo";
	}

}
