package ar.edu.unq.po2.tp4;

public class Ingreso {

	
	
	private String mesDePercepcion;
	private double montoPercibido;
	private int horasExtrasTrabajadas;
	private HoraExtra horaExtra;
	private Impuesto impuesto;
	

	public Ingreso(String string, double d, int i) {
		this.mesDePercepcion = string;
		this.montoPercibido = d;
		this.horasExtrasTrabajadas = i;
		this.horaExtra = new HoraExtra(20, this.getHorasExtrasTrabajadas());
		this.impuesto = new Impuesto();
	}
	
	public String getMesDePercepcion() {
		return mesDePercepcion;
	}
	
	public double getMontoPercibido() {
		return montoPercibido;
	}
	
	public int getHorasExtrasTrabajadas() {
		return horasExtrasTrabajadas;
	}

	public HoraExtra getHoraExtra() {
		return horaExtra;
	}

	public Impuesto getImpuesto() {
		return impuesto;
	}

	public int valorDeHorasExtras() {
		return this.getHoraExtra().montoPorHoras();
	}

	public double valorDeImpuesto() {
		return this.getImpuesto().retencionPara(this.getMontoPercibido());
	}
	
	public void desglose() {
		System.out.println("Mes de percepcion: " + this.getMesDePercepcion());
		System.out.println("Concepto: ");
		System.out.println("Ingreso: " + this.getMontoPercibido());
		System.out.println("ingreso por horas extras: " + this.valorDeHorasExtras());
		System.out.println("ingreso por horas extras: " + this.valorDeImpuesto());
	}
}
