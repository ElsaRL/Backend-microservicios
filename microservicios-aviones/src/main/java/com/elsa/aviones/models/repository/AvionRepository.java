package com.elsa.aviones.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elsa.commons.models.entity.Avion;

public interface AvionRepository extends JpaRepository<Avion, Long>{
	

}
