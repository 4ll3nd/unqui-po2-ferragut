package ar.edu.unq.po2.tp5;

public class Recaudadora {
	private double dineroRegistrado;
	
	public double getDineroRegistrado() {
		return dineroRegistrado;
	}
	
	private void setDineroRegistrado(double dinero) {
		this.dineroRegistrado = dinero;
	}
	
	public void actualizarDineroRegistrado(double dinero) {
		this.setDineroRegistrado(this.getDineroRegistrado() + dinero);
	}
}
