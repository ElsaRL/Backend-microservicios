package com.elsa.aeropuertos.services;


import com.elsa.commons.models.entity.Aeropuerto;
import com.elsa.commons.services.CommonService;

public interface AeropuertoService extends CommonService<Aeropuerto> {
	Aeropuerto actualizar(Aeropuerto aeropuerto, Long id);
}
