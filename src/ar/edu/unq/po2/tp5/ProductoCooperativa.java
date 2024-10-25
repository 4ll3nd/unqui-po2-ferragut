package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{

	public ProductoCooperativa(int precio, String nombre) {
		this.precio = precio;
		this.nombre = nombre;
	}
	
	/***
	 * get precio calcula el precio base el producto menos el 10% que se le aplica.
	 * **/
	public double getPrecio() {
		return this.precio -  (this.precio * 0.10); 
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
