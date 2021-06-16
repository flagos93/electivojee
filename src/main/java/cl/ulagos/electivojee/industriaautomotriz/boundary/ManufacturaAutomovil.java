package cl.ulagos.electivojee.industriaautomotriz.boundary;

import java.util.List;
import java.util.Random;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.interceptor.Interceptor;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cl.ulagos.electivojee.industriaautomotriz.control.CacheAutomovil;
import cl.ulagos.electivojee.industriaautomotriz.control.FactoriaAutomovil;
import cl.ulagos.electivojee.industriaautomotriz.entity.Automovil;
import cl.ulagos.electivojee.industriaautomotriz.entity.AutomovilCreado;
import cl.ulagos.electivojee.industriaautomotriz.entity.Especificacion;
import cl.ulagos.electivojee.industriaautomotriz.exception.CreacionAutomovilException;
import cl.ulagos.electivojee.industriaautomotriz.interceptores.MiInterceptor;

@Stateless
public class ManufacturaAutomovil {

	@Inject
	FactoriaAutomovil factoriaAutomovil;

	//@Inject
	//RepositorioAutomovil repositorioAutomovil;
	@PersistenceContext
	EntityManager entityManager;


	@Inject
	Event<AutomovilCreado> automovilCreado; 
	
	@Inject 
	CacheAutomovil cacheAutomovil;
	

	@Interceptors(MiInterceptor.class)
	public Automovil manufacturaAutomovil(Especificacion especificacion) {

		//if (new Random().nextBoolean())
		//	throw new CreacionAutomovilException("No se puede crear un automovil");

		Automovil automovil = factoriaAutomovil.manufacturaAutomovil(especificacion);
		cacheAutomovil.cache(automovil);
		//repositorioAutomovil.store(automovil);
		entityManager.persist(automovil);
		automovilCreado.fire(new AutomovilCreado(automovil.getIdentificador()));
		return automovil;
	}

	public List<Automovil> obtenerAutomoviles(){

		return cacheAutomovil.retrieveAutomoviles();
		
		/*
		 * List<Automovil> lista = entityManager.createNamedQuery("TODOS_AUTOMOVILES",
		 * Automovil.class).getResultList(); for (Automovil a: lista)
		 * System.out.println(a.getIdentificador()); return lista;
		 */
	}


	//	public void inicializar() {
	//		
	//		repositorioAutomovil.inicializar();
	//	}
	//	
	//	public List<Automovil> obtenerAutomoviles(){
	//		
	//		return repositorioAutomovil.cargarAutomoviles();
	//	}
	//	
	//	public List<Automovil> obtenerAutomoviles(TipoMotor tipo){
	//		
	//		return repositorioAutomovil.cargarAutomoviles(tipo);
	//	}
	//	
	//	
	//	public Automovil obtenerAutomovil(String id) {
	//		
	//		return repositorioAutomovil.obtenerAutomovil(id);
	//		
	//	}

}
