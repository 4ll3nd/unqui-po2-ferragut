package ar.edu.unq.po2.solid;

public abstract class Solicitud {
	private Cliente emisor;
	private double monto;
	private int plazo;
	
	public Solicitud(Cliente cliente, double monto, int plazo) {
		this.emisor = cliente;
		this.monto = monto;
		this.plazo = plazo;
	}
	
	public Cliente getEmisor() {
		return emisor;
	}
	
	public double getMonto() {
		return monto;
	}
	
	public int getPlazo() {
		return plazo;
	}
	
	public abstract boolean cuotaNoSuperaSueldo();
	
	public abstract boolean esSolicitudAceptable();
	
}
