package mx.org.generation;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		//Un set, es una colección NO ORDENADA de elementos
		//NO se permite elementos duplicados.
		//Por lo que cualquier elemento duplicado no se insertará.
		
		//Definimos un HasSet de tipo string.
		HashSet<String> superHeroes = new HashSet<String>();
		
		//Agregamos valores al HashSet
		superHeroes.add("Rombo Calcetines Man");
		superHeroes.add("Thor");
		superHeroes.add("LaddyBug");
		superHeroes.add("Porfirio Cadenas");
		superHeroes.add("Caliman");
		superHeroes.add("Chapulin Colorado");
		System.out.println(superHeroes);
		
		//Desplegar la longuitud
		int longitud = superHeroes.size();
		System.out.println("Longitud : " + longitud);
		
		//Verificar si contiene un elemento
		boolean contieneNombre = superHeroes.contains("Caliman");
		System.out.println("Contiene Caliman? "+ contieneNombre);
		
		//Removemos un elemento
		superHeroes.remove("Thor");
		superHeroes.add("Caliman");
		superHeroes.add("Caliman");
		System.out.println(superHeroes);
		
		//Obtener el HashCode de los elementos HasSet
//		for (String superHeroe : superHeroes) {
 //           System.out.println(System.identityHashCode(superHeroe));
//        }

		//Iteramos los valores de superHeroes.
		superHeroes.forEach(heroe -> System.out.println("Heroe : "+ heroe));
		
		
	}

}
