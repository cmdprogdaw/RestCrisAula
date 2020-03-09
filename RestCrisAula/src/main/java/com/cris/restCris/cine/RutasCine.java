package com.cris.restCris.cine;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RutasCine {

	@GetMapping("/cine")
	public ResponseEntity<Cine> cine(){
		
		Cine cine = new Cine();
		cine.setNombre("Artesiete Mieres");
		cine.setLugar("Mieres");
		
		Sala sala1 = new Sala();
		sala1.setNumero(1);
		sala1.setCapacidad(300);
		
		Sala sala2 = new Sala();
		sala2.setNumero(2);
		sala2.setCapacidad(1000);
		
		cine.getSalas().add(sala1);
		cine.getSalas().add(sala2);
		
		return new ResponseEntity<Cine>(cine, HttpStatus.OK);
	}
	
	
	
	@PostMapping(value="/addCine")
	ResponseEntity<Cine> addCine(@RequestBody Cine cine) {
		
		return new ResponseEntity<Cine>(cine, HttpStatus.OK);
	}
	
	
	@PutMapping("/updateCine/{id}")
	public void update(@RequestBody Cine cine, @PathVariable Integer id) {
		
		System.out.println(cine);
		System.out.println(id);
	}
	
	
	@DeleteMapping("/deleteCine/{id}")
	public void delete(@PathVariable Integer id) {
		
		System.out.println(id);
	}
}
