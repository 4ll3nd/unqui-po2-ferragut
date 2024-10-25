package ar.edu.unq.po2.tp4;
import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();
	private double montoImponible;
	private double totalPercibido;
	private double impuestosAPagar;
	
	public void recibirRecibo(Ingreso ingreso) {
		this.ingresos.add(ingreso);
	}
	
	public double getMontoImponible() {
		double montoImponible = 0.00;
		for(Ingreso recibo: this.getIngresos()){
			montoImponible = montoImponible + recibo.getMontoPercibido();
		}
		return montoImponible;
	}

	public double getTotalPercibido() {
		double totalPercibido = 0.00;
		for(Ingreso recibo: this.getIngresos()){
			totalPercibido = totalPercibido + (recibo.getMontoPercibido() + recibo.valorDeHorasExtras());
		}
		return totalPercibido;
	}

	public double getImpuestosAPagar() {
		double impuestoAPagar = 0.00;
		for(Ingreso recibo: this.getIngresos()){
			impuestoAPagar = impuestoAPagar + recibo.valorDeImpuesto();
		}
		return impuestoAPagar;
	}

	public List<Ingreso> getIngresos() {
		return ingresos;
	}
	/*aca puedo usar un while pero no tengo el mensaje not, empty*/
	public int cantidadDeRecibos() {
		int cantDeRecibos = 0;
		for(@SuppressWarnings("unused") Ingreso recibo: this.getIngresos()) {
			cantDeRecibos = cantDeRecibos + 1;
		}
		return cantDeRecibos;
	}
}
