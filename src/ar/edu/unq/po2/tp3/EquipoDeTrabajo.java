package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
	private List<Persona> integrantes = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String nombre, List <Persona> personas) {
		this.nombre = nombre;
		this.integrantes = personas;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public List<Persona> getIntegrantes() {
		return integrantes;
	}
	
	public int promedioDeEdad() {
		return sumatoriaDeEdadDeIntegrantes() / cantDeIntegrantes();
	}

	private int cantDeIntegrantes() {
		return this.getIntegrantes().size();
	}
	
	//falta implementar edad en la clase Persona
	private int sumatoriaDeEdadDeIntegrantes() {
		int sumatoria = 0;
		for(Persona integrante : this.getIntegrantes()) {
			sumatoria = sumatoria + integrante.edad;
		}
	}
	
	private void agregarAlEquipoDeTrabajo(Persona p) {
		this.integrantes.add(p);
	}
	
	
}