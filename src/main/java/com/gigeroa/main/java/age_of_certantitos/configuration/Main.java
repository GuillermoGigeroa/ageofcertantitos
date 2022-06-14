package com.gigeroa.main.java.age_of_certantitos.configuration;

import com.gigeroa.main.java.age_of_certantitos.entidades.*;
import com.gigeroa.main.java.age_of_certantitos.entidades.armas.*;
import com.gigeroa.main.java.age_of_certantitos.entidades.unidades.*;
import com.gigeroa.main.java.age_of_certantitos.excepciones.ArmaNoExisteException;
//import com.gigeroa.main.java.age_of_certantitos.util.Util;

public class Main {

	public static void main(String[] args) throws ArmaNoExisteException {
		Posicion posicion1 = new Posicion(0.0);
		Posicion posicion2 = new Posicion(1.0);
		Posicion posicion3 = new Posicion(2.0);
		Posicion posicionEnemigo = new Posicion(4.0);

		Arquero arquero1 = new Arquero();
		arquero1.setPosicion(posicion1);
//		Util.escribirUnidadDatos(arquero1);
		
		Arquero arquero2 = new Arquero();
		arquero2.setPosicion(posicion2);
//		Util.escribirUnidadDatos(arquero2);
		
		Arquero arquero3 = new Arquero();
		arquero3.setPosicion(posicion3);
//		Util.escribirUnidadDatos(arquero3);
		
		Guerrero enemigo1 = new Guerrero();
		enemigo1.setPosicion(posicionEnemigo);
//		Util.escribirUnidadDatos(enemigo1);
		
		Espada espada = new Espada();
		Espadachin enemigo2 = new Espadachin(espada);
		enemigo2.setPosicion(posicionEnemigo);
//		Util.escribirUnidadDatos(enemigo2);
		
		arquero1.atacar(enemigo1);
		enemigo1.atacar(arquero1);
		arquero1.atacar(enemigo1);
		enemigo1.atacar(arquero1);
		
	}

}
