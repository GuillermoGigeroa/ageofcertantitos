package com.gigeroa.main.java.age_of_certantitos.entidades;

public class Posicion {
	private Double ejeX;
	private Double ejeY;

	public Posicion() {
		this.ejeX = 0.0;
		this.ejeY = 0.0;
	}
	
	public Posicion(Double ejeX) {
		this.ejeX = ejeX;
		this.ejeY = 0.0;
	}
	
	public Posicion(Double ejeX, Double ejeY) {
		this.ejeX = ejeX;
		this.ejeY = ejeY;
	}

	public Double getEjeX() {
		return ejeX;
	}

	public void setEjeX(Double ejeX) {
		this.ejeX = ejeX;
	}

	public Double getEjeY() {
		return ejeY;
	}

	public void setEjeY(Double ejeY) {
		this.ejeY = ejeY;
	}
	
}