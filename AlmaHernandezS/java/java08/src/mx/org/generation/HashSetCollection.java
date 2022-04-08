package mx.org.generation;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		// Un SET, es una coleccion NO ORDENADA de elementos
		  // NO se permiten elementos duplicados.
		  // Por lo que cualquier elemento duplicado no se insertara.
		  
		  // Definimos un HashSet de tipo string
		  HashSet<String> superHeroes = new HashSet<String>();
		  
		  // Agregamos valores al HashSet
		  superHeroes.add("Calcetin con Rombos man");
		  superHeroes.add("Thor");
		  superHeroes.add("Iron Man");
		  superHeroes.add("Porfirio Cadenas");
		  superHeroes.add("Caliman");
		  superHeroes.add("Chapulin Colorado");
		  System.out.println(superHeroes); // Se ordenan por su hashcode
		 
		  // Desplegar la longitud
		  int longitud = superHeroes.size();
		  System.out.println("Longitud total: " + longitud);
		  
		  // Verificar si contiene un elemento
		  boolean contieneNombre = superHeroes.contains("Caliman");
		  System.out.println("Contiene Caliman?: " +contieneNombre);
		  //Remove un elemento
		  superHeroes.remove("Thor");
		  superHeroes.add("Caliman");
		  superHeroes.add("Caliman");
		  System.out.println(superHeroes);
		  
		  //Obtener el HashCode de los elementos HashSet
		 // for (String superHeroe : superHeroes) {
		 //   System.out.println(System.identityHashCode(superHeroe));
		 //}
		  
		  //Iteramos los valores de superHeroes.
		  superHeroes.forEach(heroe -> System.out.println("Heroe : "+ heroe));
		 

	}

}
