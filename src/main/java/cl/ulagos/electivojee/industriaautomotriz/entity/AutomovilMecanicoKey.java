package cl.ulagos.electivojee.industriaautomotriz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AutomovilMecanicoKey implements Serializable{


	private static final long serialVersionUID = 1L;

	@Column (name = "identificador")
	String identificador;
	
	@Column (name = "rut")
	String rut;

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

}
