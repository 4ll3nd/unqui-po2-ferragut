package ar.edu.unq.po2.sueldoRecargado;

public abstract class Empleado {
	public double sueldo() {
		return this.sueldoBasico() + 
					  this.horasExtras() +
					  this.bonificacionPorHijoOCasado() -
					  this.retenciones();
	}

	protected abstract double retenciones();

	protected abstract double bonificacionPorHijoOCasado();

	protected abstract double horasExtras();

	protected abstract double sueldoBasico();
}
