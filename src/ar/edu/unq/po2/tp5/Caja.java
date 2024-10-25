package ar.edu.unq.po2.tp5;

import java.util.List;

public class Caja implements Agencia {
	
	private MercadoCentral mercado;
	private Recaudadora recaudadora;
	
	public Caja(Recaudadora recaudadora) {
		this.recaudadora = recaudadora;
	}
	
	public Recaudadora getRecaudadora() {
		return recaudadora;
	}
	
	public Caja(MercadoCentral mercado) {
		this.mercado = mercado;
	}
	
	public double calcularMonto(List<Producto> pedido) {
		double monto = 0.0;
		for(Producto p: pedido) {
			monto = monto + p.getPrecio();
		}
		return monto;
	}

	public void informarMonto(Cliente x, double montoAInformar) {
		x.setMontoDeCompra(montoAInformar);
	}
	
	public void decrementarStock(List<Producto> pedido) {
		this.getMercado().eliminarStock(pedido);
	}
	
	public void registrarPedidos(List<Producto> pedido, Cliente x) {
		this.informarMonto(x, this.calcularMonto(pedido));
		this.decrementarStock(pedido);
	}
	
	public MercadoCentral getMercado() {
		return mercado;
	}

	@Override
	public void registrarPago(Factura factura) {
		this.getRecaudadora().actualizarDineroRegistrado(factura.montoAPagar());
	}	
}
