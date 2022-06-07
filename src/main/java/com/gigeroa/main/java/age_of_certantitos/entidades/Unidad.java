package com.gigeroa.main.java.age_of_certantitos.entidades;

import com.gigeroa.main.java.age_of_certantitos.util.Util;

public abstract class Unidad implements Persona {
	protected final static Integer GUERRERO_VIDA = 150;
	protected final static Integer GUERRERO_POTENCIA = 75;
	protected final static Integer MAGO_VIDA = 75;
	protected final static Integer ARQUERO_VIDA = 100;
	private Integer vida;
	private Integer potenciaDeAtaque;

	public Unidad() {

	}

	public Unidad(Integer vida, Integer potenciaDeAtaque) {
		this.vida = vida;
		this.potenciaDeAtaque = potenciaDeAtaque;
	}

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public Integer getPotenciaDeAtaque() {
		return potenciaDeAtaque;
	}

	public void setPotenciaDeAtaque(Integer potenciaDeAtaque) {
		this.potenciaDeAtaque = potenciaDeAtaque;
	}
	
	public void atacar(Unidad unidad) {
		unidad.serAtacado(this);
	}

	public void serAtacado(Unidad unidad) {
		int diferencia = getVida()-unidad.getPotenciaDeAtaque();
		if (diferencia < 0) {
			this.morir();
		}
		else {
			setVida(getVida()-unidad.getPotenciaDeAtaque());
		}
	}
	
	public void morir() {
		Util.escribir(getNombre() + " ha muerto.");
	}

}