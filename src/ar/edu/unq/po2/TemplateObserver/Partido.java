package ar.edu.unq.po2.TemplateObserver;

import java.util.List;

public class Partido {

	private String resultado;
	private List<String> contricantes;
	private String deporte;

	public Partido(String resultado, List<String> contricantes, String deporte) {
		this.resultado = resultado;
		this.contricantes = contricantes;
		this.deporte = deporte;
	}
	
	public String getResultado() {
		return resultado;
	}
	
	public List<String> getContricantes() {
		return contricantes;
	}
	
	public String getDeporte() {
		return deporte;
	}
}
