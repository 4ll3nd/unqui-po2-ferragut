package ar.edu.unq.po2.solid;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private int edad;
	private double sueldoNeto;
	private Propiedad propiedad;
	
	public Cliente(String nombre, String apellido, int edad, double sueldo, Propiedad propiedad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoNeto = sueldo;
		this.edad = edad;
		this.propiedad = propiedad;
	}
	
	public int getEdad() {
		return edad;
	}


	public double getSueldoNetoMensual() {
		return sueldoNeto;
	}


	public Propiedad getPropiedad() {
		return propiedad;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}

	public void realizarSolicitud(Banco banco, Solicitud solicitud) {
		banco.agregarSolicitud(solicitud);
	}

}
