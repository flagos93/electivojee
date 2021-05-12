package cl.ulagos.electivojee.industriaautomotriz.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class Asiento {

	@Id
	private long id;
	
	@Enumerated(EnumType.STRING)
	private MaterialAsiento materialAsiento;
	
	@Embedded
	private CinturonSeguridad cinturonSeguridad;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public MaterialAsiento getMaterialAsiento() {
		return materialAsiento;
	}
	public void setMaterialAsiento(MaterialAsiento materialAsiento) {
		this.materialAsiento = materialAsiento;
	}
	public CinturonSeguridad getCinturonSeguridad() {
		return cinturonSeguridad;
	}
	public void setCinturonSeguridad(CinturonSeguridad cinturonSeguridad) {
		this.cinturonSeguridad = cinturonSeguridad;
	}
	
}
