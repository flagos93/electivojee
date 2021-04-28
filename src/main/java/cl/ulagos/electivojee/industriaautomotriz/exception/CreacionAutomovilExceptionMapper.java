package cl.ulagos.electivojee.industriaautomotriz.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class CreacionAutomovilExceptionMapper implements ExceptionMapper<CreacionAutomovilException>{

	@Override
	public Response toResponse(CreacionAutomovilException exception) {
		// TODO Auto-generated method stub
		return Response.serverError()
				.header("X-automovil-error", exception.getMessage())
				.entity(exception.getMessage())
				.build();
	}
}
