package ar.edu.unq.po2.templateAdapter;

import java.util.List;

public abstract class Filtro {
	public List<Pagina> getSimilarPages(Pagina pagina, List<Pagina> paginas) {
		return paginas.stream().filter(p -> tienenEnComun(pagina, p)).toList();
	}

	protected abstract boolean tienenEnComun(Pagina pagina, Pagina p);
}
