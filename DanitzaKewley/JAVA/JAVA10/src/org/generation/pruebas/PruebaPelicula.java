package org.generation.pruebas;

import java.util.ArrayList;

import org.generation.pelicula.Pelicula;

public class PruebaPelicula {

	public static void main(String[] args) {
		Pelicula pikachu = new Pelicula ("Detective Pikachu", "AA", 4);
		Pelicula padrino = new Pelicula ("El Padrino", "C", 1);
		Pelicula sangre = new Pelicula ("SangreXSangre", "D", 4);
		Pelicula batman = new Pelicula ("Batman", "VL", 4);
		Pelicula risaVacaciones = new Pelicula ("La risa en vacaciones", "C", 4);
		
		ArrayList<Pelicula> catalogo = new ArrayList<Pelicula>();
		catalogo.add(risaVacaciones);
		catalogo.add(sangre);
		catalogo.add(batman);
		catalogo.add(padrino);
		catalogo.add(pikachu);
		
		for (Pelicula pelicula : catalogo) {
			System.out.println("Proximo estreno " + pelicula.getNombre());
		}
		
		catalogo.forEach(pelicula ->{
			System.out.println(pelicula);
		});
	}

}
