package com.ejercicio2.modulo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PSpringBootApplication.class, args);
	}

	@Qualifier("profesor")
	@Autowired
	Profesor profesor;

	@Override
	public void run(String... args) throws Exception {
		profesor.mostrarAlumnos();
		
	}
	
	
}
