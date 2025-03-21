package com.elsa.aviones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EntityScan({"com.elsa.commons.models.entity"})
public class MicroserviciosAvionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosAvionesApplication.class, args);
	}

}
