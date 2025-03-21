package com.elsa.aerolineas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.elsa.commons.models.entity"})
public class MicroserviciosAerolineasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosAerolineasApplication.class, args);
	}

}
