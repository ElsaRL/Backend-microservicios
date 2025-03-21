package com.elsa.aerolineas.services;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.elsa.aerolineas.models.repositories.AerolineaRepository;
import com.elsa.commons.models.entity.Aerolinea;
import com.elsa.commons.services.CommonServiceImpl;

@Service
public class AerolineasServiceImpl extends 
	CommonServiceImpl<Aerolinea, AerolineaRepository>
	implements AerolineaService{
 

	@Override
	@Transactional
	public Aerolinea actualizar(Aerolinea aerolinea, Long id) {
		Optional<Aerolinea> optAerolinea = 
				repository.findById(id);
				if (optAerolinea.isPresent()) {
					Aerolinea aerolineaDb = optAerolinea.get();
					aerolineaDb.setNombre(aerolinea.getNombre());
					aerolineaDb.setIata(aerolinea.getIata());
					aerolineaDb.setEstatus(aerolinea.getEstatus());
					aerolineaDb.setFechaFundacion(aerolinea.getFechaFundacion());
					aerolineaDb.setPais(aerolinea.getPais());
					repository.save(aerolineaDb);
					return aerolineaDb;								
				}
				return null;
	}

}
