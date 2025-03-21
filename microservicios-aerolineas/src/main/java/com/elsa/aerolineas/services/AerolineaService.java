package com.elsa.aerolineas.services;

import com.elsa.commons.models.entity.Aerolinea;
import com.elsa.commons.services.CommonService;


public interface AerolineaService extends CommonService<Aerolinea> {
	
	Aerolinea actualizar(Aerolinea aerolinea, Long id);
	
}
