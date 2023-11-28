package com.prueba.deployprueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployPruebaApplication {
	
	@GetMapping("/mensaje")
	public String mensaje() {
		return "mensaje desde api";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DeployPruebaApplication.class, args);
	}

}
