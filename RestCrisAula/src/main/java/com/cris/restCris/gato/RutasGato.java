package com.cris.restCris.gato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RutasGato {
	
	@Autowired
	Gato max;

	@GetMapping("/gato")
	public ResponseEntity<Gato> gato(){
		
		return new ResponseEntity<Gato>(max, HttpStatus.OK);
	}
	
	
	
	@PostMapping(value="/addGato")
	ResponseEntity<Gato> addGato(@RequestBody Gato gato) {
		
		return new ResponseEntity<Gato>(gato, HttpStatus.OK);
	}
}
