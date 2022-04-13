package mx.org.generation;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		// Un SET, e suna coleccion ordenada de elementos
		//No se permite elemento duplicados.
		//por lo que cualquie elmento duplicado no se insertara.

		//Definimo un HasSet de tipo string.
		HashSet<String> superHeroes = new HashSet<String>();
		
		//Agregamos valores al HashSet
		superHeroes.add("Rombo Calcetines Man");
		superHeroes.add("Thor");
		superHeroes.add("LaddyBug");
		superHeroes.add("Porfirio Cadenas");
		superHeroes.add("Caliman");
		superHeroes.add("Chapulin Colorado");
		System.out.println(superHeroes);
		
		//Desplegar la longitud
		int longitud = superHeroes.size();
		System.out.println("Longitud total: " +longitud);
		
		//Verificar si contiene un elemento
		boolean contieneNombre = superHeroes.contains("Caliman");
		System.out.println("Contiene Caliman: " + contieneNombre);
		
		//Removemos un elemento
		superHeroes.remove("Thor");
		System.out.println(superHeroes);
		
		//ITeramos los valores de superHeroes.
		superHeroes.forEach(heroe -> System.out.println("Heroes: " + heroe));
		
		
	}

}
