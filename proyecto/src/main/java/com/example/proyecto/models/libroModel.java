package com.example.proyecto.models;

import jakarta.persistence.*;

@Entity
@Table(name="libro")
public class libroModel {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long Id;
		
		@Column
		private String titulo;
		
		@Column
		private Long autor_id;
		
		@Column
		private String fecha_publicacion;

		public Long getId() {
			return Id;
		}

		public void setId(Long id) {
			Id = id;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public Long getAutor_id() {
			return autor_id;
		}

		public void setAutor_id(Long autor_id) {
			this.autor_id = autor_id;
		}

		public String getFecha_publicacion() {
			return fecha_publicacion;
		}

		public void setFecha_publicacion(String fecha_publicacion) {
			this.fecha_publicacion = fecha_publicacion;
		}
		
		

		
		

}
