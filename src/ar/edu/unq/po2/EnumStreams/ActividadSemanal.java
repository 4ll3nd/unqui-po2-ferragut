package ar.edu.unq.po2.EnumStreams;

public class ActividadSemanal {
	private DiaDeLaSemana diaDeLaSemana;
	private double horaDeInicio;
	private double duraccion;
	private Deporte deporte;

	public ActividadSemanal(DiaDeLaSemana dia, double horaDeInicio, double duraccion, Deporte deporte) {
		this.diaDeLaSemana = dia;
		this.horaDeInicio = horaDeInicio;
		this.duraccion = duraccion;
		this.deporte = deporte;
	}
	
	public DiaDeLaSemana getDiaDeLaSemana() {
		return diaDeLaSemana;
	}
	
	public double getDuraccion() {
		return duraccion;
	}
	
	public Deporte getDeporte() {
		return deporte;
	}
	
	public double costo() {
		/*tengo permitido delegar a diaDeLaSemana? sino tengo que usar un if
		 * este codigo me da asco... 2 return, un if, comportamiento repetido.
		 * */
		if(this.esDiaQueVale200Pesos(this.getDiaDeLaSemana())) {
			return (500 * this.getDuraccion()) + (200 * this.getDeporte().getComplejidad());
		} else {
			return (1000 * this.getDuraccion()) + (200 * this.getDeporte().getComplejidad());
		}
	}

	private boolean esDiaQueVale200Pesos(DiaDeLaSemana diaDeLaSemana) {
		return diaDeLaSemana == DiaDeLaSemana.Lunes || diaDeLaSemana == DiaDeLaSemana.Martes ||
			   diaDeLaSemana == DiaDeLaSemana.Miercoles;
	}
}
