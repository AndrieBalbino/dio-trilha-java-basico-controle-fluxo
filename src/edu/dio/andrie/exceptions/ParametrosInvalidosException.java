package edu.dio.andrie.exceptions;

@SuppressWarnings("serial")
public class ParametrosInvalidosException extends RuntimeException{

	@Override
	public String getMessage() {
		return "O segundo parâmetro deve ser maior que o primeiro";
	}
}
