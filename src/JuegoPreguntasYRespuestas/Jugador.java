package JuegoPreguntasYRespuestas;

import java.util.List;


public class Jugador {
	
	private String nombre;
	private int puntos = 0;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPuntos() {
		return puntos;
	}
	
	public void recibirEnunciado(List<String> preguntas) {
		
	}
	
	public void avisoDeRespuestaCorrecta() {
		System.out.print("tu respuesta es correcta");
	}
	
	public void avisoDeRespuestaIncorrecta() {
		System.out.print("tu respuesta es incorrecta");
	}

	public void enviarRespuesta(SistemaJuego juego, String enunciado, String respuesta) {
			juego.recibirRespuesta(this, enunciado, respuesta);
	}

	public void OtroRespondioCorrectamente(String nombre, String enunciado) {
			System.out.print("El jugador:  " + nombre + "Respondio Correctamente A La Pregunta:_" + enunciado);
	}
	
}
