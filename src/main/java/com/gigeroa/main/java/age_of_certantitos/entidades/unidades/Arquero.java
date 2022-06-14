package com.gigeroa.main.java.age_of_certantitos.entidades.unidades;

import com.gigeroa.main.java.age_of_certantitos.entidades.Posicion;
import com.gigeroa.main.java.age_of_certantitos.entidades.Unidad;
import com.gigeroa.main.java.age_of_certantitos.servicios.CalculadorDistancia;

public class Arquero extends Unidad {
	private String nombre;
	private final Double limiteDistancia = 10.0;
	
	public Arquero() {
		setVida(ARQUERO_VIDA);
		setNombre("Arquero");
		setPotenciaDeAtaque(0.0);
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
	
	@Override
	public void atacar(Unidad unidad) {
		Double distancia = CalculadorDistancia.calcularDistancia(this.getPosicion(), unidad.getPosicion());
		Double potenciaDeAtaque = 1/distancia*100;
		
		if (distancia > limiteDistancia) {
			potenciaDeAtaque = 0.0;
		}
		
		setPotenciaDeAtaque(potenciaDeAtaque);
		unidad.serAtacado(this);
		setPotenciaDeAtaque(0.0);
	}

}
