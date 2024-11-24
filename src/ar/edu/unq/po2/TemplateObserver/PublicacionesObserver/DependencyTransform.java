package ar.edu.unq.po2.TemplateObserver.PublicacionesObserver;

import java.util.List;

public class DependencyTransform implements Interesado {
	private Investigador investigador;
	private List<String> intereses;

	public DependencyTransform(Investigador x, List<String> intereses) {
		this.investigador = x;
		this.intereses = intereses;
	}

	public Investigador getInvestigador() {
		return investigador;
	}
	
	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}
	
	public List<String> getIntereses() {
		return intereses;
	}
	
	public boolean comparteInteres(Articulo x, List<String> intereses) {
		List<String> infoDeArticulo = x.getPalabrasClave();
		infoDeArticulo.add(x.getAutor());
		infoDeArticulo.add(x.getFiliacion());
		infoDeArticulo.add(x.getTipo());
		infoDeArticulo.add(x.getTitulo());
		infoDeArticulo.add(x.getLugarDePublicacion());
		
		return intereses.stream().anyMatch(iinteres->this.tieneEnComun(iinteres, infoDeArticulo));
		
	}

	public boolean tieneEnComun(String interes, List<String> infoDeArticulo) {
		return infoDeArticulo.stream().anyMatch(info-> info.equalsIgnoreCase(interes));
	}

	public void notificar(Articulo articuloANotificar) {
		if(this.comparteInteres(articuloANotificar, this.getIntereses()) ){
			this.getInvestigador().aviso(articuloANotificar);
		}
	}

	@Override
	public void update(Articulo articuloANotificar) {
		this.notificar( articuloANotificar);
	}
	
}
