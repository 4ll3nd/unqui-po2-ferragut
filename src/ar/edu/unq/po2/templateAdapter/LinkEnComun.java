package ar.edu.unq.po2.templateAdapter;

public class LinkEnComun extends Filtro {

	@Override
	protected boolean tienenEnComun(Pagina pagina, Pagina pagina1) {
		return pagina.getLinks().stream().anyMatch(p -> tieneMismoNombreQueAlguna(p,pagina1));
	}
	
	/**
	 * PROPOSITO: Indicar si la pagina *p* tiene algun link en comun con los links de la 
	 * pagina *pagina1*
	 * */
	private boolean tieneMismoNombreQueAlguna(Pagina p, Pagina pagina1) {
		return pagina1.getLinks().stream().anyMatch(p1 -> p1.getTittle() == p.getTittle());
	}
}
