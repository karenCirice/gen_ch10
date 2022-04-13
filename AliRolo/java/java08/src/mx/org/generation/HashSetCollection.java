package mx.org.generation;

import java.util.HashSet;

public class HashSetCollection {

	public static void main (String[] args) {
		//Un ser, es una colleción NO ORDENADA de elemntos
		//No se permite elementos duplicados
		//Por lo que cualquier elemento duplicado no se insertará
		
		//Definimos un HashSet de tipo String.
		
		HashSet<String> superHeroes = new HashSet <String>();
		//Agregamos valores al HashSet
		
		superHeroes.add("Rombo Calcetines Man");
		superHeroes.add("Thor");
		superHeroes.add("LaddyBug");
		superHeroes.add("Porfirio Cadenas");
		superHeroes.add("Caliman");
		superHeroes.add("Chapulin Colorado");
		
		System.out.println(superHeroes);
		
		//Desplegar la longitus
		
		int longitud = superHeroes.size();
		System.out.println("Longitud total : " + longitud);
		
		//Verificar si contiene un elemento
		boolean contieneNombre = superHeroes.contains("Caliman");
		System.out.println("Contiene caliman?" + contieneNombre);
		
		//Removemos un elemento
		superHeroes.remove("Thor");
		superHeroes.add("Caliman");
		superHeroes.add("Caliman");
		System.out.println(superHeroes);
		//Obtener el HashCode de los elementos HashSet
	
		//for (String superHeroe : superHeroes) {
		//	System.out.println(System.identifyHashCode(superHeroe));
	
		//Iteramos los valores de superHeroes
		
		superHeroes.forEach(heroe -> System.out.println("Heroe: "+ heroe));
}}
