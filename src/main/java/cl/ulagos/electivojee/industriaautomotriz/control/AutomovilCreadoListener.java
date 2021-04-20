package cl.ulagos.electivojee.industriaautomotriz.control;

import javax.enterprise.event.Observes;

import cl.ulagos.electivojee.industriaautomotriz.entity.AutomovilCreado;

public class AutomovilCreadoListener {

	public void onAutomovilCreadoListener(@Observes AutomovilCreado automovilCreado){
		//...
		
		System.out.println("Automovil Creado: " + automovilCreado.getIdentificador());
		
	}
	
}
