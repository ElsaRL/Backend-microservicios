package com.elsa.aviones.mappers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.elsa.aviones.clients.AerolineaClient;
import com.elsa.aviones.dto.AvionDTO;
import com.elsa.commons.models.entity.Aerolinea;
import com.elsa.commons.models.entity.Avion;

@Component
public class AvionMapper {
	
	@Autowired
    private  AerolineaClient aerolineaClient;
	
	public AvionDTO entityToDto(Avion avion){
		
	if(avion==null){
		return null;
	}
	
	AvionDTO avionDto=new AvionDTO();
	avionDto.setId(avion.getId());
	avionDto.setNumRegistro(avion.getNumRegistro());
	avionDto.setTipo(avion.getTipo());
	avionDto.setCodigoModelo(avion.getCodigoModelo());
	avionDto.setCapacidad(avion.getCapacidad());
	avionDto.setFechaPrimerVuelo(avion.getFechaPrimerVuelo());
	avionDto.setEstatus(avion.getEstatus());
	avionDto.setIdAerolinea(avion.getAerolinea()!=null ? avion.getAerolinea().getId():null);
	
	return avionDto;
	}
	
	public Avion dtoToEntity(AvionDTO avionDTO) {
		if(avionDTO==null){
			return null;
		}
		Avion avion= new Avion();
		avion.setId(avionDTO.getId());
		avion.setNumRegistro(avionDTO.getNumRegistro());
		avion.setTipo(avionDTO.getTipo());
		avion.setCodigoModelo(avionDTO.getCodigoModelo());
		avion.setCapacidad(avionDTO.getCapacidad());
		avion.setFechaPrimerVuelo(avionDTO.getFechaPrimerVuelo());
		avion.setEstatus(avionDTO.getEstatus());
		Optional<Aerolinea> aerolinea=aerolineaClient.getAerolineaById(avionDTO.getIdAerolinea());
		avion.setAerolinea(aerolinea.isPresent()?aerolinea.get():null);
		return avion;
	}
}
