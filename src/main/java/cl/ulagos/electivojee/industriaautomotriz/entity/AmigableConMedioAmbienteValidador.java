package cl.ulagos.electivojee.industriaautomotriz.entity;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AmigableConMedioAmbienteValidador implements ConstraintValidator<AmigableConMedioAmbiente, TipoMotor>{

	public void initialize(AmigableConMedioAmbiente constraint) {
		
	}

	public boolean isValid(TipoMotor tipoMotor, ConstraintValidatorContext context) {
		
		return tipoMotor == TipoMotor.ELECTRICO;
	}

}
