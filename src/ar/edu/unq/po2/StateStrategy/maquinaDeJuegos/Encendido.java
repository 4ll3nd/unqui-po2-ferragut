package ar.edu.unq.po2.StateStrategy.maquinaDeJuegos;

public class Encendido extends Estado {

	@Override
	public String botonInicio() {
		return this.cartelIngresarFichas();
	}

	private String cartelIngresarFichas() {
		return "¡Ingresar Fichas!";
	}

}
