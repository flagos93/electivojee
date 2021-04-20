package cl.ulagos.electivojee.industriaautomotriz.control;

import java.util.UUID;

import javax.inject.Inject;

import cl.ulagos.electivojee.industriaautomotriz.entity.Automovil;
import cl.ulagos.electivojee.industriaautomotriz.entity.Color;
import cl.ulagos.electivojee.industriaautomotriz.entity.Especificacion;

public class FactoriaAutomovil {
	
	@Inject
	@Diesel
	Color colorAutomovilDefecto;
	
	public Automovil manufacturaAutomovil(Especificacion especificacion) {

		Automovil automovil = new Automovil();
		automovil.setIdentificador(UUID.randomUUID().toString());
		automovil.setColor(especificacion.getColor() == null ? colorAutomovilDefecto: especificacion.getColor());
		automovil.setTipoMotor(especificacion.getTipoMotor());
		
		//store en base de datos.		
		return automovil;
	}
}
