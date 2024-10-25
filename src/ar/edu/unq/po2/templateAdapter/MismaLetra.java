package ar.edu.unq.po2.templateAdapter;

public class MismaLetra extends Filtro {

	@Override
	protected boolean tienenEnComun(Pagina pagina, Pagina p) {
		return pagina.getTittle().charAt(0) == p.getTittle().charAt(0);
	}
}
