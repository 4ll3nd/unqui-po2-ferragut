package ar.edu.unq.po2.solid;

public abstract class PropiedadAbstracta {
	protected String direccion;
	
	public String getDireccion() {
		return direccion;
	}
	public abstract double getValorFiscal();
}
