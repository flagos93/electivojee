package cl.ulagos.electivojee.industriaautomotriz.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Mecanico {

	@Id
	String rut;
	
	String nombre;
	
	@ManyToMany(mappedBy = "mecanicos")
	Set<Automovil> automoviles; 

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Automovil> getAutomoviles() {
		return automoviles;
	}

	public void setAutomoviles(Set<Automovil> automoviles) {
		this.automoviles = automoviles;
	}
	

}
