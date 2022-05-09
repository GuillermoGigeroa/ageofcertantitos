package com.gigeroa.main.java.age_of_certantitos.entidades.unidades;

import com.gigeroa.main.java.age_of_certantitos.entidades.Unidad;

public class Mago extends Unidad {
	private String nombre;
	public Mago() {
		setVida(MAGO_VIDA);
		setNombre("Mago");
		setPotenciaDeAtaque(0);
		//TODO Mago sin potencia de ataque
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
