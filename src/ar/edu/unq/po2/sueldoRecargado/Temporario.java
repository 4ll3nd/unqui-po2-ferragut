package ar.edu.unq.po2.sueldoRecargado;

public class Temporario extends Empleado {

	private double sueldoBasico = 1000.0;
	private int horasExtras;
	private int cantHijos;
	private boolean esCasado;

	public Temporario( int horasExtras, int hijos, boolean esCasado) {
		this.horasExtras = horasExtras;
		this.cantHijos = hijos;
		this.esCasado = esCasado;
	}
	
	public double getSueldoBasico() {
		return sueldoBasico;
	}
	
	public int getHorasExtras() {
		return horasExtras;
	}
	
	public int getCantHijos() {
		return cantHijos;
	}
	
	public boolean getEsCasado() {
		return esCasado;
	}
 	
	@Override
	protected double retenciones() {
		return this.getSueldoBasico()*0.13;
	}

	@Override
	protected double bonificacionPorHijoOCasado() {
		if (this.getCantHijos() > 0 || this.getEsCasado()) {
			return 100.0; 
		}
		return 0;
	}

	@Override
	protected double horasExtras() {
		return 5 * this.getHorasExtras();
	}

	@Override
	protected double sueldoBasico() {
		return this.getSueldoBasico();
	}

}
