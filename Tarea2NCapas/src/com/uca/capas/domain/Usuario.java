package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "usuario")
public class Usuario {
	@Id
	@Column(name = "id_usuario")
	private Integer usuario_id;

	@Column(name = "nombreusuario")
	private String uNombre;

	@Column(name = "claveusuario")
	private String uContra;
	
	public Integer getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Integer usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getuNombre() {
		return uNombre;
	}

	public void setuNombre(String uNombre) {
		this.uNombre = uNombre;
	}

	public String getuContra() {
		return uContra;
	}

	public void setuContra(String uContra) {
		this.uContra = uContra;
}

}
