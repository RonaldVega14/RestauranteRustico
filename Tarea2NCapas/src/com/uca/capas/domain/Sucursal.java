package com.uca.capas.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "sucursal")
public class Sucursal {
	
	@Id
	@GeneratedValue(generator = "sucursal_id_sucursal_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "sucursal_id_sucursal_seq", sequenceName = "public.sucursal_id_sucursal_seq", allocationSize = 1)
	@Column(name = "id_sucursal")
	private Integer sId;

	@Column(name = "sucursal_nombre")
	private String sNombre;

	@Column(name = "sucursal_ubicacion")
	private String sUbicacion;

	@Column(name = "sucursal_horario")
	private String sHorarios;

	@Column(name = "sucursal_mesas")
	private Integer sNMesas;

	@Column(name = "sucursal_nomgerente")
	private String sNomGerente;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "empleado_sucursal")
	private List<Empleado> sEmpleados;
	
	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsUbicacion() {
		return sUbicacion;
	}

	public void setsUbicacion(String sUbicacion) {
		this.sUbicacion = sUbicacion;
	}

	public String getsHorarios() {
		return sHorarios;
	}

	public void setsHorarios(String sHorarios) {
		this.sHorarios = sHorarios;
	}

	public Integer getsNMesas() {
		return sNMesas;
	}

	public void setsNMesas(Integer sNMesas) {
		this.sNMesas = sNMesas;
	}

	public String getsNomGerente() {
		return sNomGerente;
	}

	public void setsNomGerente(String sNomGerente) {
		this.sNomGerente = sNomGerente;
	}

	public List<Empleado> getsEmpleados() {
		return sEmpleados;
	}

	public void setsEmpleados(List<Empleado> sEmpleados) {
		this.sEmpleados = sEmpleados;
	}
	
	public Sucursal() {

	}

	public Sucursal(Integer sId, String sNombre, String sUbicacion, String sHorarios, Integer sNMesas,
			String sNomGerente, List<Empleado> sEmpleados) {
		super();
		this.sId = sId;
		this.sNombre = sNombre;
		this.sUbicacion = sUbicacion;
		this.sHorarios = sHorarios;
		this.sNMesas = sNMesas;
		this.sNomGerente = sNomGerente;
		this.sEmpleados = sEmpleados;
	}

}
