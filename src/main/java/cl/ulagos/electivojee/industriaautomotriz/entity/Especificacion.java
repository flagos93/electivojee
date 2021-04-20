package cl.ulagos.electivojee.industriaautomotriz.entity;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;

public class Especificacion {

	private  Color color;
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
