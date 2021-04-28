package cl.ulagos.electivojee.industriaautomotriz.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "TODOS_AUTOMOVILES", query = "select a from Automovil a")
})
public class Automovil {

	public static final String TODOS_AUTOMOVILES = "Automovil.findAll";
	
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
