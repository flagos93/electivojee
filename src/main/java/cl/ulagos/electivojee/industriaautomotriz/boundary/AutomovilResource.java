package cl.ulagos.electivojee.industriaautomotriz.boundary;

import java.net.URI;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.stream.JsonCollectors;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import cl.ulagos.electivojee.industriaautomotriz.entity.Automovil;
import cl.ulagos.electivojee.industriaautomotriz.entity.Especificacion;

@Path("automoviles")
public class AutomovilResource {

	@Inject
	ManufacturaAutomovil manufacturaAutomovil;

	
	@Context
	UriInfo uriInfo;
	
	@GET
	public JsonArray obtenerAutomoviles(){

		return manufacturaAutomovil.obtenerAutomoviles()
				.stream()
				.map(c->Json.createObjectBuilder()
						.add("color", c.getColor().name())
						.add("motor", c.getTipoMotor().name())
						.add("id", c.getIdentificador())
						.add("test", "valor")
						.build())
				.collect(JsonCollectors.toJsonArray());

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response crearAutomovil(Especificacion especificacion) {

		Automovil automovil = manufacturaAutomovil.manufacturaAutomovil(especificacion);
		
		URI uri = uriInfo.getBaseUriBuilder()
				.path(AutomovilResource.class)
				.path(AutomovilResource.class, "obtenerAutomovil")
				.build(automovil.getIdentificador());
		
		return Response.created(uri).build();	
	}
	
	@GET
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Automovil obtenerAutomovil(@PathParam("id") String identificador) {
		
		return manufacturaAutomovil.obtenerAutomovil(identificador);
		
	}
}

