package com.gigeroa.main.java.age_of_certantitos.entidades.unidades;

import com.gigeroa.main.java.age_of_certantitos.entidades.Unidad;

public class Arquero extends Unidad {
	private String nombre;
	
	public Arquero() {
		setVida(ARQUERO_VIDA);
		setNombre("Arquero");
		setPotenciaDeAtaque(0);
		//TODO Arquero sin potencia de ataque
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
