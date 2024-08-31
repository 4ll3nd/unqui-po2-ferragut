package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.List;

public class Counter {
	private List<Integer> numeros = new ArrayList<Integer>();
	
	public List<Integer> getNumeros() {
		 return numeros;
	}
	
	public void añadirNumero(Integer x) {
		this.getNumeros().add(x);
	}
	public int contarPares() {
		List<Integer> pares = new ArrayList<Integer>();
		for(int i = this.getNumeros().size(); i != 0; i--) {
			filtrarPares(pares, i);
		}
		return pares.size();
	}

	private void filtrarPares(List<Integer> list, int i) {
		if((this.getNumeros().get(i) % 2) == 0) {
			list.add(this.getNumeros().get(i));
		}
	}
	
	public int ContarImpares() {
		List<Integer> impares = new ArrayList<Integer>();
		for(Integer x:this.getNumeros()) {
			filtrarImpares(impares ,x);
		}
		return impares.size();
	}
	
	private void filtrarImpares(List<Integer> list,Integer x) {
		if((x % 2) == 1) {
			list.add(x);
		}
	}
	
	//los multiplos son infinitos solo voy a enumerar los primeros 20
	public int contarMultiplos(int x) {
		List<Integer> multiplos = new ArrayList<Integer>();
		for(int i = 20; i > 0; i--) {
			multiplos.add(x*i);
		}
		return multiplos.size();
	}
	
	public Integer elQueTieneMasDigitosPares(List<Integer> numeros) {
		Integer elMayorHastaAhora = numeros.getFirst();
		for(int x:numeros) {
			elQueTieneMasEntre(elMayorHastaAhora, x);
		}
		return elMayorHastaAhora;
	}
	//DUDA: puedo evitar usar dos veces el return?
	private Integer elQueTieneMasEntre(Integer y, Integer x) {
		if((this.cantidadDeDigitosPares(y)) >= (this.cantidadDeDigitosPares(x))) {
			return y;
		}
		else {
			return x;
		}
	}
	
	private int cantidadDeDigitosPares(Integer x) {
		int contador = 0;
		int numero   = x;
		while(numero != 1) {
			numero   = numero / 2;
			contador = contador + 1;
		}
		return contador;
	}
	//DUDA: estoy trabado en esta estrategia.
	public int elMultiploSimultaneoMasGrande(int x, int y) {
		int multiploMayor = -1;
		int multiplicador = 2;
		while(multiploMayor <= 1000) {
			multiploMayor = Math.max((x * multiplicador), (y * multiplicador));
			multiplicador = multiplicador + 1;
		}
	}
}

