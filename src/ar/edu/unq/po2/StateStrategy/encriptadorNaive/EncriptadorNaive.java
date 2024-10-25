package ar.edu.unq.po2.StateStrategy.encriptadorNaive;

public class EncriptadorNaive {

	private EncriptarEstrategia estrategiaDeEncriptado;
	private String StringEncriptado;

	public EncriptadorNaive(EncriptarEstrategia estrategia) {
		this.setEstrategiaDeEncriptado(estrategia);
	}
	
	public void encriptar(String x) {
		this.StringEncriptado = this.getEstrategiaDeEncriptado().encriptar(x);
	}
	
	public EncriptarEstrategia getEstrategiaDeEncriptado() {
		return estrategiaDeEncriptado;
	}

	public void setEstrategiaDeEncriptado(EncriptarEstrategia estrategiaDeEncriptado) {
		this.estrategiaDeEncriptado = estrategiaDeEncriptado;
	}

	public String getStringEncriptado() {
		return StringEncriptado;
	}

}
