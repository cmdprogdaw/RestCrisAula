package com.cris.restCris;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cris.restCris.gato.Gato;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class RestCrisAulaApplicationTests {

	@Test
	void pruebaGET() throws URISyntaxException {
		
		URI myUrl = new URI("http://localhost:9090/gato");
		RequestEntity<Gato> request = new RequestEntity<Gato>(HttpMethod.GET, myUrl); 
		
		ResponseEntity<Gato> response;
		RestTemplate ejecutor = new RestTemplate();
		response = ejecutor.exchange(request, Gato.class);
		
		System.out.println(response.getBody());
		System.out.println(response.hasBody());
		
		assertTrue(response.hasBody());
	}
	
	@Test
	void pruebaPOST() throws URISyntaxException {
		
		Gato gato = new Gato();
		gato.setNombre("Blacky");
		gato.setColor("Negro");
		gato.setEdad(6);
		
		URI myUrl = new URI("http://localhost:9090/addGato");
		RequestEntity<Gato> request = new RequestEntity<Gato>(gato, HttpMethod.POST, myUrl); 
		
		ResponseEntity<Gato> response;
		RestTemplate ejecutor = new RestTemplate();
		response = ejecutor.exchange(request, Gato.class);
		
		System.out.println(response.getBody());
		System.out.println(response.hasBody());
		
		assertTrue(request.hasBody());
		assertTrue(response.hasBody());
	}
	
}
