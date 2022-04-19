package mx.org.generation;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		//Un SET, es una coleccion no ordenada de elementos
		//NO se permiten elementos duplicados
		//Por lo que cualquier elemento duplicado no se insertara
		
		//Definimos un HasSet de tipo String
		HashSet<String> superheroes = new HashSet<String>();
		
		//Agregamos valores al HashSet
		superheroes.add("Rombo Calcetines Man");
		superheroes.add("Thor");
		superheroes.add("Flash");
		superheroes.add("Caliman");
		
		System.out.println(superheroes);
		
		//Desplegar la longitud
		int longitud = superheroes.size();
		System.out.println("La longitud total es: "+longitud);
		
		//Verificar si contienen un elemento
		boolean contieneNombre = superheroes.contains("Flash");
		System.out.println("CONTIENE FLASH?"+contieneNombre);
		
		//Remover un elemento
		superheroes.remove("Rombo Calcetines Man");
		System.out.println(superheroes);
		
		//Obtener el HashCode de los elemntos HashSet
//		for (String superHeroe : superHeroes) {
//            System.out.println(System.identityHashCode(superHeroe));
//        }
		
		//Iteramos los valores superheroes
		superheroes.forEach(heroe -> 
			System.out.println("Heroe: "+heroe)
				);
	}

}
