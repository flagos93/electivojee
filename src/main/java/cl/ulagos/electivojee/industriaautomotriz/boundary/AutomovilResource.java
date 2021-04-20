package cl.ulagos.electivojee.industriaautomotriz.boundary;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cl.ulagos.electivojee.industriaautomotriz.entity.Automovil;
import cl.ulagos.electivojee.industriaautomotriz.entity.Especificacion;

@Path("automoviles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AutomovilResource {

	@Inject
	ManufacturaAutomovil manufacturaAutomovil;

	
	@GET
	public List<Automovil> obtenerAutomoviles(){
		
		return manufacturaAutomovil.obtenerAutomoviles();
	}
	
	@POST
	public void crearAutomovil(Especificacion especificacion) {
		
		manufacturaAutomovil.manufacturaAutomovil(especificacion);
	}
	
}

