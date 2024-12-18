package com.ejercicio2.modulo6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
@Component("calculadora")
public class Calculadora implements ICalculadora{
	
	@Qualifier("listaAlumnos")
	@Autowired
	private List<Alumno> alumnos;
	
	@Override
	public List<Alumno> calcularPromedios() {
		for(Alumno alumno : alumnos) {
			float sumaNotas = 0;
			for(int i=0; i< alumno.getNotas().size();i++) {
				sumaNotas += alumno.getNotas().get(i);
			}
			float promedio = sumaNotas / alumno.getNotas().size();
			alumno.setPromedio(promedio);
		}
		return alumnos;
	}
	

}
