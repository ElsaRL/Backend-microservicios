package com.elsa.aeropuertos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.elsa.commons.models.entity"})
public class MicroserviciosAeropuertosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosAeropuertosApplication.class, args);
	}

}
