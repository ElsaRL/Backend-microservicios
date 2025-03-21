package com.elsa.aviones.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elsa.aviones.dto.AvionDTO;
import com.elsa.aviones.services.AvionService;
import com.elsa.commons.controllers.CommonController;
import com.elsa.commons.models.entity.Avion;

import jakarta.validation.Valid;

	@RestController
	public class AvionController extends CommonController<Avion,AvionService> {
		
	@PostMapping("/avion-dto")
	public ResponseEntity<?> create(@Valid @RequestBody  AvionDTO avionDto, BindingResult result) {
		if(result.hasErrors() ) {
			return this.validar(result);
		}
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.createAvionDTO(avionDto));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@Valid @RequestBody AvionDTO avionDTO,BindingResult result, @PathVariable Long id){
		if(result.hasErrors()) {
			return this.validar(result);
		}
		
		Avion avionDb= service.update(avionDTO, id);
		if(avionDb != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(avionDTO);
		}
		return ResponseEntity.notFound().build();
	}
}
