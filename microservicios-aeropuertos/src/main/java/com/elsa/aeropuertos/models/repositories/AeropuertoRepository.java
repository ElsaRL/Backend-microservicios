package com.elsa.aeropuertos.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elsa.commons.models.entity.Aeropuerto;

public interface AeropuertoRepository extends JpaRepository<Aeropuerto, Long> {

}
