package mx.org.generation;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		// Un SET, es una colección NO ORDENADA de elementos
		//no se permite elementos duplicados
		//por lo que cualquier elemento duplicado no se insertará
		
		//definimos un HasSet de tipo String:
		HashSet<String> superHeroes = new HashSet<String>();
		
		//Agregamos valores al HashSet
		superHeroes.add("Rombo Calcetines Man");
		superHeroes.add("Thor");
		superHeroes.add("LaddyBug");
		superHeroes.add("Porfirio Cadenas");
//		System.out.println(superHeroes);
		
		
		//desplegar la longitud
		int longitud = superHeroes.size();		
//		System.out.println("Longitud total: " + longitud);
		
		//varificar si confiene un elemento 
		boolean contieneNombre = superHeroes.contains("Caliman");
//		System.out.println("Contiene a caliman? " + contieneNombre);
		
		//Removemos un elemento 
		superHeroes.remove("Thor");
//		System.out.println(superHeroes);
		
		//obtener el HasCode de los elementos HashSet
//		for(String superHeroe : superHeroes) {
//			System.out.println(System.identityHashCode(superHeroe));
//		}
		
		//Iteramos los vcalores de superHeroes
		superHeroes.forEach(heroe -> System.out.println("Here: " + heroe));
		
		
	}

}
