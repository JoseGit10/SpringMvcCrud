package com.crudPildoras.entity;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="clt_id")
	private int cltId;
	
	@Column(name="clt_nombre")
	private String cltNombre;
	
	@Column(name="clt_apellido")
	private String cltApellido;
	
	@Column(name="clt_email")
	private String cltEmail;

	public Cliente() {
	}

	public Cliente(String cltNombre, String cltApellido, String cltEmail) {
		this.cltNombre = cltNombre;
		this.cltApellido = cltApellido;
		this.cltEmail = cltEmail;
	}

	public int getCltId() {
		return cltId;
	}

	public void setCltId(int cltId) {
		this.cltId = cltId;
	}

	public String getCltNombre() {
		return cltNombre;
	}

	public void setCltNombre(String cltNombre) {
		this.cltNombre = cltNombre;
	}

	public String getCltApellido() {
		return cltApellido;
	}

	public void setCltApellido(String cltApellido) {
		this.cltApellido = cltApellido;
	}

	public String getCltEmail() {
		return cltEmail;
	}

	public void setCltEmail(String cltEmail) {
		this.cltEmail = cltEmail;
	}

	@Override
	public String toString() {
		return "Cliente \n Id: " + cltId + "\n Nombre: " + cltNombre + "\n pellido: " + cltApellido + "\n cltEmail: "
				+ cltEmail + "\n";
	}
	
	
	
	
	
}
