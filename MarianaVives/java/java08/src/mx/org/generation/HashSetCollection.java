/**
 * 
 */
package mx.org.generation;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		//Un SET es una colección NO ORDENADA de elementos
		//No permite elemento duplicados.
		//Porlo que cualquier elemento duplicado no se insertará.
		
		//Definimos un HasSet de tipo String.
		HashSet<String> superheroes = new HashSet<String>();
		
		//Agregamos valores al HashSet
		superheroes.add("Rombo Calcetines Man");
		superheroes.add("Thor");
		superheroes.add("LadyBug");
		superheroes.add("Aquaman");
		superheroes.add("WonderWoman");
		System.out.println(superheroes);
		
		//Desplegar la longitud
		int longitud = superheroes.size();
		System.out.println("Longitud total : + longitud");
		
		//Verificar si contiene un elemento
		boolean contieneNombre = superheroes.contains("Aquaman");
		System.out.println("Contiene Aquaman? " + contieneNombre);
		
		//Removemos un elemento
		superheroes.remove("Thor");
		superheroes.add("Aquaman");
		superheroes.add("Aquaman");
		System.out.println(superheroes);
		
		//Obtener el HashCode de los elementos HashSet
		//for (String superheroe: superheroes){
//		System.out.println(System.identityHashCode(superheroes));
//	}
	//Iteramos los valores de superHeroes.
		superheroes.forEach(heroe -> System.out.println("Heroe :" + heroe));
	}

}
