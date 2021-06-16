package cl.ulagos.electivojee.industriaautomotriz.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import cl.ulagos.electivojee.industriaautomotriz.entity.Automovil;

@Singleton
public class CacheAutomovil {

	private final Map<String, Automovil> cache = new ConcurrentHashMap<>();
	
	@PersistenceContext
	EntityManager entityManager;
	
	
	@PostConstruct
	private void inicializarCache() {

		cargarAutomoviles();
	}
	public void cache(Automovil automovil) {
		
		cache.put(automovil.getIdentificador(), automovil);
	}
	
	public void cargarAutomoviles() {
		
		List<Automovil> lista = entityManager.createNamedQuery("TODOS_AUTOMOVILES", Automovil.class).getResultList();
		lista.forEach(this::cache);
	}
	
	public List<Automovil> retrieveAutomoviles(){
		
		return new ArrayList<>(cache.values());
	}
	
}
