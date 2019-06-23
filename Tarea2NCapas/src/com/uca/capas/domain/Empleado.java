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

@Entity
@Table(schema = "public", name = "empleado")
public class Empleado {
	
	@Id
	@GeneratedValue(generator = "empleado_id_empleado_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "empleado_id_empleado_seq", sequenceName = "public.empleado_id_empleado_seq", allocationSize = 1)
	@Column(name = "id_empleado")
	private Integer empleado_id;

	@Column(name = "empleado_nombre")
	private String empleado_nombre;

	@Column(name = "empleado_edad")
	private Integer empleado_edad;

	@Column(name = "empleado_genero")
	private String empleado_genero;

	@Column(name = "empleado_estado")
	private Boolean empleado_estado;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_sucursal")
	private Sucursal empleado_sucursal;

}
