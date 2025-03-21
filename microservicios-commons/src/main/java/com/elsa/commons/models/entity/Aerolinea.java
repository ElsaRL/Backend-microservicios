package com.elsa.commons.models.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "AEROLINEA")
public class Aerolinea {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AEROLINEA_SEQ")
	@SequenceGenerator(name = "AEROLINEA_SEQ", sequenceName = "AEROLINEA_SEQ", allocationSize = 1 )
	@Column(name = "ID_AEROLINEA")
	private Long id;
	
	@Column(name = "NOMBRE")
	@NotBlank(message = "El nombre de la aerolinea es obligatorio")
	@Size(min = 1, max = 50, message = " El nombre de la erolinea debe de tener entre 1 y 50 caracteres")
	private String nombre;
	
	
	@Column(name = "IATA")
	@NotBlank(message = "El iata es obligatorio")
	@Size(min = 1, max = 50, message = " El iata entre 1 y 50 caracteres")
	private String iata;
	
	@Column(name = "ID_ESTATUS")
	@NotNull(message = "El estatus es obligatorio")
	@Min(value = 1, message = " El estatus debe ser al menos 1")
	@Max(value = 2, message = " El estatus no debe ser al mayor a  1")
	private Long estatus;
	
	@Column(name = "PAIS")
	@NotBlank(message = "El pais es obligatorio")
	@Size(min = 1, max = 50, message = " El nombre del pais debe de tener entre 1 y 50 caracteres")
	private String Pais;
	
	@Column(name = "FECHA_FUNDACION")
	@NotNull(message = "La fecha fundacion es obligatoria")
	@Past(message = "La fecha de fundacion debe ser anterior a la fecha actual")
	private LocalDate fechaFundacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public Long getEstatus() {
		return estatus;
	}

	public void setEstatus(Long estatus) {
		this.estatus = estatus;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pais) {
		Pais = pais;
	}

	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}
		
	
}
