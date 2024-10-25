package ar.edu.unq.po2.tp4;

public class Impuesto {

	public Double porcentaje;
	
	public Impuesto() {
		this.porcentaje = 0.2;
	}
	
	public Double getPorcentaje() {
		return porcentaje;
	}

	public Double retencionPara(double i) {
		return i * this.getPorcentaje();
	}

}
