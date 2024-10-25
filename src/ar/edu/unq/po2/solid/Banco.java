package ar.edu.unq.po2.solid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class Banco {
	private List<Cliente> clientes;
	private List<Solicitud> solicitudes;
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<Solicitud>();
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public List<Solicitud> getSolicitudes() {
		return solicitudes;
	}

	public int getCantDeClientes() {
		return this.getClientes().size();
	}

	public void agregarCliente(Cliente x) {
		this.clientes.add(x);
	}

	public void agregarSolicitud(Solicitud solicitud) {
		try {
			this.validarQueElClienteEsteInscripto(solicitud.getEmisor());
		}
		catch(CustomException e) {
			System.out.print(e.getMessage());
		}
		this.solicitudes.add(solicitud);
	}
	
	private void validarQueElClienteEsteInscripto(Cliente cliente) throws CustomException {
		if(!this.estaRegistrado(cliente)) {
			throw new CustomException("El cliente no esta registrado");
		}
	}
	
	private boolean estaRegistrado(Cliente emisor) {
		return this.getClientes().stream().anyMatch(c -> c.equals(emisor));
	}

	public Integer getCantDeSolicitudes() {
		return this.getSolicitudes().size();
	}

	public double getMontoTotal() {
		Stream<Solicitud> solicitudesAprobadas = this.getSolicitudes().stream().filter(s -> s.esSolicitudAceptable());
		return solicitudesAprobadas.mapToDouble(s -> s.getMonto()).sum();
	}
}
