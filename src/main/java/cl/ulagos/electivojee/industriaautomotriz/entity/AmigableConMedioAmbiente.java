package cl.ulagos.electivojee.industriaautomotriz.entity;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import javax.validation.Payload;

import javax.validation.Constraint;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD,ElementType.ANNOTATION_TYPE, ElementType.PARAMETER})
@Constraint(validatedBy = AmigableConMedioAmbienteValidador.class)
@Documented
public @interface AmigableConMedioAmbiente {

	String message() default "";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	
}
