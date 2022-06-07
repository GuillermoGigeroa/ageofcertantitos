package com.gigeroa.main.java.age_of_certantitos.excepciones;

public class ArmaNoExisteException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "El arma no existe. Nullpointer catcher.";
	}
	
	
}
