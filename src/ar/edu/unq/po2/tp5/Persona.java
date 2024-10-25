package ar.edu.unq.po2.tp5;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Identidad{

	private String nombre;
	private LocalDate fechaDeNacimiento;

	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int getEdad() {
		return Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
	}
	
}
