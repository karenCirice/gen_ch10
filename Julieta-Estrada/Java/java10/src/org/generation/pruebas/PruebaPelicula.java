package org.generation.pruebas;

import java.util.ArrayList;

import org.generation.pelicula.*;

public class PruebaPelicula {

	public static void main (String[] arg) {
		Pelicula pikachu = new Pelicula ("Detective pikachu","AA",4);
		Pelicula padrino = new Pelicula ("El padrino","C",1);
		Pelicula sangre = new Pelicula ("Sangre x Sangre","D",4);
		Pelicula batman = new Pelicula ("Batman","VL",4);
		Pelicula vacaciones = new Pelicula ("La risa en vacaciones","a",1);
	
		ArrayList<Pelicula> catalogo = new ArrayList<Pelicula>();
		catalogo.add(padrino);
		catalogo.add(pikachu);
		catalogo.add(sangre);
		catalogo.add(batman);
		catalogo.add(vacaciones);
		
		for(Pelicula pelicula : catalogo) {
			System.out.println("Próximo estreno "+pelicula.getNombre());
		}
		
		catalogo.forEach(pelicula ->{
			System.out.println(pelicula);
		});
	}
}
