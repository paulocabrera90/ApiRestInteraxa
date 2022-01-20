package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;


@Entity
public class Persona {
	@Id	
	private String dni;		
	
	@Column
	private String nombre;
	private String apellido;
	private boolean esEmpleado;
	//private String dni;	
	
	public Persona() {
		super();
	}
	public Persona(Integer id, String nombre, String apellido, boolean esEmpleado, String dni) {
		super();
		//this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.esEmpleado = esEmpleado;
		this.dni = dni;
	}
	
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public boolean isEsEmpleado() {
		return esEmpleado;
	}
	public void setEsEmpleado(boolean esEmpleado) {
		this.esEmpleado = esEmpleado;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}

