package com.gigeroa.main.java.age_of_certantitos.entidades.unidades;

import com.gigeroa.main.java.age_of_certantitos.entidades.Posicion;
import com.gigeroa.main.java.age_of_certantitos.entidades.Unidad;
import com.gigeroa.main.java.age_of_certantitos.entidades.armas.Espada;
import com.gigeroa.main.java.age_of_certantitos.excepciones.ArmaNoExisteException;

public class Espadachin extends Unidad  {
	private String nombre;
	private Espada espada;

	public Espadachin(Espada espada) throws ArmaNoExisteException {
		if (espada != null) {
			setPotenciaDeAtaque(espada.getPotenciaDeAtaque());
		} else {
			throw new ArmaNoExisteException();
		}
		setVida(GUERRERO_VIDA);
		setNombre("Espadachin");
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
	
	public Espada getEspada() {
		return espada;
	}

	public void setEspada(Espada espada) {
		this.espada = espada;
	}


}
