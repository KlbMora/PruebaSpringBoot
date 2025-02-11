package com.example.proyecto.models;

import jakarta.persistence.*;

@Entity
@Table(name="autor")
public class autorModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	//@OneToMany(mappedBy="idAutor")
	private Long Id;
	
	@Column
	private String nombre;
	
	@Column
	private String nacionalidad;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
}
