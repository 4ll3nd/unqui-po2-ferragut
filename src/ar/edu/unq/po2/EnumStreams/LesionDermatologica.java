package ar.edu.unq.po2.EnumStreams;

public enum LesionDermatologica {
	
	Rojo(100), Gris(50), Amarillo(20), Miel(80);
	
	int nivelDeRiesgo;
	LesionDermatologica evolucionDeLesion;
	
	LesionDermatologica(int nivel) {
		this.nivelDeRiesgo = nivel;
	}
	
	static {
		Rojo.evolucionDeLesion = Amarillo;
		Gris.evolucionDeLesion = Miel;
		Amarillo.evolucionDeLesion = Gris;
		Miel.evolucionDeLesion = Rojo;
	}

	public int getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public LesionDermatologica getEvolucionDeLesion() {
		return evolucionDeLesion;
	}
}

