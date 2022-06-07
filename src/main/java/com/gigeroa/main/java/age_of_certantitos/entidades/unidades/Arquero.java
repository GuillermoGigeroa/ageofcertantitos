package com.gigeroa.main.java.age_of_certantitos.entidades.unidades;

import com.gigeroa.main.java.age_of_certantitos.entidades.Posicion;
import com.gigeroa.main.java.age_of_certantitos.entidades.Unidad;
import com.gigeroa.main.java.age_of_certantitos.servicios.CalculadorDistancia;

public class Arquero extends Unidad {
	private String nombre;
	
	public Arquero() {
		setVida(ARQUERO_VIDA);
		setNombre("Arquero");
		setPotenciaDeAtaque(0);
		setPosicion(new Posicion());
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
	
	@Override
	public void atacar(Unidad unidad) {
		Integer distancia = CalculadorDistancia.calcularDistancia(this.getPosicion(), unidad.getPosicion());
		Integer potenciaDeAtaque = 1/distancia*100;
		
		if (distancia >= 5) {
			potenciaDeAtaque = 0;
		}
		
		setPotenciaDeAtaque(potenciaDeAtaque);
		unidad.serAtacado(this);
		setPotenciaDeAtaque(0);
	}

}
