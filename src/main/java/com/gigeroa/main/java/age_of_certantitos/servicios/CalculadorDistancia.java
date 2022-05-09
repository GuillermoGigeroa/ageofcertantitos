package com.gigeroa.main.java.age_of_certantitos.servicios;

import com.gigeroa.main.java.age_of_certantitos.entidades.Posicion;
import com.gigeroa.main.java.age_of_certantitos.servicios.CalculadorDistancia;

public abstract class CalculadorDistancia{

	public static Integer calcularDistancia(Posicion posicion1, Posicion posicion2) {
		Integer calculo = posicion1.getEjeX()-posicion2.getEjeX();
		//TODO Falta la posicion en Y
		if (calculo < 0){
			return -calculo;
		}
		else {
			return calculo;
		}
	}
	
}
