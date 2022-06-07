package com.gigeroa.main.java.age_of_certantitos.entities.units;

import com.gigeroa.main.java.age_of_certantitos.entities.Unidad;

public class Guerrero extends Unidad {
	private String nombre;

	public Guerrero() {
		setVida(GUERRERO_VIDA);
		setNombre("Guerrero");
		setPotenciaDeAtaque(GUERRERO_POTENCIA);
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
