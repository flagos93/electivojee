package cl.ulagos.electivojee.industriaautomotriz.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({
	@NamedQuery(name = "TODOS_AUTOMOVILES", query = "select a from Automovil a")
})
public class Automovil {

	public static final String TODOS_AUTOMOVILES = "Automovil.findAll";
	
	@Id
	private String identificador;
	@Enumerated(EnumType.STRING)
	private Color color;
	@Enumerated(EnumType.STRING)
	private TipoMotor tipoMotor;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="automovil", nullable = false)
	private Set<Asiento> asientos = new HashSet<Asiento>();
	
	@ManyToMany
	@JoinTable(name="automovil_mecanico", joinColumns = @JoinColumn(name = "identificador"),
	inverseJoinColumns = @JoinColumn(name="rut"))
	private Set<Mecanico> mecanicos;
	
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

	public Set<Asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(Set<Asiento> asientos) {
		this.asientos = asientos;
	}

	public Set<Mecanico> getMecanicos() {
		return mecanicos;
	}

	public void setMecanicos(Set<Mecanico> mecanicos) {
		this.mecanicos = mecanicos;
	}
	
}
