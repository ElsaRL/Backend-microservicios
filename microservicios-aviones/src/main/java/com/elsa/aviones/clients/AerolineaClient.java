package com.elsa.aviones.clients;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.elsa.commons.models.entity.Aerolinea;

@FeignClient(name="microservicios-aerolineas")
public interface AerolineaClient {
	@GetMapping("/{id}")
	public Optional<Aerolinea> getAerolineaById(@PathVariable Long id);
}

