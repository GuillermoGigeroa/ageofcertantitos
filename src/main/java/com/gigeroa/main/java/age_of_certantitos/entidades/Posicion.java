package com.gigeroa.main.java.age_of_certantitos.entidades;

public class Posicion {
	private Integer ejeX;
	private Integer ejeY;

	public Posicion() {
		this.ejeX = 0;
		this.ejeY = 0;
	}
	
	public Posicion(int ejeX) {
		this.ejeX = ejeX;
		this.ejeY = 0;
	}
	
	public Posicion(int ejeX, int ejeY) {
		this.ejeX = ejeX;
		this.ejeY = ejeY;
	}

	public int getEjeX() {
		return ejeX;
	}

	public void setEjeX(int ejeX) {
		this.ejeX = ejeX;
	}

	public int getEjeY() {
		return ejeY;
	}

	public void setEjeY(int ejeY) {
		this.ejeY = ejeY;
	}
	
}