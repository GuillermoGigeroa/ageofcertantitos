package com.gigeroa.main.java.age_of_certantitos.util;

import com.gigeroa.main.java.age_of_certantitos.entities.Arma;
import com.gigeroa.main.java.age_of_certantitos.entities.Unidad;

public abstract class Util {
	public static void escribir(Object esto) {
		System.out.println(esto.toString());
	}
	
	public static void escribirVida(Unidad unidad) {
		escribir("Vida de la unidad "+unidad.getNombre()+": "+unidad.getVida());
	}
	
	public static void escribirPotenciaDeAtaque(Unidad unidad) {
		escribir("Potencia de ataque de la unidad: "+unidad.getPotenciaDeAtaque());
	}
	
	public static void escribirPotenciaArma(Arma arma) {
		escribir("Potencia del arma: "+arma.getPotenciaDeAtaque());
	}
	
	public static void escribirUnidadCreada(Unidad unidad) {
		escribir("Se ha creado la unidad "+unidad.getNombre());
	}
	
	public static void escribirAtaque(Unidad atacante, Unidad defensor) {
		escribir("La unidad "+atacante.getNombre()+" ataca a "+defensor.getNombre());
	}
	
	public static void escribirUnidadDatos(Unidad unidad) {
		escribirUnidadCreada(unidad);
		escribirVida(unidad);
		escribirPotenciaDeAtaque(unidad);
	}
}
