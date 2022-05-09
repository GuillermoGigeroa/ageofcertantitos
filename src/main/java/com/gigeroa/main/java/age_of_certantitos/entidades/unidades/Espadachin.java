package com.gigeroa.main.java.age_of_certantitos.entidades.unidades;

import com.gigeroa.main.java.age_of_certantitos.entidades.armas.Espada;
import com.gigeroa.main.java.age_of_certantitos.exceptions.ArmaNoExisteException;
import com.gigeroa.main.java.age_of_certantitos.entidades.Unidad;

public class Espadachin extends Unidad  {
	private Espada espada;
	private String nombre;

	public Espadachin(Espada espada) throws ArmaNoExisteException {
		setVida(GUERRERO_VIDA);
		setNombre("Espadachin");
		if (espada != null) {
			setPotenciaDeAtaque(espada.getPotenciaDeAtaque());
		} else {
			throw new ArmaNoExisteException();
		}
	}

	public Espada getEspada() {
		return espada;
	}

	public void setEspada(Espada espada) {
		this.espada = espada;
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
