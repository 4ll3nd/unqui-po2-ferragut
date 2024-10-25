package ar.edu.unq.po2.solid;

public class Propiedad extends PropiedadAbstracta{
	
	private double valorFiscal;
	
	public Propiedad(String direccion, double valorFiscal) {
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}
	
	public double getValorFiscal() {
		return valorFiscal;
	}

}
