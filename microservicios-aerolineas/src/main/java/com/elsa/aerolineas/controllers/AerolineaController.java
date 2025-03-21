package com.elsa.aerolineas.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elsa.aerolineas.services.AerolineaService;
import com.elsa.commons.controllers.CommonController;
import com.elsa.commons.models.entity.Aerolinea;
import jakarta.validation.Valid;

@RestController
public class AerolineaController extends CommonController<Aerolinea, AerolineaService> {
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@Valid @RequestBody Aerolinea aerolinea,
			BindingResult result, @PathVariable Long id){
		if (result.hasErrors()) {
			return this.validar(result);
		}
		
		Aerolinea aerolineaDb = service.actualizar(aerolinea, id);
		
		if (aerolineaDb != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(aerolineaDb);
		}
		return ResponseEntity.notFound().build();
	}

}
