package ar.edu.unq.po2.tp5;

import java.util.List;

public class Cliente {
	
	private List<Producto> pedido;

	private double monto;

	public Cliente(List<Producto> ps) {
		this.pedido = ps;
		this.monto = 0.0;
	}
	
	public List<Producto> getPedido() {
		return pedido;
	}
	
	public int cantDeProductos() {
		return this.getPedido().size();
	}

	public double getMonto() {
		return monto;
	}

	public void setMontoDeCompra(double d) {
		this.monto = d;
	}

}
