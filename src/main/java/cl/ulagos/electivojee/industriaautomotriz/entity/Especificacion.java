package cl.ulagos.electivojee.industriaautomotriz.entity;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;
import javax.validation.constraints.NotNull;


public class Especificacion {

	@NotNull
	private  Color color;
	@NotNull
	@AmigableConMedioAmbiente
	private  TipoMotor tipoMotor;
	
	@JsonbCreator
	public Especificacion(@JsonbProperty("color")Color color, @JsonbProperty("tipoMotor")TipoMotor tipoMotor) {
		this.color = color;
		this.tipoMotor = tipoMotor;
		
	}

	public Color getColor() {
		return color;
	}

	public TipoMotor getTipoMotor() {
		return tipoMotor;
	}
	
}
