package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestCliente {
	
	@Test
	void testInicializacion() {
		List<Producto> ps = new ArrayList<Producto>();
		ps.add(new ProductoTradicional(20,"x"));
		ps.add(new ProductoCooperativa(50, "y"));
			
		Cliente x = new Cliente(ps);
		
		assertEquals(2, x.cantDeProductos());
		assertEquals(0.0, x.getMonto());
	}
	
	@Test
	void testSetMontoDeCompra() {
		List<Producto> ps = new ArrayList<Producto>();
		ps.add(new ProductoTradicional(20,"x"));
		ps.add(new ProductoCooperativa(50, "y"));
		
		Cliente x = new Cliente(ps);
		x.setMontoDeCompra(100.0);
		
		assertEquals(100.0, x.getMonto());
	}

}
