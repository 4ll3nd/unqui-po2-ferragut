package ar.edu.unq.po2.tp5;

public class Servicio extends Factura{
	private double costoPorUnidad;
	private int cantDeUnidades;
	
	public Servicio(double precioDeUnidad, int cantDeUnidades) {
		this.costoPorUnidad = precioDeUnidad;
		this.cantDeUnidades = cantDeUnidades;
	}
	
	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}
	
	public int getCantDeUnidades() {
		return cantDeUnidades;
	}
	
	public double montoAPagar() {
		return this.getCostoPorUnidad() * this.getCantDeUnidades();
	}
	
}
