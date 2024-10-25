package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura{
private double tasaDeServicio;
	
	public Impuesto(double x) {
		this.tasaDeServicio = x;
	}
	
	public double montoAPagar() {
		return tasaDeServicio;
	}
}
