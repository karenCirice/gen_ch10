package org.generation.pruebas;

public class pruebaPelicula {
	public static void main(String[] args) {
		Pelicula pikachu = new Pelicula ("DetectivePikachu", "AA", 4);
		Pelicula padrino = new Pleicula ("El Padrino", "C", 1);
		Pelicula sangre = new Pleicula ("SangreXSangre", "D", 4);
		Pelicula batman = new Pleicula ("Batman", "VL", 4);
		Pelicula risaVacaciones = new Pleicula ("La risa en vacaciones", "C", 1);
		
		//Vamos a poner todo en un array list y tenemos que importarla
	ArrayList<Pelicula> catalogo =new ArrayList<Pelicula>();
	catalogo.add(padrino);
	catalogo.add(pikachu);
	catalogo.add(batman);
	catalogo.add(risaVacaciones);
	
	for (Pelicula pelicula : catalogo) {
		System.out.println("Próximo estreno" +pelicula.getNombre());
		
	}
	catalogo.forEach(pelicula -> {
		System.out.println(pelicula);
	});

	}


}
