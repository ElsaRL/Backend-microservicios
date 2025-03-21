package com.elsa.commons.models.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "AVION")
public class Avion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AVION_SEQ")
	@SequenceGenerator(name = "AVION_SEQ", sequenceName = "AVION_SEQ", allocationSize = 1 )
	@Column(name = "ID_AVION")
	 private Long id;
	
	@Column(name = "NUM_REGISTRO")
	@NotNull(message = "El numero de registro es obligatorio")
	@Min(value = 1, message = " El numero de registro debe debe ser minimo 1")
	 private Long numRegistro;
	
	@Column(name = "TIPO")
	@NotBlank(message = "El tipo es obligatorio")
	@Size(min = 1, max = 50, message = " El tipo debe de tener entre 1 y 50 caractere")
	 private String tipo;
	
	@Column(name = "CODIGO_MODELO")
	@NotBlank(message = "El codigo modelo es obligatorio")
	@Size(min = 1, max = 50, message = " El codigo modelo debe de tener entre 1 y 50 caractere")
	 private String codigoModelo;
	
	@Column(name = "CAPACIDAD")
	@NotNull(message = "La capacidad es obligatorio")
	@Min(value = 1, message = " La capacidad debe debe ser minimo 1")
	 private Long  capacidad;
	
	 @Column(name = "FECHA_PRIMER_VUELO")
	 @NotNull(message = "La fechade primer vuelo es obligatoria")
	 private LocalDate fechaPrimerVuelo;
	 
	@Column(name = "ID_ESTATUS")
	@NotNull(message = "El estatus es obligatorio")
	@Min(value = 1, message = " El estatus debe ser al menos 1")
	@Max(value = 2, message = " El estatus no debe ser al mayor a  1")
	 private Long estatus;
	
	@JsonIgnoreProperties(value= {"handler","hibernateLazyInitializer"})
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name= "ID_AEROLINEA",referencedColumnName = "ID_AEROLINEA")
	@NotNull(message = "La aerolinea es obligatoria")
    private Aerolinea aerolinea;
	
 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(Long numRegistro) {
		this.numRegistro = numRegistro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCodigoModelo() {
		return codigoModelo;
	}

	public void setCodigoModelo(String codigoModelo) {
		this.codigoModelo = codigoModelo;
	}

	public Long getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Long capacidad) {
		this.capacidad = capacidad;
	}

	public LocalDate getFechaPrimerVuelo() {
		return fechaPrimerVuelo;
	}

	public void setFechaPrimerVuelo(LocalDate fechaPrimerVuelo) {
		this.fechaPrimerVuelo = fechaPrimerVuelo;
	}

	public Long getEstatus() {
		return estatus;
	}

	public void setEstatus(Long estatus) {
		this.estatus = estatus;
	}

	public Aerolinea getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
    
    
}
