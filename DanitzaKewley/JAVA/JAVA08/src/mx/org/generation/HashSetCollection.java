package mx.org.generation;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {

	public static void main(String[] args) {
		//Un SET, es una coleccion NO ORDENADA de elementos
		//No se permite elementos duplicados.
		//Por lo que cualquier elemento duplicado no se insertará
		
		//Definimos un HasSet de tipo String.
		HashSet<String> superHeroes = new HashSet<String>();
		
		//Agregamos valores al HasShet
		superHeroes.add("Rombo Calcetines Man");
		superHeroes.add("Thor");
		superHeroes.add("LaddyBug");
		superHeroes.add("Porfirio Cadenas");
		superHeroes.add("Caliman");
		superHeroes.add("Chapulín Colorado");
		System.out.println(superHeroes);
		
		//Desplegar la longitud
		int longitud = superHeroes.size();
		System.out.println("Longitud total: " + longitud);
		
		//Verificar si contiene un elemento
		boolean contieneNombre = superHeroes.contains("Caliman");
		System.out.println("Contiene Caliman? " + contieneNombre);
		
		//Removemos un elemento
		superHeroes.remove("Thor");
		//No va a agregar los elementos de aqui abajo por ser eleemntos que ya estan y no acepta repetidos
		superHeroes.add("Caliman");
		superHeroes.add("Caliman");
		System.out.println(superHeroes);
		
//		//Obtener el HasCode de los elementos HashSet
		//Esto no debe interesarme
		//si lo que quiero es que este ordenado utilio mejor un array
//		for (String superHeoe : superHeroes) {
//			System.out.println(System.identityHashCode(superHeroe));
//		}
		
		//Iteramos los valores de superheroes
		superHeroes.forEach(heroe -> System.out.println("Heroe: " + heroe));
		
		
	}

}
