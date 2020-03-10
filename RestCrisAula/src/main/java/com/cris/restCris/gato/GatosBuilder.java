package com.cris.restCris.gato;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatosBuilder {

	@Bean
	public Gato Max() {
		
		Gato max = new Gato();
		max.setNombre("Max");
		max.setColor("gris");
		max.setEdad(4);
		
		return max;
	}
}
