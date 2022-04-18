package mx.org.generation;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		// Un SET, es una coleccion NO ORDENADA de elementos
		// NO se permite elementos duplicados
		//Por lo que cualquier elemento duplicado no se inserata
		
		// Definimos un HasSet de tipo String
		HashSet<String> superHeroes =  new HashSet<String>();
		
		//Agregamos valores al HasSet
		superHeroes.add("Rombo Calcetines Man");
		superHeroes.add("Thor");
		superHeroes.add("LadduBug");
		superHeroes.add("Porfirio Cadenas");
		superHeroes.add("Caliman");
		superHeroes.add("Chapulin Colorado");
		System.out.println(superHeroes);
		
		//Desplegar la longitud
		int longitud = superHeroes.size();
		System.out.println("Longitud total: " + longitud);
		
		//Verificar si contiene un elemento
		boolean contieneNombre = superHeroes.contains("caliman");
		System.out.println("Contene caliman? " + contieneNombre);
		
		//Removemos un elemento
		superHeroes.remove("Thor");
		System.out.println(superHeroes);
		
		//Iteramos los valores de superHeroes.
		superHeroes.forEach(heroe -> System.out.println("Heroe: " + heroe));
	}

}
