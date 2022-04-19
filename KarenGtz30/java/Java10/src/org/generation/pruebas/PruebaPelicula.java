package org.generation.pruebas;

import java.util.ArrayList;

import org.generation.pelicula.Pelicula;

public class PruebaPelicula {

	public static void main(String[] args) {
		Pelicula titanic = new Pelicula ("Titanic", "B", 1);
		Pelicula elTitere = new Pelicula ("El titere", "C", 2);
		Pelicula avatar = new Pelicula ("Avatar", "A", 1);
		Pelicula elLorax = new Pelicula ("El Lorax", "AA", 1);
		Pelicula theBatman = new Pelicula ("The Batman", "VL", 1);
		
		ArrayList<Pelicula> catalogo = new ArrayList<Pelicula>();
		catalogo.add(elTitere);
		catalogo.add(titanic);
		catalogo.add(elLorax);
		catalogo.add(theBatman);
		
		for (Pelicula pelicula : catalogo) {
			System.out.println("Próximo estreno "+pelicula.getNombre());
		}
		
		catalogo.forEach(pelicula ->{
			System.out.println(pelicula);
		});
		
	}

}