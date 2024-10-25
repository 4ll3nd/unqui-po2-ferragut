package ar.edu.unq.po2.solid;

public class SolicitudHipotecaria extends Solicitud{

	private Propiedad propiedad;
	
	public SolicitudHipotecaria(Cliente emisor, double monto, int plazoEnMeses, Propiedad propiedad) {
		super(emisor, monto, plazoEnMeses);
		this.propiedad = propiedad;
	}
	
	@Override
	public boolean cuotaNoSuperaSueldo() {
		return this.valorDeUnaCuota() <= this.cincuentaPorcientoDeSueldo();
	}
	
	private double valorDeUnaCuota() {
		return this.getMonto() / this.getPlazo();
	}
	
	private double cincuentaPorcientoDeSueldo() {
		return this.getEmisor().getSueldoNetoMensual() * 50 / 100;
	}
	
	public PropiedadAbstracta getPropiedad() {
		return propiedad;
	}

	public boolean montoNoEsMayorAValorFiscal() {
		return this.getMonto() <= this.setentaPorcientoDeValorFiscal();
	}
	
	private double setentaPorcientoDeValorFiscal() {
		return this.getPropiedad().getValorFiscal() * 70 / 100;
	}

	@Override
	public boolean esSolicitudAceptable() {
		return this.montoNoEsMayorAValorFiscal() && this.cuotaNoSuperaSueldo();
	}

}
