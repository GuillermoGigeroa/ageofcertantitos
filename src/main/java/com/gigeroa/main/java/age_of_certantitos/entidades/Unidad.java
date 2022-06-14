package com.gigeroa.main.java.age_of_certantitos.entidades;

import com.gigeroa.main.java.age_of_certantitos.util.Util;

public abstract class Unidad implements Persona {
	protected final static Double GUERRERO_VIDA = 150.0;
	protected final static Double GUERRERO_POTENCIA = 75.0;
	protected final static Double MAGO_VIDA = 75.0;
	protected final static Double ARQUERO_VIDA = 100.0;
	private Double vida;
	private Double potenciaDeAtaque;
	private Posicion posicion;

	public Unidad() {

	}

	public Unidad(Double vida, Double potenciaDeAtaque) {
		this.vida = vida;
		this.potenciaDeAtaque = potenciaDeAtaque;
	}

	public Double getVida() {
		return vida;
	}

	public void setVida(Double vida) {
		this.vida = vida;
	}

	public Double getPotenciaDeAtaque() {
		return potenciaDeAtaque;
	}

	public void setPotenciaDeAtaque(Double potenciaDeAtaque) {
		this.potenciaDeAtaque = potenciaDeAtaque;
	}
	
	public void atacar(Unidad unidad) {
		unidad.serAtacado(this);
	}

	public void serAtacado(Unidad unidad) {
		Util.escribir(this.getNombre()+" tiene "+this.getVida()+" de salud y ha sido atacado por "+unidad.getNombre());
		Util.escribir(this.getNombre()+" ha sufrido "+unidad.getPotenciaDeAtaque()+" de daño");
		
		Double diferencia = getVida()-unidad.getPotenciaDeAtaque();
		if (diferencia < 0) {
			this.morir();
		}
		else {
			setVida(getVida()-unidad.getPotenciaDeAtaque());
			Util.escribir(this.getNombre()+" tiene "+this.getVida()+" de salud");
		}
		
	}
	
	public void morir() {
		this.vida = 0.0;
		Util.escribir(getNombre() + " ha muerto.");
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

}