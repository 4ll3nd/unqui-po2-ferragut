package ar.edu.unq.po2.EnumStreams;

public enum Deporte {
	Running, Futbol, Basket, Tennis, Jabalina;
	
	int complejidad;
	
	static {
		Running.complejidad = 1;
		Futbol.complejidad = 2;
		Basket.complejidad = 2;
		Tennis.complejidad = 3; 
		Jabalina.complejidad = 4;
	}
	
	public int getComplejidad() {
		return complejidad;
	}
	
}
