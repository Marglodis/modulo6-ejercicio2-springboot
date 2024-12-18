package com.ejercicio2.modulo6;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Alumno {
	private String rut;
	private String nombre;
	private List<Integer> notas;
	private Float promedio;

}
