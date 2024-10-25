package ar.edu.unq.po2.tp5;

public class ProductoTradicional extends Producto{

	public ProductoTradicional(double precio, String nombre) {
		this.precio = precio;
		this.nombre = nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public String getNombre() {
		return nombre;
	}
}
