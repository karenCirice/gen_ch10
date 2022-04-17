package mx.org.generation;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		// un Set, es una collección NO ORDENADA de elementos
		//NO se permite elementos duplicados.
		//Por lo que cualquier elemento duplicado no se insertará.
		
		//Definimos un HasSet de tipo string.
		HashSet<String> superHeroes = new HashSet<String>();
		
		//Agregamos valores al HashSet
		superHeroes.add("Rombo Calcetines Man");
		superHeroes.add("Thor");
		superHeroes.add("LadyBug");
		superHeroes.add("Porfirio Cadenas");
		superHeroes.add("Caliman");
		superHeroes.add("Chapulín Colorado");
		System.out.println(superHeroes);
		
		//Desplegar la longitud
		int longitud = superHeroes.size();
		System.out.println("Longitud total :" + longitud);
		
		//Verificar si contiene un elemento
		boolean contieneNombre = superHeroes.contains("Caliman");
		System.out.println("Contiene Caliman? " + contieneNombre);
		
		//Removemos un elemento
		superHeroes.remove("Thor");
		superHeroes.remove("Caliman");
		superHeroes.remove("Caliman");
		System.out.println(superHeroes);
		
//		//Obtener el hashCode de los elementos HasHSeT, no me debe de interesar, solo fines educativos
//		for (String superHeroe : superHeroes) {
//			System.out.println(System.identyHashode(superHeroe));
//	      }
			
		//Iteremos los valores superHeroes.
		superHeroes.forEach(heroe -> System.out.println("Heroe :" + heroe));
		
		}
				
	}


