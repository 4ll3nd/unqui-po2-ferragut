package ar.edu.unq.po2.StateStrategy.maquinaDeJuegos;

public class ConUnaFicha extends Estado {

	public String botonInicio() {
		return this.avisoUnJugadorInicio();
	}

	private String avisoUnJugadorInicio() {
		return "Jugador Uno, Listo";
	}

}
