package com.gigeroa.main.java.age_of_certantitos.configuration;

import com.gigeroa.main.java.age_of_certantitos.entities.units.Espadachin;
import com.gigeroa.main.java.age_of_certantitos.entities.units.Mago;
import com.gigeroa.main.java.age_of_certantitos.entities.weapons.Espada;
import com.gigeroa.main.java.age_of_certantitos.exceptions.ArmaNoExisteException;
import com.gigeroa.main.java.age_of_certantitos.util.Util;

public class Main {

	public static void main(String[] args) throws ArmaNoExisteException {
		Espada espada = new Espada();
		Espadachin espadachin = new Espadachin(espada);
		Util.escribirUnidadDatos(espadachin);
		Util.escribirPotenciaArma(espada);

		Mago mago = new Mago();
		Util.escribirUnidadDatos(mago);
		
		Util.escribirAtaque(espadachin, mago);
		espadachin.atacar(mago);
	}

}
