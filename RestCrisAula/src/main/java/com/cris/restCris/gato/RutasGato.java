package com.cris.restCris.gato;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RutasGato {

	@GetMapping("/gato")
	public ResponseEntity<Gato> gato(){
		
		Gato gato = new Gato();
		gato.setNombre("Max");
		gato.setColor("Gris");
		gato.setEdad(4);
		
		return new ResponseEntity<Gato>(gato, HttpStatus.OK);
	}
	
	
	
	@PostMapping(value="/addGato")
	ResponseEntity<Gato> addGato(@RequestBody Gato gato) {
		
		return new ResponseEntity<Gato>(gato, HttpStatus.OK);
	}
}
