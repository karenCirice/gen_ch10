package org.generation.pruebas;

import java.util.ArrayList;

import org.generation.pelicula.Pelicula;

public class PruebaPelicula {

	public static void main(String[] args) {
		Pelicula pikachu = new Pelicula ("Detective Pikachu", "AA", 4);
		Pelicula padrino = new Pelicula ("El padrino", "C", 1);
		Pelicula sangre = new Pelicula ("Sangrs x Sanfre", "D", 4);
		Pelicula risaVacaciones = new Pelicula ("La risa en vacaciones", "AA", 5);
		Pelicula batman = new Pelicula ("Batman", "VL", 5);
		
		ArrayList<Pelicula> catalogo = new ArrayList<Pelicula> ();
		catalogo.add(padrino);
		catalogo.add(pikachu);
		catalogo.add(batman);
		catalogo.add(risaVacaciones);
		
		for (Pelicula pelicula : catalogo) {
			System.out.println("Proximo estreno" + pelicula.getNombre());
		}
		
		catalogo.forEach(pelicula -> {
			System.out.println(pelicula);
		});
		
		
	}

}
