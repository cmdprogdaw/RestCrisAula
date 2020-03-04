package com.cris.restCris.cine;

import java.util.ArrayList;
import java.util.List;

public class Cine {

	private String nombre;
	private String lugar;
	private List<Sala> salas = new ArrayList<Sala>();

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public List<Sala> getSalas() {
		return salas;
	}
	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}
	
	@Override
	public String toString() {
		return "\n\nCine {"
				+ "\n\tnombre:" + nombre + "," 
				+ "\n\tlugar:" + lugar + ","
				+ "\n\tsalas:" + getSalas()
				+ "\n}";
	}
	
}
