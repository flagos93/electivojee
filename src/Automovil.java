package cl.ulagos.electivojee.industriaautomotriz.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Automovil {

	@Id
	private String identificador;
	private Color color;
	private TipoMotor tipoMotor;
	
	
	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public TipoMotor getTipoMotor() {
		return tipoMotor;
	}
	
	public void setTipoMotor(TipoMotor tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
}
