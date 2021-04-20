package cl.ulagos.electivojee.industriaautomotriz.control;

import javax.enterprise.inject.Produces;
import javax.inject.Named;

import cl.ulagos.electivojee.industriaautomotriz.entity.Color;

public class ColorAutomovilDefecto {

	@Produces
	@Diesel
	public Color exponerColorDefecto() {
		//...
		
		return Color.BLANCO;
	
	}
	
	@Produces
	@Named("electrico")
	public Color otraCosa() {
		
		return null;
	}
	
}
