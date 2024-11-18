package ar.edu.unq.po2.sueldoRecargado;

public class Planta extends Empleado {

	private int cantHIjos;
	private double sueldoBasico = 3000;

	public Planta(int hijos) {
		this.cantHIjos = hijos;
	}

	@Override
	protected double retenciones() {
		return this.getSueldoBasico() * 0.13;
	}
	
	public double getSueldoBasico() {
		return sueldoBasico;
	}
	
	@Override
	protected double bonificacionPorHijoOCasado() {
		return this.getCantiDeHijos() * 150;
	}

	@Override
	protected double horasExtras() {
		return 0;
	}

	@Override
	protected double sueldoBasico() {
		return sueldoBasico;
	}
	
	public int getCantiDeHijos() {
		return cantHIjos;
	}
}
