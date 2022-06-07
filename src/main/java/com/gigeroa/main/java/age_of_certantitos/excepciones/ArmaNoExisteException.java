package com.gigeroa.main.java.age_of_certantitos.excepciones;

public class ArmaNoExisteException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// Nullpointer catcher
		return "El arma no existe.";
	}
	
	
}
