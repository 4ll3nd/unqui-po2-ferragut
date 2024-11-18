package ar.edu.unq.po2.TemplateObserver;

import java.util.List;

public class Porciones implements Parcela {
	
	private List<Parcela> parcelas;

	public Porciones(List<Parcela> parcelas) {
		this.parcelas = parcelas;
	}
	
	@Override
	public double gananciasAnuales() {
		return this.getParcelas().stream().mapToDouble(p -> p.gananciasAnuales()).sum();
	}

	public void añadirParcela(Parcela x) {
		this.parcelas.addLast(x);
	}
	
	public void quitarParcela() {
		this.parcelas.removeLast();
	}
	
	public List<Parcela> getParcelas() {
		return parcelas;
	}
}
