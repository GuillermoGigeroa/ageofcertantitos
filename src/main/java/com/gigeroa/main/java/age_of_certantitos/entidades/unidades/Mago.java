package com.gigeroa.main.java.age_of_certantitos.entidades.unidades;

import com.gigeroa.main.java.age_of_certantitos.entidades.Posicion;
import com.gigeroa.main.java.age_of_certantitos.entidades.Unidad;
import com.gigeroa.main.java.age_of_certantitos.servicios.CalculadorDistancia;

public class Mago extends Unidad {
	private String nombre;
	public Mago() {
		setVida(MAGO_VIDA);
		setNombre("Mago");
		setPotenciaDeAtaque(0);
		setPosicion(new Posicion());
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

	@Override
	public void atacar(Unidad unidad) {
		Integer distancia = CalculadorDistancia.calcularDistancia(this.getPosicion(), unidad.getPosicion());
		Integer potenciaDeAtaque = 1/distancia*200;
		
		if (distancia >= 5) {
			potenciaDeAtaque = 0;
		}
		
		setPotenciaDeAtaque(potenciaDeAtaque);
		unidad.serAtacado(this);
		setPotenciaDeAtaque(0);
	}
}
