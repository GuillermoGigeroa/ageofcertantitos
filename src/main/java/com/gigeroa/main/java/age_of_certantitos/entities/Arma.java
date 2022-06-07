package com.gigeroa.main.java.age_of_certantitos.entities;

public abstract class Arma {
	protected final static Integer ESPADA_LIGERA_POTENCIA = 100;
	protected final static Integer ESPADA_MEDIA_POTENCIA = 125;
	protected final static Integer ESPADA_PESADA_POTENCIA = 150;
	private Integer dureza;
	private Integer potenciaDeAtaque;

	public Arma() {
		this.dureza = 100;
	}

	public Integer getDureza() {
		return dureza;
	}

	public void setDureza(Integer dureza) {
		this.dureza = dureza;
	}
	
	public Integer getPotenciaDeAtaque() {
		return potenciaDeAtaque;
	}

	public void setPotenciaDeAtaque(Integer potenciaDeAtaque) {
		this.potenciaDeAtaque = potenciaDeAtaque;
	}
	
}