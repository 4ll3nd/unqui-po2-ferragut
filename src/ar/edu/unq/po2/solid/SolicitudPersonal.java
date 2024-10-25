package ar.edu.unq.po2.solid;

public class SolicitudPersonal extends Solicitud{

	public SolicitudPersonal(Cliente emisor, double monto, int plazoEnMeses) {
		super(emisor, monto, plazoEnMeses);
	}
	
	@Override
	public boolean cuotaNoSuperaSueldo() {
		return this.SetentaPorcientoDelSueldo() >= this.getMonto(); 
	}
	
	public boolean tieneIngresosAceptables() {
		return (this.getEmisor().getSueldoNetoMensual() * 12) > 15000;
	}
	
	private double SetentaPorcientoDelSueldo() {
		return (getEmisor().getSueldoNetoMensual() * 70 / 100);
	}

	@Override
	public boolean esSolicitudAceptable() {
		return this.cuotaNoSuperaSueldo() && this.tieneIngresosAceptables();
	}
	
}
