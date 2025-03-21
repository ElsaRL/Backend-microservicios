package com.elsa.commons.models.entity;

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
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "AEROPUERTO")
public class Aeropuerto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AEROPUERTO_SEQ")
	@SequenceGenerator(name = "AEROPUERTO_SEQ", sequenceName = "AEROPUERTO_SEQ", allocationSize = 1 )
	@Column(name = "ID_AEROPUERTO")
	private Long id;

	@Column(name = "NOMBRE")
	@NotBlank(message = "El nombre deL aeropuerto es obligatorio")
	@Size(min = 1, max = 50, message = " El nombre del aeropuerto debe de tener entre 1 y 50 caracteres")
    private String nombre;
	
	@Column(name = "CODIGO")
	@NotBlank(message = "El codigo es obligatorio")
	@Size(min = 1, max = 50, message = " El codigo del aeropuerto debe de tener entre 1 y 50 caracteres")
    private String codigo;

	@Column(name = "LATITUD")
	@NotBlank(message = "LA latitud es obligatorio")
	@Size(min = 1, max = 50, message = " La latitud  debe de tener entre 1 y 50 caracteres")
    private String latitud;
	
	@Column(name = "LONGITUD")
	@NotBlank(message = "La longitud es obligatorio")
	@Size(min = 1, max = 50, message = "La longitud debe de tener entre 1 y 50 caracteres")	
    private String longitud;
	

	@Column(name = "PAIS")
	@NotBlank(message = "El PAISes obligatorio")
	@Size(min = 1, max = 50, message = " El pais debe de tener entre 1 y 50 caracteres")	
    private String pais;
	
	@Column(name = "ID_ESTATUS")
	@NotNull(message = "El estatus es obligatorio")
	@Min(value = 1, message = " El estatus debe ser al menos 1")
	@Max(value = 2, message = " El estatus no debe ser mayor a  1")	
    private Long estatus;

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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Long getEstatus() {
		return estatus;
	}

	public void setEstatus(Long estatus) {
		this.estatus = estatus;
	}
	

}
