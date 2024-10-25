package ar.edu.unq.po2.tp3;

import java.util.Date;

public class Persona {
	private String nombre;
	private Date fechaDeNacimiento;
	private int edad;
	
	public Persona(String nombre, Date fechaDeNacimiento, int edad) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.edad = edad;
	}

	public Persona(String nombre, Date fechaNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	/*
	 * DUDA: como intancio la fecha actual para obtener la edad?
	 * public int edad() {
		this.getFechaDeNacimiento().from(new Date(2024));
	}
	 * */
	
	public Boolean menorQue(Persona persona) {
		return(this.edad < persona.edad);
	}
	
	
	
}
