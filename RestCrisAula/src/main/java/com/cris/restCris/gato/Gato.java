package com.cris.restCris.gato;

public class Gato {

	private String nombre;
	private String color;
	private Integer edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", color=" + color + ", edad=" + edad + "]";
	}
	
	
	
}
