package mx.org.generation;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {

	public static void main(String[] args) {
		//Un set, es una coleccion NO ORDENADA de elementos
		//No se permite elementos duplicados
		//Por lo que cualquier elemento duplicado no se insertara
		
		//Definimos un HasSet de tipo string
		
		HashSet<String> superHeroes = new HashSet<String>();
		
		//Agregamos valor al Hashset
		superHeroes.add("Rombo calcetines Man");
		superHeroes.add("Thor");
		superHeroes.add("LadyBug");
		superHeroes.add("Porfirio Cadenas");
		superHeroes.add("Caliman");
		superHeroes.add("Chapulin Colorado");
		System.out.println(superHeroes);
		System.out.println(superHeroes);
		
		//Desplegar la longitud
		int longitud = superHeroes.size();
		System.out.println("Longitud total :" + longitud);
		
		//verificar si contiene un elemento
		boolean contieneNombre = superHeroes.contains("Caliman");
		System.out.println("Contiene Caliman? " + contieneNombre);
		
		//Removemos un elemento
		superHeroes.remove("Thor");
		superHeroes.add("Caliman");
		superHeroes.add("Caliman");
		System.out.println(superHeroes);
		
//		//Obtener el HashCode de los elementos HashSet
//		for (String superHeroe : superHeroes) {
//			System.out.println(System.identityHashCode(superHeroe));
//		}
		
		//Iteramos 
		
		superHeroes.forEach(heroe -> System.out.println("Heroe :" + heroe));
	}

}
