package com.elsa.aerolineas.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elsa.commons.models.entity.Aerolinea;

public interface AerolineaRepository extends JpaRepository<Aerolinea, Long>  {

}
