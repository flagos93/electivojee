package cl.ulagos.electivojee.industriaautomotriz.exception;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class PersistirAutomovilException extends Exception {

	private static final long serialVersionUID = 1L;

	public PersistirAutomovilException(String mensaje) {
		
		super(mensaje);
		
	}
}
