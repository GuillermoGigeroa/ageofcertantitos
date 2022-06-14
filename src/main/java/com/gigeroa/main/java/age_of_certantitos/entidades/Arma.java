package com.gigeroa.main.java.age_of_certantitos.entidades;

public abstract class Arma {
	protected final static Double ESPADA_LIGERA_POTENCIA = 100.0;
	protected final static Double ESPADA_MEDIA_POTENCIA = 125.0;
	protected final static Double ESPADA_PESADA_POTENCIA = 150.0;
	private Double dureza;
	private Double potenciaDeAtaque;

	public Arma() {
		this.dureza = 100.0;
	}

	public Double getDureza() {
		return dureza;
	}

	public void setDureza(Double dureza) {
		this.dureza = dureza;
	}
	
	public Double getPotenciaDeAtaque() {
		return potenciaDeAtaque;
	}

	public void setPotenciaDeAtaque(Double potenciaDeAtaque) {
		this.potenciaDeAtaque = potenciaDeAtaque;
	}
	
}