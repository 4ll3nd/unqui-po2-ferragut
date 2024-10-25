package ar.edu.unq.po2.tp5;

import java.util.List;

public class MercadoCentral {
	
	private List<Producto> stock;
	
	public MercadoCentral() {
	}
	
	public MercadoCentral(List<Producto> st) {
		this.stock = st;
	}
	
	public List<Producto> getStock() {
		return stock;
	}

	public int cantDeStock() {
		return this.getStock().size();
	}
	
	private void setStock(List<Producto> st) {
		this.stock = st;
	} 
	
	public void eliminarStock(List<Producto> elementosABorrar) {
		this.setStock(this.restarStock(elementosABorrar));
	}
	
	private List<Producto> restarStock(List<Producto> st) {
		List<Producto> newStock = this.getStock();
		for(Producto x: st) {
			newStock.remove(x);
		}
		return newStock;
	}
}
