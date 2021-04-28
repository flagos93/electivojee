package cl.ulagos.electivojee.industriaautomotriz.exception;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ViolacionConstraintExceptionMapper implements ExceptionMapper<ConstraintViolationException>{

	@Override
	public Response toResponse(ConstraintViolationException exception) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				return Response.status(Response.Status.BAD_REQUEST)
						.header("X-Validacion-error", exception.getMessage())
						.entity(exception.getMessage())
						.build();
	}
}
