package mx.org.generation;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		// Un SET, es una coleccion NO ORDENADA de elementos
		// No se permite elementos duplicados.
		//Por lo que cualquier elemento duplicado
		
		//Definimos un HasSet de tipo string.
		HashSet<String> superHeroes = new HashSet<String>();
		
		//Agregamos valores al HashSet
		superHeroes.add("Calcentin Rombos Man");
		superHeroes.add("Thor");
		superHeroes.add("LadyBug");
		superHeroes.add("Porfirio Cadena");
		superHeroes.add("Caliman");
		superHeroes.add("Chapulin Colorado");
		System.out.println(superHeroes);
		
		//Desplegar la longuitud
		int longuitud = superHeroes.size();
		
		//Verificar si contiene un elemento
		boolean contieneNombre = superHeroes.contains("Caliman");
		System.out.println("Contiene Caliman? "+ contieneNombre);
		
		//Removemos un elemento
		superHeroes.remove("Thor");
		superHeroes.add("Caliman");
		superHeroes.remove("Caliman");
		System.out.println(superHeroes);
		
		//Obtener el HashCode de los elementos HashSet
//		for (String superHeroe : superHeroes) {
//			System.out.println(System.identityHashCode(superHeroe));
//		}
	
		//Iterammos los valores de superHeroes.
		superHeroes.forEach(heroe -> System.out.println("Heroe : "+heroe));
		
		

	}

}
