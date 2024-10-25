package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMercadoCentral {
	
	@Test
	void testInicializacion() {
		List<Producto> st = new ArrayList<Producto>();
		st.add(new ProductoTradicional(20,"x"));
		st.add(new ProductoCooperativa(50, "y"));
		
		MercadoCentral m = new MercadoCentral(st);
		
		assertEquals(2, m.cantDeStock());
		
	}
	
	@Test
	void testEliminarStock() {
		List<Producto> stock = new ArrayList<Producto>();
		ProductoTradicional harina = new ProductoTradicional(20,"x");
		ProductoCooperativa arroz = new ProductoCooperativa(50, "y");
		ProductoCooperativa pan = new ProductoCooperativa(50, "z");
		stock.add(harina);
		stock.add(arroz);
		stock.add(pan);
		
		List<Producto> elementosABorrar = new ArrayList<Producto>();
		elementosABorrar.add(harina);
		elementosABorrar.add(pan);
		
		MercadoCentral m = new MercadoCentral(stock);
		m.eliminarStock(elementosABorrar);
		
		assertEquals(1, m.cantDeStock());
	}
}
