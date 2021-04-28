package cl.ulagos.electivojee.industriaautomotriz.exception;

import javax.ejb.ApplicationException;

@ApplicationException
public class CreacionAutomovilException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CreacionAutomovilException(String mensaje) {
		
		super(mensaje);
	}
	
}
