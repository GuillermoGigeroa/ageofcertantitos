package com.gigeroa.main.java.age_of_certantitos.configuration;

import com.gigeroa.main.java.age_of_certantitos.entidades.unidades.Espadachin;
import com.gigeroa.main.java.age_of_certantitos.entidades.unidades.Mago;
import com.gigeroa.main.java.age_of_certantitos.entidades.armas.Espada;
import com.gigeroa.main.java.age_of_certantitos.excepciones.ArmaNoExisteException;
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
