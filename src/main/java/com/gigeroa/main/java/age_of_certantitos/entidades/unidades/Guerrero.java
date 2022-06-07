package com.gigeroa.main.java.age_of_certantitos.entidades.unidades;

import com.gigeroa.main.java.age_of_certantitos.entidades.Posicion;
import com.gigeroa.main.java.age_of_certantitos.entidades.Unidad;

public class Guerrero extends Unidad {
	private String nombre;

	public Guerrero() {
		setVida(GUERRERO_VIDA);
		setNombre("Guerrero");
		setPotenciaDeAtaque(GUERRERO_POTENCIA);
		setPosicion(new Posicion());
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
