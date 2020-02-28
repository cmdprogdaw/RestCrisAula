package com.cris.restCris.reloj;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RutasReloj {

	@GetMapping("/unReloj")
	public Reloj unReloj() {
		
		Reloj reloj = new Reloj();
		reloj.setNombre("Buenos Aires");
		reloj.setHora(12);
		reloj.setMinutos(45);
		reloj.setSegundos(34);
		
		return reloj;
	}
	
	
	@GetMapping("/relojes")
	public List<Reloj> relojes() {
		
		List<Reloj> relojes = new ArrayList<Reloj>();
		
		Reloj reloj1 = new Reloj();
		reloj1.setNombre("Buenos Aires");
		reloj1.setHora(12);
		reloj1.setMinutos(45);
		reloj1.setSegundos(34);
		
		Reloj reloj2 = new Reloj();
		reloj2.setNombre("Tokio");
		reloj2.setHora(19);
		reloj2.setMinutos(45);
		reloj2.setSegundos(34);
		
		relojes.add(reloj1);
		relojes.add(reloj2);
		
		return relojes;
	}
	
}
