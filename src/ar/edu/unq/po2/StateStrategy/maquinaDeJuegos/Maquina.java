package ar.edu.unq.po2.StateStrategy.maquinaDeJuegos;

public class Maquina {
	private Estado estado;

	public Maquina() {
		this.ingresarFicha(new SinFichas());
	}

	public Estado getEstado() {
		return estado;
	}
	
	public void encender() {
		this.estado = new Encendido();
	}
	
	public void apagar() {
		this.estado = new Apagado();
	}
	
	public void ingresarFicha(Estado estadoPorFicha) {
		this.estado = estadoPorFicha;
	}
	
	public String botonInicio() {
		return this.getEstado().botonInicio();
	}

	public void terminarJuego() {
		this.estado = new SinFichas();
	}
}
