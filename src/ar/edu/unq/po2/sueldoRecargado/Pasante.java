package ar.edu.unq.po2.sueldoRecargado;

public class Pasante extends Empleado {
	
	
	private int horasExtras;

	public Pasante(int horaxExtras) {
		this.horasExtras = horaxExtras;
	}

	@Override
	protected double retenciones() {
		return (this.getHorasExtras() * 40) * 0.13;
	}

	@Override
	protected double bonificacionPorHijoOCasado() {
		return 0;
	}

	@Override
	protected double horasExtras() {
		return 40 * this.getHorasExtras() ;
	}

	@Override
	protected double sueldoBasico() {
		return 0;
	}
	
	public double getHorasExtras() {
		return horasExtras;
	}	
}
