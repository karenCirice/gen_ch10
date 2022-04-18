package mx.org.generation.pruebas;

import java.util.ArrayList;

import mx.org.generation.pelicula.Pelicula;

public class PruebaPelicula {

	public static void main(String[] args) {
		Pelicula pikachu = new Pelicula("Detective Pikachu", "AA", 4);
		Pelicula padrino = new Pelicula("El Padrino", "C", 1);
		Pelicula sangre = new Pelicula("SangreXSangre", "D", 4);
		Pelicula batman = new Pelicula("Batman", "VL", 4);
		Pelicula juegosHambre = new Pelicula("Los Juegos del Hambre", "B15", 4);
		
		ArrayList<Pelicula> catalogo = new ArrayList<Pelicula>();
		catalogo.add(pikachu);
		catalogo.add(padrino);
		catalogo.add(sangre);
		catalogo.add(batman);
		catalogo.add(juegosHambre);
		
		for (Pelicula pelicula : catalogo) {
			System.out.println("Próximo estreno "+pelicula.getNombre());
		}
		
		catalogo.forEach(pelicula->{
			System.out.println(pelicula);
		});
	}

}
