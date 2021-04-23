package cl.ulagos.electivojee.industriaautomotriz.boundary;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;

import cl.ulagos.electivojee.industriaautomotriz.control.FactoriaAutomovil;
import cl.ulagos.electivojee.industriaautomotriz.control.RepositorioAutomovil;
import cl.ulagos.electivojee.industriaautomotriz.entity.Automovil;
import cl.ulagos.electivojee.industriaautomotriz.entity.AutomovilCreado;
import cl.ulagos.electivojee.industriaautomotriz.entity.Especificacion;

@Stateless
public class ManufacturaAutomovil {

	@Inject
	FactoriaAutomovil factoriaAutomovil;
	
	@Inject
	RepositorioAutomovil repositorioAutomovil;
	
	@Inject
	Event<AutomovilCreado> automovilCreado; 
	
	public Automovil manufacturaAutomovil(Especificacion especificacion) {
		
		Automovil automovil = factoriaAutomovil.manufacturaAutomovil(especificacion);
		repositorioAutomovil.store(automovil);
		automovilCreado.fire(new AutomovilCreado(automovil.getIdentificador()));
		return automovil;
	}
	
	public void inicializar() {
		
		repositorioAutomovil.inicializar();
	}
	
	public List<Automovil> obtenerAutomoviles(){
		
		return repositorioAutomovil.cargarAutomoviles();
	}
	
	public Automovil obtenerAutomovil(String id) {
		
		return repositorioAutomovil.obtenerAutomovil(id);
		
	}

}
