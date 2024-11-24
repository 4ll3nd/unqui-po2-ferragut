package ar.edu.unq.po2.TemplateObserver;

import java.util.List;

public class SecretarioTodo extends SecretarioDeNotificacion {

	@Override
	public boolean esDeInteres(Partido partido) {
		return true;
	}
	
	public boolean esSecretarioTodo() {
		return true;
	}

	@Override
	public boolean sonMismosIntereses(List<String> deportes) {
		return false;
	}
}