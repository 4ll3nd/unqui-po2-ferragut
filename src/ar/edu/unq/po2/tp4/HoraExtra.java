package ar.edu.unq.po2.tp4;

public class HoraExtra {

	private int valor;
	private int cantDeHoras;

	public HoraExtra(int i, int j) {
		this.cantDeHoras = j;
		this.valor = i;
	}

	public int getCantDeHoras() {
		return cantDeHoras;
	}

	public int getValor() {
		return valor;
	}

	public int montoPorHoras() {
		return (this.getValor() * this.getCantDeHoras());
	}

}
