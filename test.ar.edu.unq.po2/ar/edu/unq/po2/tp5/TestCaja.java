package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestCaja {
	
	@Test
	void testCalcularMonto() {
		List<Producto> pedido = new ArrayList<Producto>();
		pedido.add(new ProductoTradicional(20,"x"));
		pedido.add(new ProductoCooperativa(50, "y"));
		pedido.add(new ProductoCooperativa(50, "z"));
		
		Caja x = new Caja(new MercadoCentral(pedido));
		
		assertEquals(110, x.calcularMonto(pedido));
		
	}
	
	@Test
	void informarCliente() {
		List<Producto> pedido = new ArrayList<Producto>();
		pedido.add(new ProductoTradicional(20,"x"));
		pedido.add(new ProductoCooperativa(50, "y"));
		pedido.add(new ProductoCooperativa(50, "z"));
		Cliente x = new Cliente(pedido);
		Caja y    = new Caja(new MercadoCentral(pedido));
		
		y.informarMonto(x, y.calcularMonto(x.getPedido()));
		
		assertEquals(110, x.getMonto());
		
	}
	
	@Test
	void comprobarRecaudadoraLuegoDeRegistrarPagoDeUnImpuesto() {
		Caja x = new Caja(new Recaudadora());
		Impuesto ganancias = new Impuesto(300.0);
		
		x.registrarPago(ganancias);
		double dineroAlRegistrar = x.getRecaudadora().getDineroRegistrado();
		
		assertEquals(300.0, dineroAlRegistrar);
	}
	
	@Test 
	void comprobarRecaudadoraLuegoDeRegistrarPagoDeUnServicio() {
		Caja x = new Caja(new Recaudadora());
		 Servicio internet = new Servicio(300.0, 3);
		 
		 x.registrarPago(internet);
		 double dineroAlRegistrar = x.getRecaudadora().getDineroRegistrado();
		 
		 assertEquals(900.0, dineroAlRegistrar);
	}
	
}
