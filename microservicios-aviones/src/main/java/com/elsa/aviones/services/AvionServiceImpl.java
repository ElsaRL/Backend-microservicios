package com.elsa.aviones.services;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.elsa.aviones.MicroserviciosAvionesApplication;
import com.elsa.aviones.dto.AvionDTO;
import com.elsa.aviones.mappers.AvionMapper;
import com.elsa.aviones.models.repository.AvionRepository;
import com.elsa.commons.models.entity.Avion;
import com.elsa.commons.services.CommonServiceImpl;


@Service
public class AvionServiceImpl extends CommonServiceImpl<Avion, AvionRepository> 
implements AvionService{
	
	private final AvionMapper mapper;
	
	public AvionServiceImpl(AvionMapper mapper) {
		this.mapper=mapper;
	}
	
	@Override
	@Transactional
	public Avion createAvionDTO(AvionDTO avionDTO) {
		Avion avion =mapper.dtoToEntity(avionDTO);
		return repository.save(avion);
	}

	@Override
	@Transactional
	public Avion update(AvionDTO avionDTO, Long id) {
		Optional<Avion> opt=repository.findById(id);
		if(opt.isPresent()) {
			Avion avion = mapper.dtoToEntity(avionDTO);
			avion.setId(id);
			return repository.save(avion);		
			
		}
		return null;
	  				
	}		

}
