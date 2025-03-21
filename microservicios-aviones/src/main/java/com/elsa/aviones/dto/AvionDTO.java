package com.elsa.aviones.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class AvionDTO {

	private Long id;
	
	@NotNull(message = "El numero de registro es obligatorio")
	@Min(value = 1, message = " El numero de registro debe debe ser minimo 1")
	private Long numRegistro;
	
	@NotBlank(message = "El tipo es obligatorio")
	@Size(min = 1, max = 50, message = " El tipo debe de tener entre 1 y 50 caractere")
	 private String tipo;
	
	@NotBlank(message = "El codigo modelo es obligatorio")
	@Size(min = 1, max = 50, message = " El codigo modelo debe de tener entre 1 y 50 caractere")
	 private String codigoModelo;
	
	@NotNull(message = "La capacidad es obligatorio")
	@Min(value = 1, message = " La capacidad debe debe ser minimo 1")
	private Long capacidad;
	
	@NotNull(message = "La fechade primer vuelo es obligatoria")
	private LocalDate fechaPrimerVuelo;
	 
	@NotNull(message = "El estatus es obligatorio")
	@Min(value = 1, message = " El estatus debe ser al menos 1")
	@Max(value = 2, message = " El estatus no debe ser al mayor a  1")
	private Long estatus;
	
	@NotNull(message = "El id de la Aerolinea no puede ser nulo")
	@Min(value = 1, message = " La aerolinea  debe ser al menos 1")
	private Long idAerolinea;

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

	public Long getIdAerolinea() {
		return idAerolinea;
	}

	public void setIdAerolinea(Long idAerolinea) {
		this.idAerolinea = idAerolinea;
	}    

}
