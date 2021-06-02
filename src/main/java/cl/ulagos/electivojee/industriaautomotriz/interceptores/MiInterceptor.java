package cl.ulagos.electivojee.industriaautomotriz.interceptores;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import cl.ulagos.electivojee.industriaautomotriz.entity.Especificacion;

@Interceptor
public class MiInterceptor {

	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) throws Exception {
		
		Object [] lista = context.getParameters();
		for (Object objeto : lista) {
			
			if (objeto instanceof Especificacion)
			{
				Especificacion especificacion = (Especificacion) objeto;
				System.out.println("Color: " + especificacion.getColor());
			}
			
		}
		return context.proceed();
	}
	
}
