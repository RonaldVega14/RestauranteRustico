package com.uca.capas.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "public", name = "empleado")
public class Empleado {
	
	@Id
	@GeneratedValue(generator = "empleado_c_empleado_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "empleado_c_empleado_seq", sequenceName = "public.empleado_c_empleado_seq", allocationSize = 1)
	@Column(name = "id_empleado")
	private Integer id_empleado;

	@Column(name = "empleado_nombre")
	private String eNombre;

	@Column(name = "empleado_edad")
	private Integer eEdad;

	@Column(name = "empleado_genero")
	private String eGenero;

	@Column(name = "empleado_estado")
	private Boolean eEstado;
	
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "empleado_sucursal")
	private Sucursal empleado_sucursal;
	
	public Empleado() {

	}

	public Empleado(Integer id_empleado, String eNombre,
			Integer eEdad,
			String eGenero,
			Boolean eEstado, 
			Sucursal empleado_sucursal) {
		super();
		this.id_empleado = id_empleado;
		this.eNombre = eNombre;
		this.eEdad = eEdad;
		this.eGenero = eGenero;
		this.eEstado = eEstado;
		this.empleado_sucursal = empleado_sucursal;
	}

	public Integer geteId() {
		return id_empleado;
	}

	public void seteId(Integer id_empleado) {
		this.id_empleado = id_empleado;
	}

	public String geteNombre() {
		return eNombre;
	}

	public void seteNombre(String eNombre) {
		this.eNombre = eNombre;
	}

	public Integer geteEdad() {
		return eEdad;
	}

	public void seteEdad(Integer eEdad) {
		this.eEdad = eEdad;
	}

	public String geteGenero() {
		return eGenero;
	}

	public void seteGenero(String eGenero) {
		this.eGenero = eGenero;
	}

	public Boolean geteEstado() {
		return eEstado;
	}

	public void seteEstado(Boolean eEstado) {
		this.eEstado = eEstado;
	}

	public Sucursal getempleado_sucursal() {
		return empleado_sucursal;
	}

	public void setempleado_sucursal(Sucursal eSucursal) {
		this.empleado_sucursal = eSucursal;
	}

	public String getEstadoMod() {
		return this.eEstado == null ? "" : this.eEstado == true ? "Activo" : "Inactivo";
	}


}
