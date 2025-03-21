package com.elsa.aviones.services;

import com.elsa.aviones.dto.AvionDTO;
import com.elsa.commons.models.entity.Avion;
import com.elsa.commons.services.CommonService;

public interface AvionService extends CommonService<Avion> {	
	Avion createAvionDTO(AvionDTO avionDTO);
	
	Avion update(AvionDTO avionDTO, Long id);
}
