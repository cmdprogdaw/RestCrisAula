package com.cris.restCris.gato;

public class Coches {

	private String modelo;
	private String marca;
	private Integer puertas;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getPuertas() {
		return puertas;
	}
	public void setPuertas(Integer puertas) {
		this.puertas = puertas;
	}
	@Override
	public String toString() {
		return "Coches [modelo=" + modelo + ", marca=" + marca + ", puertas=" + puertas + "]";
	}
	
	
}
