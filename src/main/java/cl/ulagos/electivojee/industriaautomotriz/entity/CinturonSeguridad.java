package cl.ulagos.electivojee.industriaautomotriz.entity;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class CinturonSeguridad {

	@Enumerated(EnumType.STRING)
	private ModeloCinturon modeloCinturon;
	
	public void cerrar() {
		
		
	}
	
	public void abrir() {
		
		
	}
	
}
