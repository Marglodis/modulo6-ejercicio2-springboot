package com.ejercicio2.modulo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;


@Component("profesor")
@AllArgsConstructor
public class Profesor {
	
	@Qualifier("calculadora")
	@Autowired
	private ICalculadora calculadora;
	
	public void mostrarAlumnos() {
		System.out.println(calculadora.calcularPromedios().toString());
	}

}
