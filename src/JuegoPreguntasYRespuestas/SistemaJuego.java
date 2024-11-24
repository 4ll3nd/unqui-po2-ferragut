package JuegoPreguntasYRespuestas;

import java.util.ArrayList;
import java.util.List;

public class SistemaJuego {
	private List<Pregunta> preguntas;
	private List<Jugador> jugadores = new ArrayList<Jugador>();
	public SistemaJuego(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

	public void recibirRespuesta(Jugador jugador, String enunciado, String respuesta) {
		if(this.esRespuestaCorrecta(enunciado, respuesta)) {
			this.notificarRespuestaCorrecta(jugador);
			this.notificarQueJugadorRespondioCorrectamente(jugador.getNombre(), enunciado);
			this.eliminarPreguntaRespondida(enunciado);
			this.terminarJuegoSiCorresponde();
		}
		this.notificarRespuestaIncorrecta(jugador);
	}

	public void terminarJuegoSiCorresponde() {
		if(this.preguntas.size() == 0) {
			this.terminarJuego();
		}
	}

	private void terminarJuego() {
		System.out.print("Se termino el juego, Gracias Por Jugar");
	}

	private void eliminarPreguntaRespondida(String enunciado) {
		this.preguntas = this.preguntas.stream().filter(p->p.getEnunciado().equalsIgnoreCase(enunciado)).toList();
	}

	public void notificarQueJugadorRespondioCorrectamente(String nombre, String enunciado) {
		for(Jugador jugador : this.jugadores) {
			jugador.OtroRespondioCorrectamente(nombre, enunciado);
		}
	}

	private void notificarRespuestaIncorrecta(Jugador jugador) {
		this.getJugador(jugador).avisoDeRespuestaIncorrecta();
	}
	
	public Jugador getJugador(Jugador jugador) {
		return this.jugadores.stream().filter(jugador1 -> jugador1.getNombre().equalsIgnoreCase(jugador.getNombre())).findFirst().orElse(null);
	}

	public boolean esRespuestaCorrecta(String enunciado, String respuesta) {
		return this.preguntas.stream().anyMatch(p-> p.getEnunciado().equalsIgnoreCase(enunciado) && p.getRespuesta().equalsIgnoreCase(respuesta));
	}

	public void notificarRespuestaCorrecta(Jugador jugador) {
		this.getJugador(jugador).avisoDeRespuestaCorrecta();
	}

	public void agregarJugador(Jugador alex) {
		if(jugadores.size() <= 4) {
			this.jugadores.add(alex);
		} else {
			this.jugadores.add(alex);
			this.notificarInicio(this.enunciados());
		}
	}
	
	private void notificarInicio(List<String> enunciados) {
		for(Jugador jugador:this.jugadores) {
			jugador.recibirEnunciado(enunciados);
		}		
	}

	public List<String> enunciados() {
		return this.preguntas.stream().map(p->p.getEnunciado()).toList();
	}
	
}
