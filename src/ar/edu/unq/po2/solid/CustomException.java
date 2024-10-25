package ar.edu.unq.po2.solid;

public class CustomException extends Exception {
	public static final long serialVersionUID = 500L;
	
	public CustomException(String mensaje) {
		super(mensaje);
	}
}
